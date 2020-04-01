package com.sonata.prdDAOImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

Connection con;
	
	public Connection getConnection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Product","root","admin");
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	public void closeConnection()
	{
		try
		{
			if(con != null)
			{
				con.close();
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
