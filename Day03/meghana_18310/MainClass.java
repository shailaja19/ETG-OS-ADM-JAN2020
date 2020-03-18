package com.sonata.assignment03;

public class MainClass {

  public static void main(String[] args) {
	
	  Rectangle  r=new Rectangle(12, 4);
	  Square s=new Square(4);
	  Triangle t=new Triangle(2, 3);
	  Circle c=new Circle(4);
	  
	  Geometry g=new Geometry();
	  System.out.println("Area of rectangle:");
	  g.maths(r);
	  System.out.println("Area of square:");
	  g.maths(s);
	  System.out.println("Area of triangle:");
	  g.maths(t);
	  System.out.println("Area of circle:");
	  g.maths(c);
}
}
