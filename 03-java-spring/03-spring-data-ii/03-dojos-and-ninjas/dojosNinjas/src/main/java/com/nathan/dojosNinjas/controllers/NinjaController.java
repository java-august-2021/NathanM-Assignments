package com.nathan.dojosNinjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nathan.dojosNinjas.models.Dojo;
import com.nathan.dojosNinjas.models.Ninja;
import com.nathan.dojosNinjas.services.DojoService;
import com.nathan.dojosNinjas.services.NinjaService;

@Controller
public class NinjaController {
	private NinjaService nService;
	@Autowired
	private DojoService dService;
	
	public NinjaController(NinjaService nService) {
		this.nService = nService;
	}
	
	//3. Create new ninja
	
	@PostMapping("/ninjas/new")
	public String newNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		this.nService.newNinja(ninja);
		System.out.println(ninja);
		return "redirect:/ninjas/new";
	}
	
	@RequestMapping("/ninjas/new")
	public String newNinja(@ModelAttribute("ninja")Ninja ninja, Model model) {
		List<Dojo> allDojos = this.dService.showDojos();
		model.addAttribute("allDojos", allDojos);
		return "newNinja.jsp";
	}
}
