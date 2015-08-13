package com.golx.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.golx.dao.SearchJDBCDaoImpl;
import com.golx.entity.Inventory;

@Service(value="searchService")
public class SearchService {
	@Autowired
	private SearchJDBCDaoImpl searchJDBCDaoImpl;
	
	public ArrayList<Inventory> search(String searchText) {
		
		return null;
	}
	
}
