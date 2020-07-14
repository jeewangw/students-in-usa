package com.vastika.studentinusa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.vastika.studentinusa.model.College;
import com.vastika.studentinusa.model.Student;
import com.vastika.studentinusa.service.CollegeService;
import com.vastika.studentinusa.service.UserService;

 
@Controller
public class CollegeController {
	
	@Autowired
	private CollegeService collegeService;

	
	@RequestMapping(value = "/add_college")
	public String getAdUserForm() {
		return "addCollege";
	}
	
	@RequestMapping(value = "/list_college")
	public String getAllUserInfo(Model model) {
		model.addAttribute("college",collegeService.getAllCollegeInfo());
		return "listCollege";
	}
	@RequestMapping(value = "/save_college", method=RequestMethod.POST)
	public String saveUserInfo(@ModelAttribute College college) {
		collegeService.saveCollegeInfo(college);
		return "redirect:/list_college";
	}
	@RequestMapping(value = "/delete_college", method = RequestMethod.GET)
	public String deleteCollegeInfo(@RequestParam int id) {
		collegeService.deleteCollegeInfo(id);
		return "redirect:/list_college";
	}
	
	@RequestMapping(value = "/edit_college")
	public String getEditCollegeForm(@RequestParam int id, Model model) {
		model.addAttribute("college",collegeService.getCollegeById(id));
		return "editCollege";
	}
	
	@RequestMapping(value = "/update_college", method=RequestMethod.POST)
	public String updateCollegeInfo(@ModelAttribute College college) {	
		collegeService.updateCollegeInfo(college);
		return "redirect:/list_college";
	}
	
}