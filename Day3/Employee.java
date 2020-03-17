package com.sonata.day3;

public class Employee {

	int empId;
	String empName;
	double empSal; 
	public void display()
	{
      System.out.println(empId);
      System.out.println(empName);
      System.out.println(empSal);
	}
	public void salCal()
	{
		System.out.println("The employee salary = "+empSal);
	} 
}
