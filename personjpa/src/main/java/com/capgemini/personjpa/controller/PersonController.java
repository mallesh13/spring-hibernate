package com.capgemini.personjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.personjpa.entity.Person;
import com.capgemini.personjpa.service.PersonService;


@RestController
public class PersonController {

	@Autowired
	private PersonService service;

	@RequestMapping("/")
	public String newPerson() {
		Person person = new Person(101, "hello");
		service.addPerson(person);
		return "success..!";
	}

	@RequestMapping("/get")
	public Person get() {
		Person p = service.getPerson(101);
		return p;
	}

}
