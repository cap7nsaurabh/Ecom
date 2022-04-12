package com.ecom.web.model;

import javax.persistence.Entity;

@Entity
public class CartItem {
	private Items item;
	private Long itemQty;
	public CartItem(Items item, Long itemQty) {
		super();
		this.item = item;
		this.itemQty = itemQty;
	}
	public Items getItem() {
		return item;
	}
	public void setItem(Items item) {
		this.item = item;
	}
	public Long getItemQty() {
		return itemQty;
	}
	public void setItemQty(Long itemQty) {
		this.itemQty = itemQty;
	}
	
	
	
	

}
