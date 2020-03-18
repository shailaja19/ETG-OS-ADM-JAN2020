package com.sonata.assignment03;

public class Circle extends Shapes {
	
float radius;
final float pi=3.14f;

public Circle(float radius) {
	super();
	this.radius = radius;
}

@Override
void compute() {
	// TODO Auto-generated method stub
	 area=pi*radius*radius;
}


}
