package com.capgemini.onetoonejpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.onetoonejpa.entity.Person;

public interface PersonDao extends JpaRepository<Person, Integer>{

}
