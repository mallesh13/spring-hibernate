package com.capgemini.personjpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.personjpa.entity.Person;

public interface PersonDao extends JpaRepository<Person, Integer>{

}
