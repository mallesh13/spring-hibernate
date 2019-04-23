package com.capgemini.manytomany.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Project {

	@Id
	@Column(name="projectId")
	private int projectId;
	private String projectName;
	
	@ManyToMany
	@JoinTable(name="person_project",joinColumns = { @JoinColumn(name = "projectId") }, inverseJoinColumns = {
			@JoinColumn(name = "personId") })
	private Set<Person> person;

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(int projectId, String projectName) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	

	public void setPerson(Set<Person> person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName  + "]";
	}
	
	
	
}
