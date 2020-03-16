package com.sonata.inheritance;

public class MyOwnAutoShop {
	
	public static void main(String[] args) {
		
		
		
		System.out.println("Sedan details----------------");
		Sedan s=new Sedan(120, 50000, "red");
		Sedan.length=10;
		s.display();
		System.out.println("with discount "+s.getSalePrice());
		
		//ford one instance
		System.out.println("Ford details----------------");
		Ford f=new Ford();
		Ford.year=2019;
		System.out.println("Manufacture year: "+Ford.year);
		Ford.manufacturerDiscount=0.25;
		System.out.println("Manufactures discount:"+Ford.manufacturerDiscount);
		f.display();
		System.out.println("With Manufacturer Discount: "+f.getSalePrice(0.25));
		
		//ford second instance
		System.out.println(" second Ford details----------------");
		Ford f1=new Ford(200,56700,"green");
		Ford.year=2022;
		System.out.println("Manufacture year: "+Ford.year);
		Ford.manufacturerDiscount=0.34;
		System.out.println("Manufactures discount:"+Ford.manufacturerDiscount);
		f1.display();
		System.out.println("With Manufacturer Discount: "+f1.getSalePrice(0.34));
		
		
		
		
		System.out.println("Car details----------------");
		Car c=new Car(60,5000,"black");
		c.display();
		System.out.println(c.getSalePrice());
		
		
		
		Truck.weight=150;
		
		
		
		
	}

}
