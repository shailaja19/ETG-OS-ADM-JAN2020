package com.sonata.inheritance;

public class Truck extends Car {

		public Truck(int Speed, int regularPrice, String color) {
		super(Speed, regularPrice, color);
		// TODO Auto-generated constructor stub
	}
		static int weight;
	 double getsalePrice()
		{
			if(weight>200)
			{
				regularPrice=regularPrice-0.10;
			}
			else
			{
				regularPrice=regularPrice-0.20;
			}
			
			
			return regularPrice;
		}
}
