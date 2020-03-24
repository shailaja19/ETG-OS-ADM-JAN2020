package com.sonata.DAO;

import java.util.List;


import com.sonata.Model.Product;

public interface ProductDAO {
	public int addP(Product pro);
	public int delete(Product pro);
	public int update(Product pro);
	public List<Product> getData();

}
