package com.nathan.dojosNinjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nathan.dojosNinjas.models.Dojo;
import com.nathan.dojosNinjas.models.Ninja;
import com.nathan.dojosNinjas.services.DojoService;
import com.nathan.dojosNinjas.services.NinjaService;

@Controller
public class DojoController {
	private DojoService dService;
	@Autowired
	private NinjaService nService;
	
	public DojoController(DojoService dService) {
		this.dService = dService;
	}
	
	//1. Create a new Dojo
	
	@PostMapping("/dojos/new")
	public String newDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result){
		this.dService.newDojo(dojo);
		System.out.println(dojo.getName());
		return "redirect:/dojos/new";
	}
	
	//2. Have a dojo show page show information of all the ninjas that belong to that specific location.

	@RequestMapping("/dojos/{id}")
	public String allDojos(@PathVariable("id") Long id, Dojo dojo, Model model) {
		Dojo dojoDisplay = this.dService.oneDojo(id);
		List<Ninja> showAllNinjas = this.nService.allNinjas(dojoDisplay);
		model.addAttribute("showAllNinjas", showAllNinjas);
		model.addAttribute("dojoDisplay", dojoDisplay);
		return "dojoPage.jsp";
	}
	
	@RequestMapping("/dojos/new")
	public String newDojo(@ModelAttribute("dojo") Dojo dojo) {
		return "newDojo.jsp";
	}
	
}
