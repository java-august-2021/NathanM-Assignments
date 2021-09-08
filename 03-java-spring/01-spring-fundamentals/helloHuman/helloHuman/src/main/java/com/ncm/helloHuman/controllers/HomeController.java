package com.ncm.helloHuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@RequestMapping("/")
		public String index(Model model, @RequestParam(value="first_name", required=false, defaultValue="Human")String first_name, @RequestParam(value="last_name", required=false, defaultValue="")String last_name) {
			model.addAttribute("first_name", first_name);
			model.addAttribute("last_name", last_name);
			return "index.jsp";
	}
}