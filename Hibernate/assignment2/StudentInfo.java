package com.sonata;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="getStudentInfo.byId",query="select  from StudentInfo ")
public class StudentInfo {
	@Id
	private int stdId;
	private String stdName;
	private int stdMarks;
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public int getStdMarks() {
		return stdMarks;
	}
	public void setStdMarks(int stdMarks) {
		this.stdMarks = stdMarks;
	}
	
	

}
