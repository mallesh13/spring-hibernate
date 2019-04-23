package com.example.onetomany.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Certificate {

	@Id
	private int certificateId;
	private String certificateCourse;
	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name="personId")
	private List<Person> person;

	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Certificate(int certificateId, String certificateCourse, List<Person> person) {
		super();
		this.certificateId = certificateId;
		this.certificateCourse = certificateCourse;
		this.person = person;
	}

	public int getCertificateId() {
		return certificateId;
	}

	public void setCertificateId(int certificateId) {
		this.certificateId = certificateId;
	}

	public String getCertificateCourse() {
		return certificateCourse;
	}

	public void setCertificateCourse(String certificateCourse) {
		this.certificateCourse = certificateCourse;
	}

	public List<Person> getPerson() {
		return person;
	}

	public void setPerson(List<Person> person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Certificate [certificateId=" + certificateId + ", certificateCourse=" + certificateCourse + ", person="
				+ person + "]\n";
	}

}
