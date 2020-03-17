package com.sonata.day3;

public class TechEmp extends Employ {
	public void calculateSalary()
	{
		double hra=BasicPay*0.12;
		double salary=BasicPay+hra;
		System.out.println("the salary of Tecnicalstaff:"+salary);
	}
     public void display()
	{
		System.out.println("EmployeeId:"+empId);
		System.out.println("EmployeeId:"+empName);
	}

}
