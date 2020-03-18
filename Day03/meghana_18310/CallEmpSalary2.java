package com.sonata.assignment03;

public class CallEmpSalary2 {

	public static void main(String[] args) {
		
		 int salary=10009;
		        try
		        { 
		        	if(salary<100000)
		           
		            throw new EmpSalary("Employee annual salary less than 1,00,000"); 
		        	
		        	else
		        	{
		        		System.out.println("Your annual salary is: "+salary);
		        	}
		        } 
		        catch (EmpSalary es) 
		        { 
		            System.out.println(es.getMessage()); 
		        } 
		    } 
	}

