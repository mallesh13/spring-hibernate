package com.capgemini.inheritancejpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.inheritancejpa.entity.Employee;

@Repository
public interface PersonDao extends JpaRepository<Employee, Integer>{

}
