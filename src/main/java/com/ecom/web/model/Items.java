package com.ecom.web.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Items {
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long itemId;
	private String itemName;
	private Double itemPrice;
	private long itemQty;
	public Items(String itemName, Double itemPrice, long itemQty) {
		super();
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemQty = itemQty;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(Double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public long getItemQty() {
		return itemQty;
	}
	public void setItemQty(long itemQty) {
		this.itemQty = itemQty;
	}
	
	

}
