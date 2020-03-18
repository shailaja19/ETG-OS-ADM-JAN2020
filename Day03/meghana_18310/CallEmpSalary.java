package com.sonata.assignment03;

import com.sonata.ExceptionExample.MyOwnException;

public class CallEmpSalary {
	

	public static void main(String[] args) throws EmpSalary {
		int salary=10009;
		if(salary<100000)
			throw new EmpSalary("Employee annual salary less than 1,00,000");
		else
			System.out.println("Your annual salary is: "+salary);

}
}