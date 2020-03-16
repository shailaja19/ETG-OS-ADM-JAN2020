package com.sonata;

public class StaticExample {

	//static variable
	static int a=10;
	static int b;
	
	//static block
	static {
		System.out.println("static initialized");
		b=a*4;
	}
	
	
	//static method
	static void m1()
	{
		System.out.println("from m1");
	}
	
	

	public static void main(String[] arg)
	{
		//calling m1 without creating
		//any object of class test
		m1();
		
		
		
		System.out.println("from main");
		System.out.println("Value of a: "+a);
		System.out.println("Value of b: "+b);
	}
	
}
