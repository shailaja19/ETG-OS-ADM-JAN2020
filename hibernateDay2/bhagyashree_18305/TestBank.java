package com.sonata;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestBank {

	public static void main(String[] args) {
		Bank b1 = new Bank();
		b1.setAccountNum("0977526");
		b1.setAmount(656.8);
		
		SavingsAcc s1 = new SavingsAcc();
		s1.setBankId(10);
		s1.setAccName("Savings Account");
		s1.setAccBalance(675.90);
		s1.setAccountNum("0977526");
		
		CurrentAcc c1 = new CurrentAcc();
		c1.setBankId(20);
		c1.setAccName("Current Account");
		c1.setAccBalance(6565.90);
		c1.setAccountNum("0977526");
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session sess = factory.openSession();
		sess.beginTransaction();
		sess.save(b1);
		sess.save(s1);
		sess.save(c1);
		sess.getTransaction().commit();
		
		

	}

	}


