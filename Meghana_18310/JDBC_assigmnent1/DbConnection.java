package com.sonata.DAOImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
Connection connection;
	
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Product","root","admin@123");
		}catch(ClassNotFoundException e1)
		{System.out.println(e1);
		
			
		}
		catch(SQLException e2) {
			System.out.println(e2);
		}
return connection;
	}
	
	public void closeConnection() {
		try {
			if(connection!=null) {
				connection.close();
			}
			}catch(SQLException e2) {
				System.out.println(e2);
		}
	}


}
