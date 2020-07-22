package com.vastika.studentinusa.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.vastika.studentinusa.model.User;
import com.vastika.studentinusa.service.UserService;
import com.vastika.studentinusa.util.ImageUtil;


@Controller
public class ImageController {
	private UserService userService;
	
	@Autowired
	public ImageController(UserService userService) {
		this.userService = userService;
	}
	
	
	@RequestMapping(value = "/image_display")
	public void displayImage(@RequestParam int id, HttpServletResponse response) {
		User user= userService.getUserById(id);
		ImageUtil.readImageFromDisk(user.getImageUrl(), response);
		
	}

}
