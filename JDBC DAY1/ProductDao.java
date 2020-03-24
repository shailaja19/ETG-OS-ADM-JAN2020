package com.sonata.Dao;

import java.util.List;

import com.sonata.Model.Product;

public interface ProductDao {
	
	public int save(Object object);
	public List<Product> getData();
	public int delete(Object object);
	public int update(Object object);


}
