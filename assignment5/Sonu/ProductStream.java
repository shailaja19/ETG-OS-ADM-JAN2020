package com.sonata.Day5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductStream {
	
	public static void main(String[] args) throws IOException {
		
		Product p1 =new Product();
		p1.prodName= "Nokia";
		p1.proPrice=20000;
		
		Product p2 = new Product();
		p2.prodName="iPhone";
		p2.proPrice=80000;
		Product p3 = new Product();
		p3.prodName="samsung";
		p3.proPrice=40000;
		
		ArrayList<Product> ls = new ArrayList<Product>();
		ls.add(p1);
		ls.add(p2);
		ls.add(p3);

		
		System.out.println(ls);
		
		
		
		
		
		List<Double> productPriceList2 = ls.stream()  
		                                    // filtering data  
			                                    .map(p->p.proPrice).sorted().        
				                                     collect(Collectors.toList()); // collecting as list  
				       System.out.println(productPriceList2);  


		
	
		
	}


}
