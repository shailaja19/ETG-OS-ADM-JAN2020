package com.sonata.inheritance;

public class Ford extends Car {
	
	public Ford(int Speed, int regularPrice, String color) {
		super(Speed, regularPrice, color);
		// TODO Auto-generated constructor stub
	}

	public Ford() {
		
		// TODO Auto-generated constructor stub
	super();
	}

	 static int year;
  static double manufacturerDiscount;
	
	public double getSalePrice(double a)
	{
	
		if(manufacturerDiscount==0.25) {
		return regularPrice-manufacturerDiscount;
		}
		else
		{
			System.out.println("Manufacturer discount is not applicable");
		return regularPrice;
		}
	}
}
