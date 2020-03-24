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
	
	Product product ;
	DbConnection db = new DbConnection();
	
		public int save(Object object ) {
			
			try {
				
				product = (Product)object;
				PreparedStatement cs = db.getConnection().prepareStatement ("insert into Product values (?,?,?)");
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
				PreparedStatement ps = (PreparedStatement) db.getConnection().prepareStatement("SELECT * FROM Employee");
				ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{ 
				Product p= new Product();
				int pid=rs.getInt(1);
				String pname = rs.getString(2);
				double psal= rs.getDouble(3);
				p.setProductId(pid);
				p.setProductName(pname);
				p.setProductPrice(psal);
				l1.add(p);
			}
			
		}
			catch (SQLException e) {
				e.printStackTrace();
				// TODO: handle exception
			}
			
			
			return l1;
		}
		
		public int delete(Object object ) {
			try {
				product = (Product)object;
				PreparedStatement cs = db.getConnection().prepareStatement("delete from Product where pId = ?");
				cs.setInt(1, product.getProductId());
				
				row = cs.executeUpdate();
				db.closeConnection();
			} catch(SQLException e) {System.out.println(e);}
			return row;
}

		public int update(Object object ) {
			try {
				product = (Product)object;
				PreparedStatement cs = db.getConnection().prepareStatement("update Product set pPrice=? where pId=?");
				cs.setInt(2, product.getProductId());
				cs.setDouble(1, product.getProductPrice());
				
				row = cs.executeUpdate();
				db.closeConnection();
			} catch(SQLException e) {System.out.println(e);}
			return row;
}
		


}
