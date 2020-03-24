package com.sonata.DAO;

import java.util.List;

import com.sonata.Model.Product;

public interface ProDAO {

	public int  add(Object obj);
	 public List<Product> getData();
	public int delete(Object obj);
	public int update(Object obj);
}
