package com.shashihoukanwo.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.shashihoukanwo.test.entity.User;
import com.shashihoukanwo.test.service.UserService;

@Controller
@RequestMapping("user/")
public class UserController {
	@Autowired
	private UserService userService; 
	private Logger logger = LoggerFactory.getLogger(UserController.class);
	@RequestMapping("getUser")
	public ModelAndView getUser(@RequestParam("id") int id){
		ModelAndView mv = new ModelAndView("test/user");
		User user = userService.getUserById(id);
		mv.addObject("user", user);
		logger.info(user.toString());
		return mv;
	}
}
