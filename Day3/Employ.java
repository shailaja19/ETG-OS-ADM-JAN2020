package com.sonata.day3;

public abstract class Employ {

	int empId;
	String empName;
	Address obj;
	double BasicPay;
	int nol;
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
	public Address getObj() {
		return obj;
	}
	public void setObj(Address obj) {
		this.obj = obj;
	}
	public double getBasicPay() {
		return BasicPay;
	}
	public void setBasicPay(double basicPay) {
		BasicPay = basicPay;
	}
	public int getNol() {
		return nol;
	}
	public void setNol(int nol) {
		this.nol = nol;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", obj=" + obj + ", BasicPay=" + BasicPay
				+ ", nol=" + nol + "]";
	}
	
	public abstract void calculateSalary();
	
	abstract void display();
	
}
