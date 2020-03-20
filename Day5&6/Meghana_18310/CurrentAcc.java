package com.sonata.BankApp;

import com.sonata.BankApp.BankInterface.Bank;

public class CurrentAcc implements Bank {
	int accNo;
	String accName;
	 double accBalance;
	

	
	
	 public CurrentAcc(int accNo, String accName,double accBal) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.accBalance=accBal;
	}



	public double deposite(double  amount)
	{
		
		System.out.println("Current Account Deposited");
		accBalance= accBalance+amount;
		return accBalance;
	}
	
	public double withDraw(double  amount)
	{
		accBalance= accBalance-amount;
		return accBalance;
	}
	

}
