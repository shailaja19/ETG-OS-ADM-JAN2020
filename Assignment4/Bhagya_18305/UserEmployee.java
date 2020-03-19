package com.sonata.Assignment4;

public class UserEmployee {
	public static void main(String args[])
	 {
		 Employee emp1=new Employee(18306,"hampi",5000);
		 Employee emp2=new Employee(18305,"Bhagya",25000);
		 Employee emp3=new Employee(18308,"Sonu",15000);
		 
		 
		 EmployeeImpl em= new EmployeeImpl();
		 em.addEmployee(emp1);
		 em.addEmployee(emp2);
		 em.addEmployee(emp3);
		 
		 em.deleteEmployee(emp1);
		 
		double sal= em.appSalary(emp3);
		System.out.println("App salary of employee = "+sal);
		
		
		double sal1= em.yearSalary(emp3);
		System.out.println("yearly salary of employee = "+sal1);
	 }

}
