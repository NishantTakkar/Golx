package com.golx.entity;


public class Inventory {
	
	private int userId;
	private int itemId;
	private String name;
	private int categoryId;
	private int status;
	
	
	
	public Inventory() {
		super();
	}



	public Inventory(int userId, int itemId, String name, int categoryId,
			int status) {
		super();
		this.userId = userId;
		this.itemId = itemId;
		this.name = name;
		this.categoryId = categoryId;
		this.status = status;
	}



	public int getUserId() {
		return userId;
	}



	public void setUserId(int userId) {
		this.userId = userId;
	}



	public int getItemId() {
		return itemId;
	}



	public void setItemId(int itemId) {
		this.itemId = itemId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getCategoryId() {
		return categoryId;
	}



	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}



	public int getStatus() {
		return status;
	}



	public void setStatus(int status) {
		this.status = status;
	}
	
	
	

}
