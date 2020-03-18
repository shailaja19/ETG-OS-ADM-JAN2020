package com.sonata.assignment03;

public class Triangle extends Shapes {
	float breadth;
	float height;
	public Triangle(float breadth, float height) {
		super();
		this.breadth = breadth;
		this.height = height;
	}
	@Override
	void compute() {
		// TODO Auto-generated method stub
		area=(float) (0.5*breadth*height);
	}
	

}
