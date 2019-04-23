package com.capgemini.personjpa.service;

import com.capgemini.personjpa.entity.Person;

public interface PersonService {
	
	void addPerson(Person person);
	Person getPerson(int personId);
}
