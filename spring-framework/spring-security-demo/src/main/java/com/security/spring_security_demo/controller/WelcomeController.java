package com.security.spring_security_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	
	@GetMapping
	public String welcome() {
		return "Spring-Security-demo";
	}

}
