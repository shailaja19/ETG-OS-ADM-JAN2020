package com.sonota.BankModule;

import com.sonata.Assugnment5.CurrentAcc;
import com.sonata.Assugnment5.JointAcc;
import com.sonata.Assugnment5.SavingAcc;

public class BankMod {

	public static void main(String[] args) {

		SavingAcc a2 = new SavingAcc(124, "Divya",6000);
		
		System.out.println(a2.deposite(5000));
		System.out.println(a2.withDraw(1000));		
		System.out.println();
		
		
		CurrentAcc c2 = new CurrentAcc(154, "Hampi",6000);
		
		System.out.println(c2.deposite(6000));
		System.out.println(c2.withDraw(1000));		
		System.out.println();
		System.out.println();
		
		JointAcc j1=new JointAcc(153,"Sonu",5000);

		
		
		System.out.println(j1.deposite(3000));
		System.out.println(j1.withDraw(1000));
		
		
		System.out.println();
		
	}

}
