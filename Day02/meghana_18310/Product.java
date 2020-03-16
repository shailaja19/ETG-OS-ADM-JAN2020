/*2) Create a product class The properties are ProID, ProName,
 *  ProPrice display the information and ProPrice will be added additional tax of GST .
 */

package com.sonata.day2;

public class Product {
	int proId;
	String proName;
	double proPrice;
	
	
	public  float display(float d)
	{
		float gst=0.18f;
		float totalPrice=d+(d*gst);
		return totalPrice;
		
		
	}
	
	public static void main(String[] args) {
		
		Product p=new Product();
		float result=p.display(100);
		System.out.println(result);
		
	}

}
