package com.anand.shop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "category",
indexes = {@Index(name = "i_category",  columnList="category_name", unique = true)})
public class Category {	
	
	@Id
	@Column(name = "category_name", nullable = false)
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
