package com.sonata.Bank;



public class JointAcc implements Bank {


		int accNo;
		String accName;
		 double accBalance;
		

		
		
		 public JointAcc() {
			super();
		}
		public JointAcc (int accNo, String accName,double accBal) {
			super();
			this.accNo = accNo;
			this.accName = accName;
			this.accBalance=accBal;
		}



		public double deposite(double  amount)
		{
			
			System.out.println("Joint Account Deposited");
			accBalance= accBalance+amount;
			return accBalance;
		}
		
		public double withDraw(double  amount)
		{
			accBalance= accBalance-amount;
			return accBalance;
		}

}
