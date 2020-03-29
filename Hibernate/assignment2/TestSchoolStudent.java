package com.sonata;

import java.util.List;

import javax.management.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestSchoolStudent {
	
	public static void main(String[] args) {
		
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		Session s1 = factory.openSession();
		s1.beginTransaction();
		
		SchoolStudent student1=new SchoolStudent();
		student1.setStudName("Rachel");
		
		SchoolStudent student2=new SchoolStudent();
		student1.setStudName("monica");
		
		SchoolAddress school=new SchoolAddress();
		school.setSchoolName("Angles");
		
		
		
		school.setSchoolstudent(student1);
		school.setSchoolstudent(student2);
		
		s1.save(student1);
		s1.save(student2);
		s1.save(school);
		
		Query query=(Query) s1.createQuery(" from SchoolStudent");
		
		
		List<SchoolStudent> users=((org.hibernate.Query) query).list();
		s1.getTransaction();
		s1.close();
		
		for(SchoolStudent u:users) {
			System.out.println(u.getStudId());
			System.out.println(u.getStudName());
			System.out.println(u.getAddress());
		
		
		
		
		}
	}

}
