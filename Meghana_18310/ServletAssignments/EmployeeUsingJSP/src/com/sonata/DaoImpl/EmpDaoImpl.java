package com.sonata.DaoImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;
import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Iterator;
import java.util.List;

import com.sonata.Dao.EmpDao;
//import com.sonata.Main.List;
import com.sonata.Model.Employee;

public class EmpDaoImpl implements EmpDao {
	int row=0;
	
	DbConnection db=new DbConnection();
	Employee employee;
	
	public int save(Object object) {
		try {
			employee =(Employee)object;
			PreparedStatement cs=db.getConnection().prepareStatement
					("insert into Employee values(?,?,?)");
			cs.setInt(1, employee.getEmpId());
			cs.setString(2,employee.getEmpName());
			cs.setDouble(3, employee.getEmpSal());
			row=cs.executeUpdate();
			
			System.out.println("data is inserted"+row);
			db.closeConnection();
				
			
		}catch(SQLException e) {e.printStackTrace();}
		return row;
	}

	public List<Employee> getData() {
		ArrayList<Employee> l1=new ArrayList<Employee>();
		try {
			PreparedStatement ps=db.getConnection().prepareStatement("Select * from Employee");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Employee emp=new Employee();
				int eid=rs.getInt(1);
				String name=rs.getString(2);
				double sal=rs.getDouble(3);
				emp.setEmpId(eid);
				emp.setEmpName(name);
				emp.setEmpSal(sal);
				l1.add(emp);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return l1;
		
	}

	
	
	
}
