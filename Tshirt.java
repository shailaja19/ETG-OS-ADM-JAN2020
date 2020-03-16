package com.sonata.day2;



public class Tshirt {

	String color;
	String material;
	String design;
	public void display(String color, String material,String design)
	{
		this.color = color;
		this.material=material;
		this.design=design;
		
		System.out.println("Shirt color "+color+" , ");
		System.out.println("Shirt material "+material+" , ");
		System.out.println("Shirt design "+design);
		System.out.println();
	}

	public static void main(String[] args) {
		
 Tshirt small = new Tshirt();
 Tshirt large = new Tshirt();
 Tshirt xlarge = new Tshirt();
 small.display("blue", "cotton", "xyz");
 large.display("red", "silk", "abc");
 xlarge.display("black", "wool", "mno");
	}

}
