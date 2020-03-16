package com.sonata.inheritance;

public class Car {

	int speed;
	double regularPrice;
	String color;
	
	public Car()
	{
	speed=60;
	regularPrice=20000;
	color="white";
	
	}
	
	public Car(int speed, int regularPrice, String color) {
	this.speed=speed;
	this.regularPrice=regularPrice;
	this.color=color;
	}
	public  double getSalePrice()
	{
		return regularPrice;
		
	}
	
	public void display()
	{
		System.out.println("Speed: "+speed);
		System.out.println("Price: "+regularPrice);
		System.out.println("color: "+color);
		
		
	}
	
	
}
