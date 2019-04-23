package com.example.onetomany.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.onetomany.entity.Certificate;
import com.example.onetomany.entity.Person;
import com.example.onetomany.service.PersonService;

@RestController
public class OnetoManyController {

	@Autowired
	private PersonService service;

	@RequestMapping("/")
	public String addNew() {
		
		Person person1 = new Person(1001, "hell");
		Person person2= new Person(1002,"hello");
		Person person3 = new Person(1003, "he");
		Person person4= new Person(1004,"hii");

		List<Person> set= new ArrayList<Person>();
		set.add(person1);
		set.add(person2);
		List<Person> set1= new ArrayList<Person>();
		set1.add(person1);
		set1.add(person2);
		set1.add(person3);
		set1.add(person4);
	
		Certificate certificate1=new Certificate(5001, "C", set);
		Certificate certificate2=new Certificate(5003, "C++", set1);
		service.add(certificate1);
		service.add(certificate2);
		return "success";
	}
	
	@RequestMapping("/get")
	public Certificate get() {
		
		return service.display(5003);
	}
	
	@RequestMapping("/del")
	public String remove() {
		
		 service.delete(5003);
		 return "deleted";
	}
	
	@RequestMapping("/all")
	public List<Certificate> getAll(){
		return service.getAll();
	}
	
}
