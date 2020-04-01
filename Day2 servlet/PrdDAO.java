package com.sonata.prdDAO;

import java.util.List;

import com.sonata.prdDAOImpl.DuplicateException;
import com.sonata.prdModel.Product;


public interface PrdDAO {
	public int addProduct(Object obj) throws DuplicateException;
	public int deleteProduct(Object obj);
	public int updateProduct(Object obj);
	public List<Product> displayProduct();
}