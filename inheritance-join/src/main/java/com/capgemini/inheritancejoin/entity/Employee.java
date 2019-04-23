package com.capgemini.inheritancejoin.entity;

import javax.persistence.Entity;

@Entity
public class Employee extends Person {

	private double salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int personId, String personName, double salary) {
		super(personId, personName);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + "]";
	}

	
	
}
