/*1) Create student class having stdID , stdName, stdClass and display the information of two objects
 * 
 */

package com.sonata.day2;


public class Student {
	
	int stdID;
	String stdName;
	int stdClass;
	
	public void display()
	{
		System.out.println(stdID);
		System.out.println(stdName);
		System.out.println(stdClass);
	}
	
	public void display(int a,String b,int c)
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
	
public static void main(String[] args) {
	
	Student s1=new Student();
	s1.display();
	
	Student s2=new Student();
	s2.display(100, "Meghana", 12);
	
}
}
