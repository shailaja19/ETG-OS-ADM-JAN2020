package com.sonata.StudentDaoImpl;

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
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBCExample","root","admin@123");
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
