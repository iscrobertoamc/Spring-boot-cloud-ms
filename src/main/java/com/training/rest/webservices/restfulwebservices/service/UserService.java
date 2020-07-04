package com.training.rest.webservices.restfulwebservices.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.training.rest.webservices.restfulwebservices.model.User;

@Component
public class UserService {
	private static List<User> users = new ArrayList<>();
	private static int usersCount=3;
	static {
		users.add(new User(1, "Adam", new Date()));
		users.add(new User(2, "Eve", new Date()));
		users.add(new User(3, "Jack", new Date()));
	}
	
	public List<User> findAll(){
		return users;
	}
	
	public User save(User user) {
		if(user.getId()==null) {
			user.setId(++usersCount);
		}
		users.add(user);
		return user;
	}
	
	public User findOne(int id) {
		return users.stream().filter(t->t.getId()==id).findFirst().orElse(null);
	}
	
	public User deleteById(int id) {
		User user = users.stream().filter(t->t.getId()==id).findFirst().orElse(null);
		if(user!=null) {
			users.remove(user);
		}
		return user;
	}
}
