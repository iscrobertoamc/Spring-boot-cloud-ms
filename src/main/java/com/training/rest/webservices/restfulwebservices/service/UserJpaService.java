package com.training.rest.webservices.restfulwebservices.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.training.rest.webservices.restfulwebservices.model.User;
import com.training.rest.webservices.restfulwebservices.repository.UserRepository;

@Component
public class UserJpaService {
	@Autowired
	private UserRepository userRepository;

	public List<User> findAll() {
		return userRepository.findAll();
	}

	public User save(User user) {
		return userRepository.save(user);
	}

	public User findById(int id) {
		return userRepository.findById(id).orElse(null);
	}

	public void deleteById(int id) {
		userRepository.deleteById(id);
	}
}
