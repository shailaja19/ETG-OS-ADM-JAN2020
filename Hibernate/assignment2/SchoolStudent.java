package com.sonata;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="SCHOOL_STUDENT")
public class SchoolStudent {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int studId;
	private String studName;
	
	@OneToMany
	List<SchoolAddress> address=new ArrayList<SchoolAddress>();

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public List<SchoolAddress> getAddress() {
		return address;
	}

	public void setAddress(List<SchoolAddress> address) {
		this.address = address;
	}
	
	

}
