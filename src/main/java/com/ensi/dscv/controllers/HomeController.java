package com.ensi.dscv.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@RequestMapping("/welcome")  
	//@ResponseBody
	public String welcome()  // action  n°1
	{
		//return "<h1>Welcome to ENSI</h1>";
		return "welcome";
	}
	
	@RequestMapping("/details")  
	//@ResponseBody
	public String detailsModule(Model model)  // action  n°1
	{
		//return "<h1>Welcome to ENSI</h1>";
		String prof = "Mohamed Amine MEZGHICH";
		String names[]= {"Aissa","Dinari","Bouaziz","Mnejja"};
		model.addAttribute("professeur", prof);
		model.addAttribute("names", names);
		return "details";
	}

}
