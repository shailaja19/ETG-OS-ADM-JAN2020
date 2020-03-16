package com.sonata.day2;

public class Product {
	
		
		int ProID;
		String ProName; 
		float ProPrice;
		static float  gst = 0.8f;
		public void display(int ProID, String ProName,float ProPrice)
		{
			this.ProID = ProID;
			this.ProName=ProName;
			this.ProPrice=ProPrice;
			float totalcost = ProPrice+ProPrice*gst;
			System.out.println("Product ID "+ProID+" , ");
			System.out.println("Product name "+ProName+" , ");
			System.out.println("Total Cost "+totalcost);
			System.out.println();
		}


		public static void main(String[] args) {
			 Product p = new Product();
			 p.display(55, "pen", 30.0f);
			
		}
		

	}


