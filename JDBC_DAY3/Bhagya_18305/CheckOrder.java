package com.sonata;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CheckOrder {

	public static void main(String[] args) {

		Order or = new Order();
		or.setOrderId(102);
		or.setItem("Barbeque Pizza");
		or.setCost(310);
		
		Login1 l1 = new Login1();
		l1.setMobileNo("7852236947");
		
		or.setLog1(l1);
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session sess = factory.openSession();
		sess.beginTransaction();
		sess.save(or);
		sess.save(l1);
		sess.getTransaction().commit();
		sess.close();

	}

}
