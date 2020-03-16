package com.sonata;

public class MyOwnAutoShop {
	public static void main(String args[])
	{
		//for car
		int speed;
		double regularPrice;
		String color;
		System.out.println("car details----------------");
		Car ob=new Car(55,506,"red");
		double result=ob.getSalePrice();
		System.out.println("The price of car = "+result);
		
		//for truck
		
		 
		 
		 //for ford
		//ford one instance
				System.out.println("Ford details----------------");
				Ford f=new Ford();
				Ford.year=2019;
				System.out.println("Manufacture year: "+Ford.year);
				Ford.manufacturerDiscount=0.25;
				System.out.println("Manufactures discount:"+Ford.manufacturerDiscount);
				
				System.out.println("With Manufacturer Discount: "+f.getSalePrice(0.25));
				
				//ford second instance
				System.out.println(" second Ford details----------------");
				Ford f1=new Ford(200,56700,"green");
				Ford.year=2022;
				System.out.println("Manufacture year: "+Ford.year);
				Ford.manufacturerDiscount=0.34;
				System.out.println("Manufactures discount:"+Ford.manufacturerDiscount);
				
				System.out.println("With Manufacturer Discount: "+f1.getSalePrice(0.34));
				
				
		 
		 //Sedan

			System.out.println("Sedan details----------------");
			Sedan s=new Sedan(120, 50000, "red");
			Sedan.length=10;
			
			System.out.println("with discount "+s.getSalePrice());
			
		 
		 
	}

}
