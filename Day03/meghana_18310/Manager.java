package com.sonata.assignment03;

public class Manager extends EmployeeSal {

	public Manager(int empId, String empName, int empSal) {
		super(empId, empName, empSal);
		// TODO Auto-generated constructor stub
	}
	
	
	public void salCal( ) {
		
		System.out.println("Manager salary:"+empSal);
		
	}
	
	

}
