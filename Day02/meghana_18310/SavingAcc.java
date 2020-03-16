package com.sonata;

public class SavingAcc extends Bank {
	

	SavingAcc(int a,String n,double b)
	{
		super(a,n,b);
		
		
	}
SavingAcc(){
		
	}

public void deposite()
{
	super.deposite();
	System.out.println("Saving account Deposite");
}
	
	public static void main(String[] args) {
		
	
	
	SavingAcc a1=new SavingAcc();
	a1.accNo=123;
	a1.accName="meg";
	a1.accBalance=4556;
	a1.display();
	a1.deposite();
	a1.withDraw();
	
	SavingAcc a2=new SavingAcc(345,"gha",7898);
	a2.display();
	a2.deposite();
	
}

}