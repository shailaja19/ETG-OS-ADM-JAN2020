package com.sonata.Assignment3;

public class Rectangle extends Shape {

	Rectangle(double length, double heigth, double width) {
		super(length, heigth, width);
		
	}

	public void area()
	{
		double area=0;
		area = length*width;
		System.out.println("the rectangle area is "+area);
	}
	}
	


