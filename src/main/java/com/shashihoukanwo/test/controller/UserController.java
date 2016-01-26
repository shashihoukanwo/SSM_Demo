package com.shashihoukanwo.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.shashihoukanwo.test.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService; 
	@RequestMapping("/getUser")
	public ModelAndView getUser(@RequestParam("id") int id){
		ModelAndView mv = new ModelAndView("/test/user");
		mv.addObject("user", userService.getUserById(id));
		return mv;
	}
}
