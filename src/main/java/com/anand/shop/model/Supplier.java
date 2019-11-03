package com.anand.shop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "supplier",
indexes = {@Index(name = "i_supplier",  columnList="supplier_name", unique = true)})
public class Supplier {
	
	@Id
	@Column(name = "supplier_name", nullable = false)
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
