package com.golx.service;

import com.golx.dao.InventoryDaoImpl;
import com.golx.entity.Inventory;

public class InventoryService {
	InventoryDaoImpl inventoryDaoImpl;
	public void validate(Inventory inventory){
		if(inventory.getName()!=null){
			inventoryDaoImpl.addItem(inventory);
			
		}
	}
	

}
