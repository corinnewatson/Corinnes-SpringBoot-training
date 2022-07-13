package com.in28minutes.learning.jpa.jpain10steps.service;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<com.in28minutes.learning.jpa.jpain10steps.entity.User, Long > {


}
