package com.sonata.AssignDay5;

public class Product {
	String prodName;
	double proPrice;
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public double getProPrice() {
		return proPrice;
	}
	public void setProPrice(double proPrice) {
		this.proPrice = proPrice;
	}
	@Override
	public String toString() {
		return "Product [prodName=" + prodName + ", proPrice=" + proPrice + "]";
	}
	
	
}