package com.anand.shop.model;

import javax.persistence.Entity;

@Entity // This tells Hibernate to make a table out of this class
public class Supplier {
	
	private String supplier_name;
	private String remarks;
	
	
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getSupplier_name() {
		return supplier_name;
	}
	public void setSupplier_name(String supplier_name) {
		this.supplier_name = supplier_name;
	}	
	
}
