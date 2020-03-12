package com.sonata;

public class Conversion {

	public static void main(String[] args) {

		int i=100;
		
		//implicit type casting
		long l=i;
		
		// implicit type casting
		float f= l;
		double d=100.04;
		
		//explicit type casting
		long l1= (long)d;
		System.out.println("Int value"+i);
		System.out.println("Long value"+l);
		System.out.println("Float value"+i);
		System.out.println("Explicit Long value"+l1);
		
		
		//type promotion
		byte a=40;
		byte b=50;
		byte c=100;
		int d1= a*b/c;
		System.out.println(d1);
		
		//type inference
		var a1=10;
		System.out.println(a);

	}

}
