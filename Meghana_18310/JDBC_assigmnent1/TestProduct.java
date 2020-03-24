package com.sonata.Main;

import java.sql.SQLException;
import java.util.List;

import com.sonata.DAOImpl.ProductDAOImpl;

import com.sonata.Model.Product;

public class TestProduct {
	public static void main(String[] args) throws SQLException {
		Product p=new Product();
		p.setProId(100);
		p.setProName("classmate");
		p.setProPrice(100);
		
		
		ProductDAOImpl dao=new ProductDAOImpl();
		dao.addP(p);
		System.out.println(dao);
		
		List<Product> list=dao.getData();
		for(Product pi:list) {
			
			System.out.println(pi.getProId());
			System.out.println(pi.getProName());
			System.out.println(pi.getProPrice());
		}
		
		
		
		ProductDAOImpl dao2=new ProductDAOImpl();
		int row1 =dao2.delete(p);
		System.out.println(row1);
		
		ProductDAOImpl dao3=new ProductDAOImpl();
		int row2=dao3.update(p);
		System.out.println(row2);
}

}
	
