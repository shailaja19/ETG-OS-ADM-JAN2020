package com.sonata.Assignment5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
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
		p3.prodName="Samsung";
	p3.proPrice=25000;
		
		ArrayList<Product> al= new  ArrayList<Product>();
		al.add(p1);
		al.add(p2);
		al.add(p3);
		
		
		//List<Double> productPriceList2= 
				al.stream().map(p->p.proPrice).sorted().collect(Collectors.toList()).forEach(System.out::println);;

		

		
	
		
	}


}
