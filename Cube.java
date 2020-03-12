/*3) Write a java program to display the cube of the given number 
 * for ex: if given number is 2 then cube of it is 8
 */


package com.sonata.assignment;
public class Cube {

	public  static int  calculateCube(int a)
	{
		int c=a*a*a;
		return c;
	} 
	
	public static void main(String[] args) {
		int a=2;
		int b=calculateCube(2);
		System.out.println("the cube of the number "+a+" is "+b);
		
	}
	
}
