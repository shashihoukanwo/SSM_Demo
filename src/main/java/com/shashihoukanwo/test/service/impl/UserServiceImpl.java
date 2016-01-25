package com.shashihoukanwo.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shashihoukanwo.test.dao.UserDao;
import com.shashihoukanwo.test.entity.User;
import com.shashihoukanwo.test.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	@Override
	public User getUserById(int id) {
		User user = userDao.selectByPrimaryKey(id);
		return user;
	}
	@Override
	public void addUser(User user) {
		userDao.insert(user);
	}

}
