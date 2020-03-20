package com.sonata.Day5;

import java.io.Serializable;



public class Employee implements Serializable {
	
	private int empId;
	private String empName;
	private transient String empAdd;
	private static double empsal;
	public Employee(int empId, String empName, String empAdd) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAdd = empAdd;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAdd() {
		return empAdd;
	}
	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}
	public static double getEmpsal() {
		return empsal;
	}
	public static void setEmpsal(double empsal) {
		Employee.empsal = empsal;
	}
	
	
	         

}