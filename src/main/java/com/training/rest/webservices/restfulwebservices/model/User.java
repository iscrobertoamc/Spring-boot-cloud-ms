package com.training.rest.webservices.restfulwebservices.model;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="All details about the user.")
public class User {
	
	
	private Integer Id;
	
	@Size(min=2, message="Name should have at least 2 characters")
	@ApiModelProperty(notes="Name should have at least 2 characters")
	private String name;
	@Past
	@ApiModelProperty(notes="Birth date shoud be in the past")
	private Date birthDate;
	
	
	
	
	
	public User(Integer id, String name, Date birthDate) {
		super();
		Id = id;
		this.name = name;
		this.birthDate = birthDate;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
}