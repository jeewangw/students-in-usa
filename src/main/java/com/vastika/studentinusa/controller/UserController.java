package com.vastika.studentinusa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vastika.studentinusa.service.UserService;
import com.vastika.studentinusa.model.User;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/add_user")
	public String getAdUserForm() {
		return "addUser";
	}
	
	@RequestMapping(value = "/save_user", method=RequestMethod.POST)
	public String saveUserInfo(@ModelAttribute User user) {
		userService.saveUserInfo(user);
		return "redirect:/list_user";
	}
	
	@RequestMapping(value = "/list_user")
	public String getAllUserInfo(Model model) {
		model.addAttribute("users",userService.getAllUserInfo());
		return "listUser";
	}
	
}
