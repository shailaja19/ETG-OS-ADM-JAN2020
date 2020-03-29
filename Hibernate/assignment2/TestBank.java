package com.sonata;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestBank {
	
	public static void main(String[] args) {
	
		Bank bank=new Bank();
		bank.setAccName("mega");
		bank.setBalance(3000);
		
		SavingAccount savings=new SavingAccount();
		savings.setAccName("rachel");
		savings.setBalance(2000);
		savings.setDeposite(3000);
		
		CurrentAccount current=new CurrentAccount();
		current.setAccName("Monica");
		current.setBalance(5000);
		current.setCurrAccBalance(4000);
		
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		Session s1 = factory.openSession();
		s1.beginTransaction();
		s1.save(bank);
		s1.save(savings);
		s1.save(current);
		s1.getTransaction().commit();
		s1.close();

		
		
	}

}
