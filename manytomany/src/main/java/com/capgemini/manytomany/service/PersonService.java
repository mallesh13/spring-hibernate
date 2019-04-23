package com.capgemini.manytomany.service;

import java.util.List;
import java.util.Set;

import com.capgemini.manytomany.entity.Person;
import com.capgemini.manytomany.entity.Project;

public interface PersonService {
	
		void addPerson(Set<Person> person);
		void addProject(Set<Project> project);
		Person get(int personId);
		List<Person> getAll();
		
}
