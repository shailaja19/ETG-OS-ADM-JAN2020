package com.sonata.CompleteEmp;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.List;



public class EmployeeImpl implements EmployeeInt{
	
	static ArrayList<Employee> variable=new ArrayList<Employee>();

	@Override
	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		
		//List<Employee> a1=new ArrayList<Employee>();
		variable.add(e);
		System.out.println(variable);
	}

	@Override
	public void deleteEmployee(Employee e) {
		// TODO Auto-generated method stub
		//List<Employee> a1=new ArrayList<Employee>();
		variable.remove(e);
		
		System.out.println(variable);
	}

	@Override
	public List<Employee>  readEmployee() {
		
		ArrayList<Employee> emp=new ArrayList<Employee>();
		
		for(Employee s:emp)
		{
			System.out.println(s);
			
		}
		
		return emp;
		
		
	}

	@Override
	public double yearSalary(Employee e1) {
		// TODO Auto-generated method stub
		
		
		return e1.getEmpSal()*12;
	}

	@Override
	public double appSalary(Employee e1) {
		// TODO Auto-generated method stub
		
		if(e1.getEmpSal()<10000)
		{
		return  e1.getEmpSal()+5000;
		}
		else
			
		return e1.getEmpSal();
	}

}
