package com.sonata;

public class Truck extends Car{
      int weight=5500;
      public Truck(int speed,double regularPrice, String color)
  	{
  		this.speed=speed;
  		this.regularPrice=regularPrice;
  		this.color=color;
  	}
	public double getSalePrice()
	{
		int result=0;
		if(weight>5000)
		{
			return regularPrice-regularPrice*0.10;
			
		}
		else
			return regularPrice-regularPrice*0.20;
	}

}
