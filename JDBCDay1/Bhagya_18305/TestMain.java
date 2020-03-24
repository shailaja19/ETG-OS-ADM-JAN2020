package com.sonata.Main;

import java.util.ArrayList;
import java.util.List;

import com.sonata.DaoImpl.ProDAOImpl;
import com.sonata.Model.Product;



public class TestMain {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.setProId(4);
		p1.setProName("Sketch");
		p1.setProPrice(300);
		
		ProDAOImpl dao = new ProDAOImpl();
		int row = dao.add(p1);
		System.out.println(row);
		
		
		//ProDAOImpl dao = new ProDAOImpl();
		p1.setProId(4);
		int row1 = dao.delete(p1);
		System.out.println(row1);
		
		//ProDAOImpl dao = new ProDAOImpl();
		 p1.setProId(1);
		p1.setProName("ParkerPen");
		int row2 = dao.update(p1);
		System.out.println(row2);
		
		
		//ProDAOImpl dao3 = new ProDAOImpl();
		List<Product> al= new ArrayList<Product>();
		al = dao.getData();
		
		System.out.println(al);
	}

	

}
