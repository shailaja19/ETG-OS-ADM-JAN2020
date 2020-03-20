package com.sonata.AssignDay5;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
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
		
		ArrayList<Product> ls = new ArrayList<Product>();
		ls.add(p1);
		ls.add(p2);

		
		System.out.println(ls);
		
		ls.stream().map(p->p.proPrice).sorted().collect(Collectors.toList()).forEach(System.out::println);;		
		
	
		
	}

}
