package com.sonata.main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


import com.sonata.DaoImpl.StudDaoImpl;
import com.sonata.Exception.DuplicationException;
import com.sonata.Model.Student;

public class MainStud {
public static void main(String[] args) throws SQLException, DuplicationException {
	
	StudDaoImpl dao = new StudDaoImpl();
		/*Student s1 = new Student();
		s1.setStdId(1);
		s1.setStdName("Rachel");
		s1.setMarks(75);
		*/
	
	Student s7 = new Student();
	s7.setStdId(7);
	s7.setStdName("phoebe");
	s7.setMarks(99);
	int row = dao.addStudent(s7);
	
		System.out.println(row); 
		
		System.out.println("--- first student with highest marks ---");
		List<Student> al= new ArrayList<Student>();
		al = dao.getStudent();
		
		al.stream().sorted(Comparator.comparing(Student::getMarks).reversed()).limit(1).forEach(System.out::println);
	
	
	
	
	}
	

}
