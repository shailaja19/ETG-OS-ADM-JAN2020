package com.sonata.DAOImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sonata.DAO.ProductDAO;

import com.sonata.Model.Product;

public class ProductDAOImpl implements ProductDAO {
	DbConnection db=new DbConnection();
	Product product;
	int row=0;
	@Override
	public int addP(Product pro) {
		try {
			product=pro;
			PreparedStatement cs=db.getConnection().prepareStatement
					("insert into Product (proId,proName,proPrice) values('?','?','?')");
			cs.setInt(1,product.getProId());
			cs.setString(2,product.getProName());
			cs.setDouble(3, product.getProPrice());
			row=cs.executeUpdate();
			db.closeConnection();
				
		}catch(SQLException e) {e.printStackTrace();}
		return row;
		
	}

	@Override
	public int delete(Product pro) {
		try {
			
			product=pro;
			
			PreparedStatement cs=db.getConnection().prepareStatement
					("delete from Product where proId=?");
			cs.setInt(1, product.getProId());
			
			row=cs.executeUpdate();
			System.out.println("data is deleted "+row);
			db.closeConnection();
				
		}catch(SQLException e) {e.printStackTrace();}
		return row;
	}

	@Override
	public int update(Product pro) {
		try {
			
			product=pro;
			
			PreparedStatement cs=db.getConnection().prepareStatement
					("update Product set proName=? where proId=?");
			cs.setString(1, product.getProName());
			cs.setInt(2,product.getProId());
			row=cs.executeUpdate();
			System.out.println("data is updaated "+row);
			db.closeConnection();
				
		}catch(SQLException e) {e.printStackTrace();}
		return row;
	}

	@Override
	public List<Product> getData() {
		ArrayList<Product> l1=new ArrayList<Product>();
		try {
			PreparedStatement ps=db.getConnection().prepareStatement("Select * from Employee");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Product pro=new Product();
				int pid=rs.getInt(1);
				String pname=rs.getString(2);
				double psal=rs.getDouble(3);
				
				
				pro.setProId(pid);
				pro.setProName(pname);
				pro.setProPrice(psal);
				
				l1.add(pro);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return l1;
	}

	

}
