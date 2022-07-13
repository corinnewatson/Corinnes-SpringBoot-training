package com.in28minutes.springboot.web.jpa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

// creates a user repo to perform crud operations on user profiles

@RepositoryRestResource(path="users", collectionResourceRel="users")
public interface UserRestRepository extends PagingAndSortingRepository<User, Long> {

	List<User> findByRole(String role);
}
