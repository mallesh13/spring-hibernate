package com.capgemini.onemany.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Certificates {

	@Id
	private int certificateId;
	private String certificateName;
	public Certificates() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Certificates(int certificateId, String certificateName) {
		super();
		this.certificateId = certificateId;
		this.certificateName = certificateName;
	}
	
	
	
	public int getCertificateId() {
		return certificateId;
	}
	public void setCertificateId(int certificateId) {
		this.certificateId = certificateId;
	}
	public String getCertificateName() {
		return certificateName;
	}
	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}
	@Override
	public String toString() {
		return "Certificates [certificateId=" + certificateId + ", certificateName=" + certificateName + "]";
	}
	
	
}
