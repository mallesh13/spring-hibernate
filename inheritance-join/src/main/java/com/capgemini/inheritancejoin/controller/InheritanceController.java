package com.capgemini.inheritancejoin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.inheritancejoin.dao.EmployeeDao;
import com.capgemini.inheritancejoin.entity.Employee;

@RestController
public class InheritanceController {

	@Autowired
	private EmployeeDao dao;
	
	
	@RequestMapping("/add")
	public String add() {
		Employee employee=new Employee(101,"Sunny",25000);
		dao.save(employee);
		return "added";
	}
	
	@RequestMapping("/get")
	public Employee get() {
		return dao.findById(101).get();
	}
}
