package com.capgemini.onemany.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Person {

	@Id
	private int personId;
	private String personName;
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Certificates> certificate;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int personId, String personName, Set<Certificates> certificate) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.certificate = certificate;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public Set<Certificates> getCertificate() {
		return certificate;
	}

	public void setCertificate(Set<Certificates> certificate) {
		this.certificate = certificate;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", certificate=" + certificate + "]";
	}

}
