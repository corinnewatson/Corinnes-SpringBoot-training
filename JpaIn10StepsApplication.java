package com.in28minutes.learning.jpa.jpain10steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class JpaIn10StepsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaIn10StepsApplication.class, args);
	}

}
