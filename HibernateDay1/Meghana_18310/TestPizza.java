package com.sonata;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestPizza {
	
	public static void main(String[] args) {
		
		CustomerPizza c=new CustomerPizza();
		c.setCustName("Brown");
		c.setCustPhone(123479);
		c.setPreferences("Non-Veg");
		c.setCrustStyle("Thin-Crust");
		c.setToppings("BabyCorn & extraCheese");
		
		
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		Session s1 = factory.openSession();
		s1.beginTransaction();
		s1.save(c);
		s1.getTransaction().commit();
		s1.close();
	}

}
