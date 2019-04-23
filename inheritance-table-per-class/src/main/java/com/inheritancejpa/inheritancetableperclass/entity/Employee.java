package com.inheritancejpa.inheritancetableperclass.entity;

import javax.persistence.Entity;

@Entity
public class Employee extends Person {

	private double salry;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int personId, String perosnName, double salry) {
		super(personId, perosnName);
		this.salry = salry;
	}

	public double getSalry() {
		return salry;
	}

	public void setSalry(double salry) {
		this.salry = salry;
	}

	@Override
	public String toString() {
		return "Employee [salry=" + salry + "]";
	}

	
}
