package com.capgemini.inheritancejpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.inheritancejpa.dao.PersonDao;
import com.capgemini.inheritancejpa.entity.Employee;

@RestController
public class InheritanceController {

	@Autowired
	private PersonDao personDao;
	
	@RequestMapping("/")
	public String add() {
		
		Employee employee=new Employee(5001,"Andrew",1001, 25000);
		personDao.save(employee);
		
		return "added";
	}
	
	@RequestMapping("/get")
	public Employee get() {
		return personDao.findById(5001).get();
	}
}
