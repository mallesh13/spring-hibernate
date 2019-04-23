package com.capgemini.onetoonejpa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Profile {

	@Id
	private int profileId;
	private String desc;
	@OneToOne(mappedBy = "profile")
	private Person person;

	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Profile(int profileId, String desc) {
		super();
		this.profileId = profileId;
		this.desc = desc;

	}

	public int getProfileId() {
		return profileId;
	}

	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "Profile [profileId=" + profileId + ", desc=" + desc + ", person=" + person + "]";
	}

}
