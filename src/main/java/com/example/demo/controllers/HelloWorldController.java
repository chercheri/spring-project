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


	/*
	*TODO CREATE CONTROLLLER THAT CALLS A SERVICE
	*CONTROLLER TAKES 2 INT PARAMETERS
	* WITH GET
	*service calcul SOMME des 2 parametres
	 * */

	/*
	 *TODO CREATE CONTROLLLER THAT CALLS A SERVICE
	 *CONTROLLER TAKES 2 INT PARAMETERS
	 * AND STRING PARAMETER : Arithmetique operator  exmple : "+ , - , * , / "
	 * WITH POST
	 *service calcul PARAMETRE1  OPERATOR  PARAMETRE 2
	 * */



	/*
	 *TODO CREATE CONTROLLLER THAT CALLS A SERVICE
	 *CONTROLLER  TAKES STRING PARAMETER
	 * WITH GET
	 * PARSING THE STRING WILL GET INT THEN OPERATOR THEN INT BEWARE OF SPACES
	 *service calcul PARAMETRE1  OPERATOR  PARAMETRE 2
	 * */

}
