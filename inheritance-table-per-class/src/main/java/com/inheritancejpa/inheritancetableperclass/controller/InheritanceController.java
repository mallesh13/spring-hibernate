package com.inheritancejpa.inheritancetableperclass.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inheritancejpa.inheritancetableperclass.dao.EmployeeDao;
import com.inheritancejpa.inheritancetableperclass.dao.SportsManDao;
import com.inheritancejpa.inheritancetableperclass.entity.Employee;
import com.inheritancejpa.inheritancetableperclass.entity.SportsMan;

@RestController
public class InheritanceController {
 
	@Autowired
	private EmployeeDao employeeDao;
	@Autowired
	private SportsManDao sportsManDao;
	
	@RequestMapping("/add")
	public Employee add() {
		Employee employee=new Employee(101, "jhon", 25000);
		employeeDao.save(employee);
		return employee;
		
	}
	@RequestMapping("/sp")
	public SportsMan addman() {
	SportsMan man=new SportsMan(101, "jhon", "Cricket");
		sportsManDao.save(man);
		return man;
		
	}
}
