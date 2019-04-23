package com.capgemini.onemany.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.onemany.entity.Person;

public interface PersonDao extends JpaRepository<Person, Integer>{

}
