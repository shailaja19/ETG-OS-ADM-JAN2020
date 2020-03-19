package com.sonata;

import java.util.ArrayList;
import java.util.LinkedList;

public class EmployeeImpl implements EmployeeInt {
	 LinkedList<Employee> ls=new LinkedList<Employee>();
	public void addEmployee(Employee emp)
	{
		
		ls.add(emp);
		System.out.println(ls);
		
		
		
		
	}
	public void deleteEmployee(Employee e1)
	{
		
		
		    ls.remove(e1);
			System.out.println("The deletion object = "+ls);
		}
	public double appSalary(Employee e)
	{
		if(e.empSal<10000)
		{
			e.empSal=e.empSal+5000;
		}
		return e.empSal;
	}
	
	public double yearSalary(Employee e2)
	{
		return e2.empSal*12;
	}
	}

