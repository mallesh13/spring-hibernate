package com.capgemini.onetoonejpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.onetoonejpa.dao.PersonDao;
import com.capgemini.onetoonejpa.entity.Person;
import com.capgemini.onetoonejpa.entity.Profile;

@RestController
public class OneToOneController {

	@Autowired
	private PersonDao dao;

	@RequestMapping("/add")
	public String add() {
		Person person = new Person(101, "hello", new Profile(201, "fgh"));
		dao.save(person);
		return "success..!";
	}

	@RequestMapping("/get")
	public Person get() {
		return dao.findById(101).get();
	}

}
