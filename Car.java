package com.sonata;
public class Car {
	int speed;
	double regularPrice;
	String color;
	Car()
	{
		speed=0;
		regularPrice=0.0;
		color="";
				
	}
	public Car(int speed,double regularPrice, String color)
	{
		this.speed=speed;
		this.regularPrice=regularPrice;
		this.color=color;
	}
		double getSalePrice()
		{
			return regularPrice;
		}

}



