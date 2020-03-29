package com.sonata;

import javax.persistence.Entity;

@Entity
public class SavingAccount extends Bank {
	
	private double deposite;

	public double getDeposite() {
		return deposite;
	}

	public void setDeposite(double deposite) {
		this.deposite = deposite+balance;
	}
	
	
	

}
