package com.sonata.DaoImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sonata.DaoImpl.DbConnection;
import com.sonata.Model.Product;

public class ProductMeth {
	
	int row = 0;
	DbConnection db = new DbConnection();
		Product product = null;
		
		
		
			public int save(Object object ) {
				try {
					product = (Product)object;
					PreparedStatement cs = db.getConnection().prepareStatement("insert into ProductDetails values (?,?,?)");
					cs.setInt(1, product.getProductId());
					cs.setString(2, product.getProductName());
					cs.setDouble(3, product.getProductPrice());
					
					row = cs.executeUpdate();
					db.closeConnection();
				} catch(SQLException e) {System.out.println(e);}
				return row;
	}
			
			
			public List<Product> getData() {
				List l1 =new  ArrayList<Product>();
				try
				{
					PreparedStatement ps = (PreparedStatement) db.getConnection().prepareStatement("SELECT * FROM ProductDetails");
					ResultSet rs=ps.executeQuery();
				
				while(rs.next())
				{ 
					Product p= new Product();
					int pid=rs.getInt(1);
					String pname = rs.getString(2);
					double pprice= rs.getDouble(3);
					p.setProductId(pid);
					p.setProductName(pname);
					p.setProductPrice(pprice);
					l1.add(p);
				}
				
			}
				catch (SQLException e) {
					e.printStackTrace();
					// TODO: handle exception
				}
				
				
				return l1;
			}





			public int delete(Object object) {
				
				try {
					product = (Product)object;
					PreparedStatement cs = db.getConnection().prepareStatement("delete from ProductDetails where ProductID = ?");
					cs.setInt(1, product.getProductId());
					
					row = cs.executeUpdate();
					db.closeConnection();
				} catch(SQLException e) {System.out.println(e);}
				return row;
			}



			public int update(Object object) {
				try {
					product = (Product)object;
					PreparedStatement cs = db.getConnection().prepareStatement("update ProductDetails set ProductPrice=? where ProductID=?");
					cs.setString(2, product.getProductName());
					cs.setDouble(1, product.getProductPrice());
					
					row = cs.executeUpdate();
					db.closeConnection();
				} catch(SQLException e) {System.out.println(e);}
				return row;
			}
			
			

}
