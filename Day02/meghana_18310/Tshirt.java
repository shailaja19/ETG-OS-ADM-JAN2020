/*3) Create a T-Shirt  class with the following fields.
String color
String material
String design
Create three instances of object based on different sizes like small, large ,  xtra-large.
 */
package com.sonata.day2;

public class Tshirt {
String color;
String material;
String design;

public Tshirt(String color, String material, String design) {
	// TODO Auto-generated constructor stub
	
	this.color=color;
	this.material=material;
	this.design=design;
}


public void display()
{
  System.out.println( color);
   System.out.println(material);
   System.out.println(design);
  
	
  
}


public static void main(String[] args) {
	System.out.println("Small--------------------------");
	Tshirt small=new Tshirt("Gray", "silk", "round-neck");
	small.display();
	System.out.println("Large--------------------------");
	Tshirt large=new Tshirt("black", "cotton", "collar-neck");
	large.display();
	System.out.println("xLarge--------------------------");
	Tshirt xtra_large=new Tshirt("blue", "denim", "semicollar-neck");
	xtra_large.display();
	
	
}

}
