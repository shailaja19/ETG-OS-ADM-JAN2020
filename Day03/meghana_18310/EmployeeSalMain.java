package com.sonata.assignment03;

public class EmployeeSalMain {
	public static void main(String[] args) {
		Manager m=new Manager(18310,"Meghana",100000);
		m.display();
		System.out.println("-------------------");
		Developer d=new Developer(18200,"Suresh",50000);
		d.display();
		System.out.println("-------------------");
		Tester t=new Tester(15890,"Zubeir",45000);
		t.display();
		
		System.out.println("---Salaries---");
		m.salCal();
		d.salCal();
		t.salCal();
	}

}
