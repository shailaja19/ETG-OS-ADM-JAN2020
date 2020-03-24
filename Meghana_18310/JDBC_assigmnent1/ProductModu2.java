package com.sonata.Mod2;

import com.sonata.Model.Product;

public class ProductModu2 {
	public static void main(String[] args) {
		Product p=new Product();
		p.setProId(100);
		p.setProName("biscuit");
		p.setProPrice(20);
		System.out.println(p);
		System.out.println("Creation of module");
	}

}
