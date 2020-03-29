package com.sonata;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Bank2")
@Inheritance(strategy=InheritanceType.JOINED)

public class Bank {
	
	@Id
	//@GeneratedValue
	private int BankId;
	private String AccountNum;
	private double Amount;
	public int getBankId() {
		return BankId;
	}
	public void setBankId(int bankId) {
		BankId = bankId;
	}
	public String getAccountNum() {
		return AccountNum;
	}
	public void setAccountNum(String accountNum) {
		AccountNum = accountNum;
	}
	public double getAmount() {
		return Amount;
	}
	public void setAmount(double amount) {
		Amount = amount;
	}
	
	

}
