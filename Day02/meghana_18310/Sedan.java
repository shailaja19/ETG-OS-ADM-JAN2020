package com.sonata.inheritance;

public class Sedan extends Car {
	
	static int length;
	public Sedan(int Speed, int regularPrice, String color) {
		super(Speed, regularPrice, color);
	
	}
	
	
	
	public double getSalePrice()
	{
		if(length>20)
		{
			regularPrice=regularPrice-0.5;
		}
		else
		{
			regularPrice=regularPrice-0.10;
		}
		
		return regularPrice;
	}

	
}
