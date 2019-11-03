package com.anand.shop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "quantity",
indexes = {@Index(name = "i_quantity",  columnList="quantity_name", unique = true)})
public class Quantity {
	
	@Id
	@Column(name = "quantity_name", nullable = false)
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
