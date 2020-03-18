package com.sonata.assignment03;

public class Square extends Shapes {
	float length;

	public Square(float length) {
		super();
		this.length = length;
	}
	

	@Override
	void compute() {
		// TODO Auto-generated method stub
		area=length*length;
	}

}
