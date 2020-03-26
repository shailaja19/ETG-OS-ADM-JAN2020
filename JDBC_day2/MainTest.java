package com.sonata.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.sonata.Model.Student;
import com.sonata.StudentDaoImpl.DuplicateException;
import com.sonata.StudentDaoImpl.StdDAOImpl;


public class MainTest {
	public static void main(String[] args) throws DuplicateException {
		
			Student s1 = new Student();
			s1.setStdId(5);
			s1.setStdName("Divyashree");
			s1.setMarks(78);

			/*Student s2 = new Student();
			s2.setStdId(2);
			s2.setStdName("Nilesh");
			s2.setMarks(80);
			
			Student s3= new Student();
			s3.setStdId(3);
			s3.setStdName("Hampi");
			s3.setMarks(83);
			   
			Student s4 = new Student();
			s4.setStdId(4);
			s4.setStdName("Sonu");
			s4.setMarks(89);*/
			
			StdDAOImpl dao = new StdDAOImpl();
			int row = dao.addStudent(s1);
			
			/* row = dao.addStudent(s2);
			 row =dao.addStudent(s3);
			 row = dao.addStudent(s4);
			System.out.println("student added"); */
			
			/*List<Student> al= new ArrayList<Student>();
			al = dao.getStudent();
			
			al.stream().sorted(Comparator.comparing(Student::getMarks).reversed()).forEach(System.out::println);*/
		}

}
