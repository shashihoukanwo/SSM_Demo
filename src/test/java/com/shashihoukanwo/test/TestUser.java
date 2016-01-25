package com.shashihoukanwo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
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
	@Test
	public void testAddUser(){
		User user = new User();
		user.setAge(10000);
		user.setId(3);
		user.setName("一元帝君");
		userService.addUser(user);
	}
	@Test
	public void testGetUserById(){
		User user = userService.getUserById(3);
		System.out.println(user.toString());
	}
}
