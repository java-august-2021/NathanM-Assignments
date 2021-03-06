package com.nathan.code.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CodeController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/bushido", method=RequestMethod.POST)
	public String code(@RequestParam(value="code") String code, RedirectAttributes redirectAttr) {
		System.out.println(code);
		if (code.equals("bushido")) {
			return "redirect:/bushido";
		} else {
			redirectAttr.addFlashAttribute("error", "You must train harder!");
			return "redirect:/";
		}
		}
		
	@RequestMapping(value="/bushido", method=RequestMethod.GET)
	public String code( ) {
		return "bushido.jsp";
	}
	
}