package com.sonata;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class StudentMain {

	public static void main(String[] args) {
		Address ad1 = new Address();
		
		ad1.setAddLine1("Ammanagi");
		ad1.setCity("Sankeshwar");
		ad1.setState("Karnataka");
		ad1.setCountry("India");
		ad1.setPinCode(591236);
		
		Address add2= new Address();
		add2.setAddLine1("Nidasoshi");
		add2.setCity("Sankeshwar");
		add2.setState("Karnataka");
		add2.setCountry("India");
		add2.setPinCode(591236);
		
		School sc1= new School();
		sc1.setSchoolName("SJD High School");
		sc1.setSchoolAdd(add2);
	
		
		Students s1 = new Students();
		s1.setStdName("Nilesh");
		s1.setMarks(85);
		s1.setStdAddress(ad1);
		s1.setSchool(sc1);
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		
		//session.save(ad1);
	//	session.save(add2);
	//	session.save(sc1);
	//	session.save(s1);
		
		
		Query q1 = session.createQuery("From Student1");
		
		List<Students> students=(List<Students>) q1.list();
		
		session.getTransaction().commit();
		
		session.close();
		
		for(Students s :students )
		{
			System.out.println(s.getStdId());
			System.out.println(s.getStdName());
			System.out.println(s.getMarks());
			System.out.println(s.getStdAddress());
			System.out.println(s.getSchool().getSchoolName());
			
		
		}
	}



	}


