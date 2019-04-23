package com.capgemini.inheritancejoin.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.inheritancejoin.entity.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
