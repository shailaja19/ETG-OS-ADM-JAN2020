package com.sonata;

import java.util.LinkedList;

public class UserEmployee {
	public static void main(String args[])
	 {
		 Employee emp=new Employee();
		 emp.setEmpId(18306);
		 emp.setEmpName("hampi");
		 emp.setEmpSal(5000);
		 
		 Employee emp1=new Employee();
		 emp1.setEmpId(18318);
		 emp1.setEmpName("sonu");
		 emp1.setEmpSal(6000);
		 
		 
		 Employee emp3=new Employee();
		 emp3.setEmpId(18311);
		 emp3.setEmpName("bhagya");
		 emp3.setEmpSal(70000);
		
		 EmployeeImpl em= new EmployeeImpl();
		 em.addEmployee(emp);
		 
		 EmployeeImpl em1= new EmployeeImpl();
		 em1.addEmployee(emp1);
		 
		 EmployeeImpl em2= new EmployeeImpl();
		 em2.addEmployee(emp3);
		 
		 em.deleteEmployee(emp);
		 
		double sal= em.appSalary(emp3);
		System.out.println("App salary of employee = "+sal);
		
		
		double sal1= em.yearSalary(emp3);
		System.out.println("yearly salary of employee = "+sal1);
	 }

}
