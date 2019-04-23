package com.inheritancejpa.inheritancetableperclass.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inheritancejpa.inheritancetableperclass.entity.Employee;


public interface EmployeeDao extends JpaRepository<Employee, Integer>{

}
