package com.nathan.displaydate.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/date") 
		public String date(Model model) {
			SimpleDateFormat dtformat = new SimpleDateFormat("EEEEE, 'the' dd 'of' MMMM, yyyy");
			String nowDate = dtformat.format(new Date());
			model.addAttribute("date", nowDate);
			return "date.jsp";
	}
	
	@RequestMapping("/time")
		public String time(Model model) {
		SimpleDateFormat dtformat = new SimpleDateFormat("h:mm a");
		String nowTime = dtformat.format(new Date());
		model.addAttribute("time", nowTime);
		return "time.jsp";
	}
}
