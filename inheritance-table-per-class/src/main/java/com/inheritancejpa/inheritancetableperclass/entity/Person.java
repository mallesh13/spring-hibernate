package com.inheritancejpa.inheritancetableperclass.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Person {

	@Id
	private int personId;
	private String PerosnName;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int personId, String perosnName) {
		super();
		this.personId = personId;
		PerosnName = perosnName;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPerosnName() {
		return PerosnName;
	}
	public void setPerosnName(String perosnName) {
		PerosnName = perosnName;
	}
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", PerosnName=" + PerosnName + "]";
	}
	
}
