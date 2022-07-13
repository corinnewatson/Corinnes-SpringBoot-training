package com.in28minutes.springboot.web.jpa;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ch.qos.logback.classic.Logger;

// Initializes data at the beginning of the program
@Component
public class UserCommandLineRunner implements CommandLineRunner {

	@Autowired
	private UserRepository repository;
	
	  private static final org.slf4j.Logger log = LoggerFactory.getLogger(UserCommandLineRunner.class);

	
	 @Override
	    public void run(String... args) {
	        // save a couple of customers
	        repository.save(new User("Ranga", "Admin"));
	        repository.save(new User("Ravi", "User"));
	        repository.save(new User("Satish", "Admin"));
	        repository.save(new User("Raghu", "User"));

	        log.info("-------------------------------");
	        log.info("Finding all users");
	        log.info("-------------------------------");
	        for (User user : repository.findAll()) {
	            log.info(user.toString());
	        }
		
	}

}
