package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	@GetMapping("/home")
	
	public String home(@RequestParam(required = false ,defaultValue = "World") String name,@RequestParam(defaultValue = "20") int age, ModelMap modelMap) {
		modelMap.put("nom",name);
		modelMap.put("age", age);
		return "pages/home";
	}
}
