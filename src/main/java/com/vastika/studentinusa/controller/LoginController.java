package com.vastika.studentinusa.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.vastika.studentinusa.model.User;
import com.vastika.studentinusa.service.UserService;

@Controller
public class LoginController {
	
	private final UserService userService;
	
	@Autowired
	public LoginController(UserService userService) {
		this.userService = userService;
	}
	
	@RequestMapping(value = "/")
	public String getIndex() {
		return "index";
	}
	
	@RequestMapping(value = "/login_user")
	public String getLoginForm() {
		return "loginUser";
	}
	
	@RequestMapping(value = "/logout_user")
	public String getLogOut(Model model, HttpSession session) {
		session.invalidate();
		model.addAttribute("msg", "Logout Successful!!");
		return "loginUser";
	}
	
	@RequestMapping(value = "/success", method=RequestMethod.POST)
	public String login(@RequestParam String username, @RequestParam String password, HttpSession session, Model model) {
		
		User user = userService.getUserByUsernameAndPassword(username, password);
		
		if (user != null) {
			session.setAttribute("uname",username);
			return "redirect:/list_college";
		}
		model.addAttribute("msg", "Incorrect username/password");
		return "loginUser";
	}

}
