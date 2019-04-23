package com.example.onetomany.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onetomany.entity.Certificate;

public interface PersonDao extends JpaRepository<Certificate, Integer> {

}
