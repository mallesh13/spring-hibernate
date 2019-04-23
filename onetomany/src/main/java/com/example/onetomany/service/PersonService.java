package com.example.onetomany.service;

import java.util.List;
import java.util.Set;

import com.example.onetomany.entity.Certificate;

public interface PersonService {

	void add(Certificate certificate);
	Certificate display(int personId);
	void delete(int personId);
	List<Certificate> getAll();
}
