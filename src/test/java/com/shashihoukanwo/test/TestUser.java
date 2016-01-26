package com.shashihoukanwo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shashihoukanwo.test.entity.User;
import com.shashihoukanwo.test.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-app.xml"})
public class TestUser {
	@Autowired
	private UserService userService;
	Logger logger = LoggerFactory.getLogger(TestUser.class);
	@Test
	public void testAddUser(){
		User user = new User();
		user.setAge(10000);
		user.setId(8);
		user.setName("五行帝君");
		System.out.println(userService);
		userService.addUser(user);
		
	}
	@Test
	public void testGetUserById(){
		User user = userService.getUserById(1);
		logger.debug(user.toString());
	}
}
