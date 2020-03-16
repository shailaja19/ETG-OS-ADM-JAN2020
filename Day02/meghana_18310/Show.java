package com.sonata;

import com.sonata.PacExample.PackageExample;

public class Show extends PackageExample {
	public static void main(String[] args) {
		
		//different package with relation
		Show s1=new Show();
		s1.div(3, 54);
		s1.mul(4,5);
		
		//different package without relation
		PackageExample p=new PackageExample();
		p.div(6, 3);
		
	}

}
