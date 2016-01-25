package com.shashihoukanwo.test.service;

import com.shashihoukanwo.test.entity.User;

public interface UserService {
	/**
	 * 根据id查询 用户
	 * @param id
	 * @return
	 */
	public User getUserById(int id);
	/**
	 * 添加用户
	 * @param user
	 */
	public void addUser(User user);
}
