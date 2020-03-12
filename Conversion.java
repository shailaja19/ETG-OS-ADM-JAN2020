package com.sonata;

public class Conversion {
	public static void main(String args[])
	{
		//implicit
		int i=100;
		long l=i;
		float f=1;
		double d=100.04;
		
		//explicit
		long l1=(long)d;
		System.out.println("Int value"+i);
		System.out.println("Int value"+l);
		System.out.println("Int value"+f);
		System.out.println("Int value"+l1);
		
		//type promotion
		byte a=40;
		byte b=40;
		byte c=40;
		int d1=a*b/c;
		
		//TYPE INFERENCE
		var a1=100;
		System.out.println("Int value"+ a);

}
}