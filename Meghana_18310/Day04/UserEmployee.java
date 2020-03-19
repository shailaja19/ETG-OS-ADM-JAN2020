package com.sonata.CompleteEmp;

//import java.util.ArrayList;

public class UserEmployee {

	
	public static void main(String[] args) {
		
		Employee e1=new Employee();
		e1.setEmpId(101);
		e1.setEmpName("Meg");
		e1.setEmpSal(6000);
		
		EmployeeImpl emp=new EmployeeImpl();
		emp.addEmployee(e1);
		
		Employee e2=new Employee(200,"Abc",4000);
		
		Employee e3=new Employee();
		e3.setEmpId(102);
		e3.setEmpName("sag");
		e3.setEmpSal(10000);
		
		EmployeeImpl empd=new EmployeeImpl();
		empd.deleteEmployee(e1);
		
		EmployeeImpl empy=new EmployeeImpl();
		System.out.println(empy.appSalary(e2));
	
		EmployeeImpl empa=new EmployeeImpl();
		System.out.println(empa.yearSalary(e1));
	
	}
	
	
	
}
