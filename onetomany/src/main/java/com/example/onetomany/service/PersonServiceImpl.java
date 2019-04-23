package com.example.onetomany.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onetomany.dao.PersonDao;
import com.example.onetomany.entity.Certificate;

@Service
public class PersonServiceImpl implements PersonService{

	@Autowired
	private PersonDao persondao;
	@Override
	public void add(Certificate certificate) {
		
		persondao.save(certificate);
	}

	@Override
	public Certificate display(int personId) {
		// TODO Auto-generated method stub
		return persondao.findById(personId).get();
	}

	@Override
	public void delete(int personId) {
		// TODO Auto-generated method stub
		persondao.deleteById(personId);
	}

	@Override
	public List<Certificate> getAll() {
		// TODO Auto-generated method stub
		return persondao.findAll();
	}

	
}
