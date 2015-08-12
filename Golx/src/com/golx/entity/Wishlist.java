package com.golx.entity;

public class Wishlist {
	
	int userId;
	String category;
	String item_name;
	int status;

	public Wishlist() {
		
	}
	
	public Wishlist(int userId, String category, String item_name, int status) {
		super();
		this.userId = userId;
		this.category = category;
		this.item_name = item_name;
		this.status = status;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	

}
