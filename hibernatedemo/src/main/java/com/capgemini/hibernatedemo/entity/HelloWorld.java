package com.capgemini.hibernatedemo.entity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorld {
	
	@RequestMapping("/")
	public String display() {
		
		return "Welcome to Hibernate...";
	}
	
}
