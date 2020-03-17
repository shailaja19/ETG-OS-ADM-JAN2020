package com.sonata.Assignment3;

public class Square extends Shape {

	
	Square(double d, double e, double f) {
		super(d, e, f);
		
	}

	public void area()
	{
		double area = length*length*length*length;
		System.out.println("the square area is "+area);
	}
	}

	


