package com.sonata;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="SavingsAcc2")

public class SavingsAcc extends Bank{
	
	private int AccNo;
	private String AccName;
	 private double AccBalance;
	public int getAccNo() {
		return AccNo;
	}
	public void setAccNo(int accNo) {
		AccNo = accNo;
	}
	public String getAccName() {
		return AccName;
	}
	public void setAccName(String accName) {
		AccName = accName;
	}
	public double getAccBalance() {
		return AccBalance;
	}
	public void setAccBalance(double accBalance) {
		AccBalance = accBalance;
	}
	 
	 

}
