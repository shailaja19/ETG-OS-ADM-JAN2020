package com.sonata.Assignment4;

public class Employee {
 int empId;
 String empName;
 public Employee(int empId, String empName, double empSal) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.empSal = empSal;
}

double empSal;

@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
}
 
}
