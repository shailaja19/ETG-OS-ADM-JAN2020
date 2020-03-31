package com.sonata.UserLogin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.PreparedStatement;
import com.sonata.ProImpl.DbConnection;


@WebServlet("/UserLoginServlet")
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
		DbConnection db= new DbConnection();
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			 response.setContentType("text/html");
			   PrintWriter out = response.getWriter();
			   int flag=1;
			   String name = request.getParameter("uname");
			   String passwd = request.getParameter("psswd");
			   try {
				   
			   Connection con= db.getConnection();
			   PreparedStatement ps= (PreparedStatement) con.prepareStatement("select * from userregistration");
			  ResultSet rs= ps.executeQuery();
			  while(rs.next())
			  {
				  String password= rs.getString(3);
				  String uname = rs.getString(2);
				  if(password.equals(passwd) && name.equals(uname))
				  {
					  flag =0;
					  break;
				  }
				  
			  }
			   
			   if(flag==0)
			   {
				   RequestDispatcher rd = request.getRequestDispatcher("/Product.html");
					rd.forward(request, response);
			   }
			   else
			   
				   out.print("Sorry Username or Password Error");
					RequestDispatcher rd = request.getRequestDispatcher("/UserLogin.html");
					rd.include(request, response);
			   }
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
