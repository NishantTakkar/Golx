package com.golx.dao;

import java.util.ArrayList;

import com.golx.entity.Inventory;

public interface SearchDao {
	public ArrayList<Inventory> search(String searchText);
}
