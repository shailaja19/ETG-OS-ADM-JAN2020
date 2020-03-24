package com.sonata.Main;


import java.util.ArrayList;
import java.util.List;

import com.sonata.DaoImpl.ProductMeth;
import com.sonata.Model.Product;

public class TestBean {
	public static void main(String args[]){
		Product p1 = new Product();
		p1.setProductId(004);
		p1.setProductName("Lighter");
		p1.setProductPrice(100);
		
		ProductMeth pro = new ProductMeth();
		int row = pro.save(p1);
		System.out.println(row);
		
		List<Product> l1 =new  ArrayList<Product>();
		l1= pro.getData();
		System.out.println(l1);
		
		Product p2 = new Product();
		p2.setProductId(002);
		
		int row1 = pro.delete(p2);
		System.out.println(row1);
		
		
		Product p3 = new Product();
		p3.setProductId(001);
		p3.setProductPrice(1200);
		
		int row2 = pro.update(p3);
		System.out.println(row2);
		
		
		
	}

}
