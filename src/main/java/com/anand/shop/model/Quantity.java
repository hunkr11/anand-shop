package com.anand.shop.model;

import javax.persistence.Entity;

@Entity // This tells Hibernate to make a table out of this class
public class Quantity {
	
	private String quantity_name;
	private String remarks;
	
	
	public String getQuantity_name() {
		return quantity_name;
	}
	public void setQuantity_name(String quantity_name) {
		this.quantity_name = quantity_name;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
}
