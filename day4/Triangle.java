package com.sonata.Assignment3;

public class Triangle extends Shape {

	Triangle(double d, double e, double f) {
		super(d, e, f);
		
	}

	public void area()
	{
		double area = (length*heigth)/2;
		System.out.println("the triangle area is "+area);
	}

}
