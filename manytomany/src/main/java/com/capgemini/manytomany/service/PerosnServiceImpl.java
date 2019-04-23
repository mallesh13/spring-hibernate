
package com.capgemini.manytomany.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.manytomany.dao.PersonDao;
import com.capgemini.manytomany.dao.ProjectDao;
import com.capgemini.manytomany.entity.Person;
import com.capgemini.manytomany.entity.Project;

@Service
public class PerosnServiceImpl implements PersonService {

	@Autowired
	private PersonDao personDao;
	@Autowired
	private ProjectDao projectDao;
	
	@Override
	public Person get(int personId) {
		
		return personDao.findById(personId).get();
	}

	@Override
	public List<Person> getAll() {
		
		return personDao.findAll();
	}

	@Override
	public void addPerson(Set<Person> person) {
		// TODO Auto-generated method stub
		personDao.saveAll(person);
	}

	@Override
	public void addProject(Set<Project> project) {
		// TODO Auto-generated method stub
		projectDao.saveAll(project);
	}

}
