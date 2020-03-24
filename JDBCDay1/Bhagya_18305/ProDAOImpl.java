package com.sonata.DaoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;
import com.sonata.DAO.ProDAO;
import com.sonata.Model.Product;


public class ProDAOImpl  implements ProDAO{
	int row= 0;
	DBConnection db = new DBConnection();
	Product product= null;
	

	public int add(Object obj) {
		try
		{
		product  = (Product) obj;
			PreparedStatement ps= (PreparedStatement) db.getConnection().prepareStatement("Insert into Product values (?,?,?)");
			ps.setInt(1, product.getProId());
			ps.setString(2, product.getProName());
			ps.setDouble(3, product.getProPrice());
			row = ps.executeUpdate();
			db.closeConnection();
		}
		
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return row;
	}
	
	public int delete(Object obj) {
		try
		{
		product  = (Product) obj;
			PreparedStatement ps= (PreparedStatement) db.getConnection().prepareStatement("delete from Product where proId=?");
			ps.setInt(1, product.getProId());
			row = ps.executeUpdate();
			db.closeConnection();
		}
		
		catch (SQLException e) {
			e.printStackTrace();
		}		
		return row;
	}
	
	public int update(Object obj) {
	try	{
			product  = (Product) obj;
				PreparedStatement ps= (PreparedStatement) db.getConnection().prepareStatement("update Product set ProName=? where ProId =?");
				ps.setString(1,product.getProName());
				ps.setInt(2, product.getProId());
				
				row = ps.executeUpdate();
				db.closeConnection();
			}
			
			catch (SQLException e) {
				e.printStackTrace();
			}		
			return row;
	}


	public List<Product> getData() {
		List l1 =new  ArrayList<Product>();
		try
		{
			PreparedStatement ps = (PreparedStatement) db.getConnection().prepareStatement("SELECT * FROM Product");
			ResultSet rs=ps.executeQuery();
		
		while(rs.next())
		{ 
			Product pd= new Product();
			int pid=rs.getInt(1);
			String name = rs.getString(2);
			double sal= rs.getDouble(3);
			pd.setProId(pid);
			pd.setProName(name);
			pd.setProPrice(sal);;
			
			l1.add(pd);
		}
		
	}
		catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		
		return l1;
	}

	
	

}
