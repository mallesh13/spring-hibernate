package com.capgemini.onemany.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.onemany.dao.PersonDao;
import com.capgemini.onemany.entity.Person;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonDao personDao;
	
	@Override
	public void addPerson(Person person) {
		// TODO Auto-generated method stub
		personDao.save(person);
	}

	@Override
	public Person getPerson(int personId) {
		
		return personDao.findById(personId).get();
	}

	@Override
	public List<Person> getAll() {
		
		return personDao.findAll();
	}

	@Override
	public void delete(int personId) {
		// TODO Auto-generated method stub
		 personDao.deleteById(personId);
	}

}
