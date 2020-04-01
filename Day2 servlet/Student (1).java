package com.sonata.Students;

public class Student {
	int stdId;
	String stdName;
	int stdMarks;
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
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdMarks=" + stdMarks + "]";
	}
	
	
	
	
	

}
