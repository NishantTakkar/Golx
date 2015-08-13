package com.golx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InventoryUi {
	
		@RequestMapping(value="/SavedItem.htm")
		public void saveItem(@ModelAttribute)

}
