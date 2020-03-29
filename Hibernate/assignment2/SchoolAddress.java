package com.sonata;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="SCHOOL_ADDRESS")
public class SchoolAddress {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int schoolID;
	private String schoolName;
	
	@ManyToOne
	private SchoolStudent schoolstudent;

	public int getSchoolID() {
		return schoolID;
	}

	public void setSchoolID(int schoolID) {
		this.schoolID = schoolID;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public SchoolStudent getSchoolstudent() {
		return schoolstudent;
	}

	public void setSchoolstudent(SchoolStudent schoolstudent) {
		this.schoolstudent = schoolstudent;
	}
	
	
	
	
	
	

}
