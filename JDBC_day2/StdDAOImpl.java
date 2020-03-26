package com.sonata.StudentDaoImpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;
import com.sonata.Dao.StuDAO;
import com.sonata.Model.Student;

public class StdDAOImpl implements StuDAO {
	int row= 0;
	DBConnection db = new DBConnection();
	DuplicateException de = new DuplicateException();
	
	Student std= null;

	@Override
	public int addStudent(Object obj) throws DuplicateException {
		int a = 1;
		std =(Student) obj;
		Connection con = db.getConnection();
		try
		{
			PreparedStatement ps = (PreparedStatement) con.prepareStatement("SELECT * FROM Student");
			ResultSet rs=ps.executeQuery();
		
		while(rs.next())
		{ 
			 Student std1= new Student();
			
			std1.setStdId(rs.getInt(1));
			a = de.compare(std, std1);
		}
		if( a==0)
			throw  new DuplicateException("Data Exists");
		else
		{
			PreparedStatement ps1= (PreparedStatement)con.prepareStatement("Insert into Student values (?,?,?)");
			ps1.setInt(1, std.getStdId());
			ps1.setString(2, std.getStdName());
			ps1.setDouble(3, std.getMarks());
			
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
	public List<Student> getStudent() {
		List l1 =new  ArrayList<Student>();
		try
		{
			PreparedStatement ps = (PreparedStatement) db.getConnection().prepareStatement("SELECT * FROM Student");
			ResultSet rs=ps.executeQuery();
		
			while(rs.next())
			{ 
				Student prd= new Student();
			
				prd.setStdId(rs.getInt(1));
				prd.setStdName(rs.getString(2));
				prd.setMarks(rs.getDouble(3));
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

