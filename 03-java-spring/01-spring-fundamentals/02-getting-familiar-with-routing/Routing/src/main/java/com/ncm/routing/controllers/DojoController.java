package com.ncm.routing.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	
	@RequestMapping("/dojo")
	public String dojo() {
		return "This Dojo is awesome!";
	}
	
	@RequestMapping("dojo/{location}")
	public String showLocation(@PathVariable("location") String showLocation) {
		if(showLocation.equals("burbank")) {
			return "Burbank Dojo is located in Southern Cal.";
		}
		if(showLocation.equals("san jose")) {
			return "San Jose Dojo is the HQ.";
		}
		else {
			return String.format("%s is cool too!", showLocation);
		}
	}
}
