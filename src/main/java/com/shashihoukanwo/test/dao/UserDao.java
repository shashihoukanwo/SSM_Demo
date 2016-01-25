package com.shashihoukanwo.test.dao;

import org.springframework.stereotype.Repository;

import com.shashihoukanwo.test.entity.User;
@Repository
public interface UserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);
    
    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}