package com.sonata;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class TestStudentInfo {
	public static void main(String[] args) {
		
	
	SessionFactory factory=new Configuration().configure().buildSessionFactory();
	Session s1=factory.openSession();
	s1.beginTransaction();
	StudentInfo stdinfo=new StudentInfo();
	Criteria criteria=s1.createCriteria(StudentInfo.class);
	
	
	//criteria.add(Restrictions.gt("stdMarks", 90));
	//criteria.add(Restrictions.between("stdMarks", 80, 90));
	
	//criteria.add(Restrictions.eq("stdMarks", 70));
	
	//criteria.add(Restrictions.like("stdName", "S%"));
	
	 
	
	
	List<StudentInfo> students= criteria.list();
	
	s1.getTransaction().commit();
	s1.close();
	
	for(StudentInfo u:students) {
		System.out.println(u.getStdId());
		System.out.println(u.getStdName());
		System.out.println(u.getStdMarks());
		

	}
}
	
}
