package com.capgemini.manytomany.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Person {

	@Id
	@Column(name = "personId")
	private int personId;
	private String personName;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="person_project",joinColumns = { @JoinColumn(name = "personId") }, inverseJoinColumns = {
			@JoinColumn(name = "projectId") })
	private Set<Project> project;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int personId, String personName) {
		super();
		this.personId = personId;
		this.personName = personName;

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

	public Set<Project> getProject() {
		return project;
	}

	public void setProject(Set<Project> project) {
		this.project = project;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + "]\n";
	}
	
	
}
