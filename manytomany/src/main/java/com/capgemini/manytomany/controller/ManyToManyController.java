package com.capgemini.manytomany.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.manytomany.entity.Person;
import com.capgemini.manytomany.entity.Project;
import com.capgemini.manytomany.service.PersonService;

@RestController
public class ManyToManyController {

	@Autowired
	private PersonService service;
	
	@RequestMapping("/")
	public String add()throws Exception {
		
		Set<Person> persons1= new HashSet<Person>();
		Set<Person> persons2= new HashSet<Person>();
		Set<Person> persons3= new HashSet<Person>();
		
		Set<Project> projects1= new HashSet<Project>();
		Set<Project> projects2= new HashSet<Project>();
		Set<Project> projects3= new HashSet<Project>();
		
		
		Person p1=new Person(101, "hello");
		Person p2=new Person(102, "haii");
		Person p3=new Person(103, "byee");
		
		Project proj1=new Project(5001, "C");
		Project proj2=new Project(5002, "C++");
		Project proj3=new Project(5003, "C#");
	
		persons1.add(p1);
		persons1.add(p2);
		persons2.add(p3);
		persons3.add(p1);
		
		proj1.setPerson(persons1);
		proj2.setPerson(persons2);
		proj3.setPerson(persons3);
		
		
		projects1.add(proj1);
		projects1.add(proj3);
		projects2.add(proj2);
		projects3.add(proj3);
		
		service.addPerson(persons1);
		service.addPerson(persons2);
		service.addPerson(persons3);
		
		service.addProject(projects1);
		service.addProject(projects2);
		service.addProject(projects3);
		
		return "added";
	}
	
	@RequestMapping("/get")
	public Person get() {
		
		return service.get(101);
	}
	
	@RequestMapping("/all")
	public List<Person> all() {
		return service.getAll();
	}
	
	
}
