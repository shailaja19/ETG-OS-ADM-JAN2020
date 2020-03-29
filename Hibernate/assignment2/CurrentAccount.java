package com.sonata;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="BANK_CURRENT")
public class CurrentAccount extends Bank {
	
	private double currAccBalance;

	public double getCurrAccBalance() {
		return currAccBalance;
	}

	public void setCurrAccBalance(double currAccBalance) {
		this.currAccBalance = currAccBalance;
	}
	
	

}
