package com.sonata.BankModule;

import com.sonata.BankApp.CurrentAcc;
import com.sonata.BankApp.JointAcc;
import com.sonata.BankApp.SavingAcc;

public class BankMod {

	public static void main(String[] args) {

		SavingAcc a2 = new SavingAcc(124, "Meghana",6000);
		
		System.out.println(a2.deposite(5000));
		System.out.println(a2.withDraw(1000));		
		System.out.println();
		
		
		CurrentAcc c2 = new CurrentAcc(124, "Meghana",6000);
		
		System.out.println(c2.deposite(5000));
		System.out.println(c2.withDraw(1000));		
		System.out.println();
		System.out.println();
		
		JointAcc j1=new JointAcc(123,"Nilesh",5000);

		
		
		System.out.println(j1.deposite(2000));
		System.out.println(j1.withDraw(1000));
		
		
		System.out.println();
		
	}

}
