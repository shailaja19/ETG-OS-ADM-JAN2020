package com.sonata.Assignment3;

public class MainMeth {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.empId = 123;
		e1.empName = "abc";
		e1.empSal = 23244;
		
		e1.display();
		e1.salCal();
		
		Manager m = new Manager();
		m.empSal = 234345;
		m.salCal();
		
		Developer d = new Developer();
		d.empSal = 4654;
		d.salCal();
		
		
		

	}

}
