package com.sonata.day3;

public class Square extends Shape {
	
	Square(double d, double e, double f) {
		super(d, e, f);
		// TODO Auto-generated constructor stub
	}

	public void area()
	{
		double area = length*length*length*length;
		System.out.println("the square area is "+area);
	}

}
