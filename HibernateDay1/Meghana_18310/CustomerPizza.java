package com.sonata;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name="CustomerPizza")
@SecondaryTable(name="OrderPizza")
public class CustomerPizza {
	
	@Id
	@GeneratedValue
	private int custId;
	
	private String custName;
	private int custPhone;
	
	@Column(table="OrderPizza")
	private String preferences;
	
	@Column(table="OrderPizza")
	private String crustStyle;
	
	@Column(table="OrderPizza")
	private String toppings;

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public int getCustPhone() {
		return custPhone;
	}

	public void setCustPhone(int custPhone) {
		this.custPhone = custPhone;
	}

	public String getPreferences() {
		return preferences;
	}

	public void setPreferences(String preferences) {
		this.preferences = preferences;
	}

	public String getCrustStyle() {
		return crustStyle;
	}

	public void setCrustStyle(String crustStyle) {
		this.crustStyle = crustStyle;
	}

	public String getToppings() {
		return toppings;
	}

	public void setToppings(String toppings) {
		this.toppings = toppings;
	}
	
	
	
	
	
	
	
	

}
