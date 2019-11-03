package com.anand.shop.model;

import javax.persistence.Entity;

@Entity
public class Item {

	private String category_name;
	private String sub_category_name;
	private String item_name;
	private String quantity_name;
	private String supplier_name;
	
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	public String getSub_category_name() {
		return sub_category_name;
	}
	public void setSub_category_name(String sub_category_name) {
		this.sub_category_name = sub_category_name;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public String getQuantity_name() {
		return quantity_name;
	}
	public void setQuantity_name(String quantity_name) {
		this.quantity_name = quantity_name;
	}
	public String getSupplier_name() {
		return supplier_name;
	}
	public void setSupplier_name(String supplier_name) {
		this.supplier_name = supplier_name;
	}
	
	
}
