package com.sonata.assignment03;

public abstract class Shapes {
	float area;
	abstract void compute();
	
	void display() {
		System.out.println("area is: "+area);
	}
	
}
