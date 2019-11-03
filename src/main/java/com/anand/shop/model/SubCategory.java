package com.anand.shop.model;

import javax.persistence.Entity;

@Entity // This tells Hibernate to make a table out of this class
public class SubCategory {
	
	private String sub_category_name;
	private String category_name;
	private String remarks;
	
	
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
}
