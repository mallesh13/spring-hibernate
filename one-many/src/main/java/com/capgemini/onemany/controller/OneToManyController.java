package com.capgemini.onemany.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.onemany.entity.Certificates;
import com.capgemini.onemany.entity.Person;
import com.capgemini.onemany.service.PersonService;

@RestController
public class OneToManyController {

	@Autowired
	private PersonService service;
	
	@RequestMapping("/")
	public String add() {
		
		Certificates certificate1=new Certificates(5001, "C");
		Certificates certificate2=new Certificates(5002, "C++");
		Certificates certificate3=new Certificates(5003, "C#");
		Certificates certificate4=new Certificates(5004, "Java");
		
		Set<Certificates> s1 =new HashSet<Certificates>();
		s1.add(certificate1);
		s1.add(certificate3);
		
		Set<Certificates> s2 =new HashSet<Certificates>();
		s2.add(certificate2);
		s2.add(certificate4);
		
		Person person1= new Person(101, "hello", s1);
		service.addPerson(person1);
		
		Person person2=new Person(102, "hii", s2);
		service.addPerson(person2);
		return "added";
	}
	
	@RequestMapping("/get")
	public Person get() {
		return service.getPerson(102);
	}
	
	@RequestMapping("/all")
	public List<Person> getAll() {
		return service.getAll();
	}
	
	@RequestMapping("/del")
	public String delete() {
		 service.delete(101);
		 return "deleted";
		 
	}
	
	
	
}
