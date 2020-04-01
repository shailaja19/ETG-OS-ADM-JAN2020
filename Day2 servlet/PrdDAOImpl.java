package com.sonata.prdDAOImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import com.mysql.jdbc.PreparedStatement;
import com.sonata.prdDAO.PrdDAO;
import com.sonata.prdModel.Product;

import java.sql.*;

public class PrdDAOImpl implements PrdDAO {
	int row= 0;
	DBConnection db = new DBConnection();
	DuplicateException de= new DuplicateException();
	
	Product product= null;
	
	
	@Override
	public int addProduct(Object obj) throws DuplicateException {
		
		int a = 1;
		product =(Product) obj;
		Connection con = db.getConnection();
		try
		{
			PreparedStatement ps = (PreparedStatement) con.prepareStatement("SELECT * FROM Productdetails");
			ResultSet rs=ps.executeQuery();
		
		while(rs.next())
		{ 
			 Product prd= new Product();
			
			prd.setPrdID(rs.getInt(1));
			a = de.compare(product, prd);
			if(a==0) break;
		}
		if( a==0)
			throw  new DuplicateException("Data Exists");
		else
		{
			PreparedStatement ps1= (PreparedStatement)con.prepareStatement("Insert into ProductDetails values (?,?,?)");
			ps1.setInt(1, product.getPrdID());
			ps1.setString(2, product.getPrdName());
			ps1.setDouble(3, product.getPrdPrice());
			row = ps1.executeUpdate();
			
			db.closeConnection();
		}
		}
		
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return row;
	}
	@Override
	public int deleteProduct(Object obj) {

		try
		{
			product =(Product) obj;
			PreparedStatement ps= (PreparedStatement) db.getConnection().prepareStatement("Delete from ProductDetails where prdId= ?");
			ps.setInt(1, product.getPrdID());
			
			row = ps.executeUpdate();
			db.closeConnection();
		}
		
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return row;
		
	}
	@Override
	public int updateProduct(Object obj) {
		
		try
		{
			PreparedStatement ps= (PreparedStatement) db.getConnection().prepareStatement("update productdetails set prdprice =? where prdId=?");
			ps.setDouble(1, 200);
			ps.setInt(2, 1004);
			
			int row = ps.executeUpdate();
			System.out.println("The number of records updated are :"+row);
		}
		catch (SQLException e) {
			e.printStackTrace();
			
		}
		return row;
		}
	@Override
	public List<Product> displayProduct() {
		List l1 =new  ArrayList<Product>();
		try
		{
			PreparedStatement ps = (PreparedStatement) db.getConnection().prepareStatement("SELECT * FROM Productdetails");
			ResultSet rs=ps.executeQuery();
		
		while(rs.next())
		{ 
			 Product prd= new Product();
			
			prd.setPrdID(rs.getInt(1));
			prd.setPrdName(rs.getString(2));
			prd.setPrdPrice(rs.getDouble(3));
			l1.add(prd);
		}
		
	}
		catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		
		return l1;
	}

	
		
		
	}


