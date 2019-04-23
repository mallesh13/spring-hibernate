package com.capgemini.onemany.service;

import java.util.List;

import com.capgemini.onemany.entity.Person;

public interface PersonService {
	
	void addPerson(Person person);
	Person getPerson(int personId);
	List<Person> getAll();
	void delete(int personId);
}
