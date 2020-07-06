package com.training.rest.webservices.restfulwebservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.rest.webservices.restfulwebservices.versioning.v2.Name;



@RestController
public class PersonVersioningController {

	@GetMapping("v1/person")
	public com.training.rest.webservices.restfulwebservices.versioning.v1.Person personV1() {
		return new com.training.rest.webservices.restfulwebservices.versioning.v1.Person("Person name");
	}
	
	@GetMapping("v2/person")
	public com.training.rest.webservices.restfulwebservices.versioning.v2.Person personV2() {
		return new com.training.rest.webservices.restfulwebservices.versioning.v2.Person(new Name("Person","Name"));
	}
	
	@GetMapping(value="person/param", params="version=1")
	public com.training.rest.webservices.restfulwebservices.versioning.v1.Person personParamV1() {
		return new com.training.rest.webservices.restfulwebservices.versioning.v1.Person("Person name");
	}
	
	@GetMapping(value="person/param", params="version=2")
	public com.training.rest.webservices.restfulwebservices.versioning.v2.Person personParamV2() {
		return new com.training.rest.webservices.restfulwebservices.versioning.v2.Person(new Name("Person","Name"));
	}
	
	@GetMapping(value="person/header", headers="X-API-VERSION=1")
	public com.training.rest.webservices.restfulwebservices.versioning.v1.Person personHeaderV1() {
		return new com.training.rest.webservices.restfulwebservices.versioning.v1.Person("Person name");
	}
	
	@GetMapping(value="person/header", headers="X-API-VERSION=2")
	public com.training.rest.webservices.restfulwebservices.versioning.v2.Person personHeaderV2() {
		return new com.training.rest.webservices.restfulwebservices.versioning.v2.Person(new Name("Person","Name"));
	}
	
	@GetMapping(value="person/produces", produces="application/vnd.company.app-v1+json")
	public com.training.rest.webservices.restfulwebservices.versioning.v1.Person producesV1() {
		return new com.training.rest.webservices.restfulwebservices.versioning.v1.Person("Person name");
	}
	
	@GetMapping(value="person/produces", produces="application/vnd.company.app-v2+json")
	public com.training.rest.webservices.restfulwebservices.versioning.v2.Person producesV2() {
		return new com.training.rest.webservices.restfulwebservices.versioning.v2.Person(new Name("Person","Name"));
	}
	
	
}
