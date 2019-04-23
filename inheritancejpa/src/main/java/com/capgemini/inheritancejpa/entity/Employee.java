package com.capgemini.inheritancejpa.entity;

import javax.persistence.Entity;

@Entity
public class Employee extends Person {
	
	private int employeeId;
	private double salary;
	 
	public Employee() {
		
	}
	public Employee(int personId ,String personName,int employeeId, double salary) {
		super(personId,personName);
		this.employeeId = employeeId;
		this.salary = salary;
	}
	

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", salary=" + salary + "]";
	}

}
