package com.vastika.studentinusa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class CollegeController {
	
	@RequestMapping(value = "/add_college")
	public String getAdUserForm() {
		return "addCollege";
	}
	
}