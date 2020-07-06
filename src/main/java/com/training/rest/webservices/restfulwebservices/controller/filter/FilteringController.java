package com.training.rest.webservices.restfulwebservices.controller.filter;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.actuate.info.MapInfoContributor;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.training.rest.webservices.restfulwebservices.model.SomeBean;

@RestController
public class FilteringController {

	@GetMapping(path="filtering")
	public MappingJacksonValue retrieveSomeBean() {
		SomeBean someBean = new SomeBean("value1", "value2", "value3");
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter
				.filterOutAllExcept("field1", "field2");
		MappingJacksonValue mapping = new MappingJacksonValue(someBean);
		FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);
		mapping.setFilters(filters);
		
		return mapping;
	}
	
	@GetMapping(path="filtering-list")
	public MappingJacksonValue retrieveListOfSomeBean() {
		List<SomeBean> list = Arrays.asList(new SomeBean("value1", "value2", "value3"),
				new SomeBean("value1", "value2", "value3"));
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter
				.filterOutAllExcept("field2", "field3");
		MappingJacksonValue mapping = new MappingJacksonValue(list);
		FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);
		mapping.setFilters(filters);
		
		return mapping;
	}
	
	
	
	
}
