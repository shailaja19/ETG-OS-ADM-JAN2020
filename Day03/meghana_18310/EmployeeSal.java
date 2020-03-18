/*1) Create a Employee class with below properties and methods
empId, empName,empSal and public void display(){} , 
public void salCal(){} implement the inheritance 
& polymorphism functionality for Manager ,Developer, Tester class override the SalCal function.
 * 
 */

package com.sonata.assignment03;

public class EmployeeSal {
	
	int empId;
	String empName;
	int empSal;
	
	
	
	public EmployeeSal(int empId, String empName, int empSal) {
		//super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}



	public void display() {
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(empSal);
		
		
	}
	
	public void salCal( ) {
		System.out.println("The salary of the employee is: "+empSal);
		
	}
	

}
