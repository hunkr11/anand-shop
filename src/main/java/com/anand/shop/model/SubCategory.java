package com.anand.shop.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name    = "sub_category", 
indexes = {@Index(name = "i_sub_category", columnList = "sub_category_name")})
public class SubCategory {
	
	@Id
	@Column(name = "sub_category_name", nullable = false)
	private String sub_category_name;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(unique = true)    
	private Category category_name;
	
	private String remarks;
	
	
	
	public String getSub_category_name() {
		return sub_category_name;
	}
	public void setSub_category_name(String sub_category_name) {
		this.sub_category_name = sub_category_name;
	}
	public Category getCategory_name() {
		return category_name;
	}
	public void setCategory_name(Category category_name) {
		this.category_name = category_name;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
}
