package com.in28minutes.springboot.web.jpa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

// creates a user repo to perform crud operations on user profiles
public interface UserRepository extends CrudRepository<User, Long> {

	List<User> findByRole(String role);
}
