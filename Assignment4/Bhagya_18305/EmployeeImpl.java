package com.sonata.Assignment4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EmployeeImpl implements EmployeeInt {
	ArrayList<Employee> ls;
	public void addEmployee(Employee emp)
	{
		 ls=new ArrayList<Employee>();
		
		ls.add(emp);
		System.out.println(ls);
		
		
		
		
	}
	public void deleteEmployee(Employee e1)
	{
		//System.out.println(ls);
		
		/*List<Employee> ls=new LinkedList<Employee>();
		    ls.remove(e1);
			System.out.println(e1);*/
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

