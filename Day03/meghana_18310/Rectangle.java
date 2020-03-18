package com.sonata.assignment03;

public class Rectangle extends Shapes {
	float length;
	float breadth;
	@Override
	void compute() {
		area=length*breadth;
		
	}
	public Rectangle(float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

}
