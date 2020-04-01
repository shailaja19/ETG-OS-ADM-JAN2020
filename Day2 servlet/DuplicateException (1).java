package com.sonata.prdDAOImpl;

import java.util.Comparator;

import com.sonata.prdModel.Product;


public class DuplicateException extends Exception implements Comparator<Product>  {

	public DuplicateException(String message) {
		super(message);
		
	}
	public DuplicateException() {
	
	}

	
	@Override
	public int compare(Product o1, Product o2) {
			if(o1.getPrdID()==o2.getPrdID())
				return 0;
		return 1;
	}


	

	
	
	

}
