package com.in28minutes.springboot.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//Spring dependency injection using the component annotation
@Component
class WelcomeService{
	
	@Value("${welcome.message}")
	private String welcomeMessage;
	
	public String retrieveWelcomeMessage() {
		
		return "welcomeMessage";
	}
}
