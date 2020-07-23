package com.vastika.studentinusa.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.vastika.studentinusa.dto.Login;
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
	public String getLogOut(Model model, HttpSession session, HttpServletResponse response, HttpServletRequest request) {
		session.invalidate();
		
		Cookie[] cookies = request.getCookies();

		if (cookies != null) {
			
			for(int i=0; i<cookies.length; i++){
				if(cookies[i].getName().equals("username")){
					request.setAttribute("usname", cookies[i].getValue());
				}
				else if(cookies[i].getName().equals("password")){
					request.setAttribute("pass", cookies[i].getValue());
				}
				else if(cookies[i].getName().equals("id")){
					request.setAttribute("id", cookies[i].getValue());
				}
			}
		}
		
		model.addAttribute("msg", "Logout Successful!!");
		return "loginUser";
	}
	
	@RequestMapping(value = "/success", method=RequestMethod.POST)
	public String login(@ModelAttribute Login login, HttpSession session,
			HttpServletRequest request,HttpServletResponse response,Model model) {
		System.out.println(login.getUserName());
		User user = userService.getUserByUsernameAndPassword(login.getUserName(), login.getPassword());
		if (user != null) {
			int user_id = user.getId();
			System.out.println(user_id);
			session.setAttribute("uname",login.getUserName());
			session.setAttribute("uid",user_id);
			
			if(login.getRememberMe() != null) {
				Cookie cookie1 = new Cookie("username", login.getUserName());
				Cookie cookie2 = new Cookie("password", login.getPassword());
				Cookie cookie3 = new Cookie("id", String.valueOf(user.getId()));
				cookie1.setMaxAge(100);
				cookie2.setMaxAge(100);
				cookie3.setMaxAge(100);
				response.addCookie(cookie1);
				response.addCookie(cookie2);
				response.addCookie(cookie3);
			}
			
			return "redirect:/list_college";
		}
		model.addAttribute("msg", "Incorrect username/password");
		return "loginUser";
	}

}
