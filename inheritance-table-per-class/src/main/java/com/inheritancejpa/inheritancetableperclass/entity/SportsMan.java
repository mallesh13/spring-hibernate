package com.inheritancejpa.inheritancetableperclass.entity;

import javax.persistence.Entity;

@Entity
public class SportsMan extends Person {

	private String gameName;

	public SportsMan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SportsMan(int personId, String perosnName, String gameName) {
		super(personId, perosnName);
		this.gameName = gameName;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	@Override
	public String toString() {
		return "SportsMan [gameName=" + gameName + "]";
	}

}
