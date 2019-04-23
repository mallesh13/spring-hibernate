package com.inheritancejpa.inheritancetableperclass.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inheritancejpa.inheritancetableperclass.entity.SportsMan;

public interface SportsManDao extends JpaRepository<SportsMan, Integer>{

}
