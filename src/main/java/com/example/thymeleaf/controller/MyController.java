package com.example.thymeleaf.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MyController {
	
	
	@RequestMapping("/about")
	public String about(Model model) {
		System.out.println("Inside about handler");
		
		model.addAttribute("name","Komal");
		model.addAttribute("Age",19);
		model.addAttribute("CurrentDate",new Date());
		return "about.html"
				+ "";
	}
	
}
