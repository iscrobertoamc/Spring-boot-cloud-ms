package com.training.rest.webservices.restfulwebservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.rest.webservices.restfulwebservices.model.Post;

public interface PostRepository extends JpaRepository<Post, Integer>{

}
