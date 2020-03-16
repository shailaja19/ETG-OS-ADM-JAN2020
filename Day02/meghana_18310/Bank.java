package com.sonata;

public class Bank {

	int accNo;
	String accName;
	double accBalance;
	Bank(int no,String name,double bal)
	{
		this.accNo=no;
		this.accName=name;
		this.accBalance=bal;
	}
	
	Bank()
	{
		
	}
	public void deposite()
	{
		System.out.println("Bank Deposite");
	}
	
	public void withDraw()
	{
		System.out.println("Bank withDraw");
	}
	
	
	public void display()
	{
		System.out.println(accNo);
		System.out.println(accName);
		System.out.println(accBalance);
	}
}
