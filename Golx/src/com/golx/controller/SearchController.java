package com.golx.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.golx.entity.Inventory;
import com.golx.service.SearchService;

@Controller(value="searchController")
public class SearchController {
	@Autowired
	private SearchService searchService;
	
	@RequestMapping(value="/search.htm")
	public String search(@RequestParam("searchText") String searchText, Model model){
		ArrayList<Inventory> items = searchService.search(searchText);
		model.addAttribute("items", items);
		return "search";
	}
	
}
