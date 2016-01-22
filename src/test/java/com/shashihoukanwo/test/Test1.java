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
public class Test1 {
	@Autowired
	private UserService userService;
	@Test
	public void test1(){
		User user = userService.getUserById(1);
		System.out.println(user.toString());
	}
}
