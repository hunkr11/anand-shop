package com.anand.shop.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name    = "item", 
indexes = {@Index(name = "i_item", columnList = "item_name")})
public class Item {
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="category_name",unique = true)    
	private Category category_name;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="sub_category_name", unique = true)   	
	private SubCategory sub_category_name;
	
	@Id
	@Column(name = "item_name", nullable = false)
	private String item_name;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "quantity_name",unique = true)  
	private Quantity quantity_name;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "supplier_name",unique = true) 
	private Supplier supplier_name;
	
	private String remarks;

	public Category getCategory_name() {
		return category_name;
	}

	public void setCategory_name(Category category_name) {
		this.category_name = category_name;
	}

	public SubCategory getSub_category_name() {
		return sub_category_name;
	}

	public void setSub_category_name(SubCategory sub_category_name) {
		this.sub_category_name = sub_category_name;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public Quantity getQuantity_name() {
		return quantity_name;
	}

	public void setQuantity_name(Quantity quantity_name) {
		this.quantity_name = quantity_name;
	}

	public Supplier getSupplier_name() {
		return supplier_name;
	}

	public void setSupplier_name(Supplier supplier_name) {
		this.supplier_name = supplier_name;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
	
}
