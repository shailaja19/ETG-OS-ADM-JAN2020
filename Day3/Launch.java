package com.sonata.day3;

public class Launch {
	public static void main(String args[])
	{
		Employee e1=new Employee();
		e1.empId=124;
		e1.empName="hampi";
		e1.empSal=5000;
		e1.display();
		e1.salCal();
		
		Manager m1=new Manager();
		m1.empSal=8000;
		m1.salCal();
		
		
		 Devleoper d1=new Devleoper();
		 d1.empSal=11000;
		 d1.salCal();
		 
		 
		 Tester t1=new Tester();
		 t1.empSal=15000;
		 t1.salCal();
		 
		 

		
		
		
	}

}
