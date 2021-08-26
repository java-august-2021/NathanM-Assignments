package com.nathan.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterController {
	@RequestMapping("/")
	public String index(HttpSession session) {
		if(session.getAttribute("visitCount") == null) {
			session.setAttribute("visitCount", 0);
		} else {
			int counter = (int)session.getAttribute("visitCount");
			counter++;
			session.setAttribute("visitCount", counter);
		}
		return "index.jsp";
	}
	
	@RequestMapping("/counter")
	public String counter(Model model, HttpSession session) {
		Integer count = (Integer)session.getAttribute("visitCount");
		if(count == null) {
			model.addAttribute("current", 0);
		} else {
			model.addAttribute("current", count);
		}
		return "counter.jsp";
	}
	
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		session.setAttribute("visitCount", 0);
		return "redirect:/counter";
	}
}
