package com.sonata.prdModel;

public class Product {
	int prdID;
	String prdName;
	double prdPrice;
	public int getPrdID() {
		return prdID;
	}
	public void setPrdID(int prdID) {
		this.prdID = prdID;
	}
	public String getPrdName() {
		return prdName;
	}
	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}
	public double getPrdPrice() {
		return prdPrice;
	}
	public void setPrdPrice(double prdPrice) {
		this.prdPrice = prdPrice;
	}
	@Override
	public String toString() {
		return "Product [prdID=" + prdID + ", prdName=" + prdName + ", prdPrice=" + prdPrice + "]" + "\n";
	}
	
	
	

}
