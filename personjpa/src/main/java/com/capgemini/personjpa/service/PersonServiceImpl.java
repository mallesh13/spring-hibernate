package com.capgemini.personjpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.personjpa.dao.PersonDao;
import com.capgemini.personjpa.entity.Person;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonDao personDao;


	@Override
	public void addPerson(Person person) {
		
		personDao.save(person);

	}

	@Override
	public Person getPerson(int personId) {

		return personDao.findById(personId).get();
	}

}
