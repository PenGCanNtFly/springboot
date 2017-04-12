package com.hanzo.mybatis.starter.service.impl;

import com.hanzo.mybatis.starter.mapper.UserDao;
import com.hanzo.mybatis.starter.model.UserEntity;
import com.hanzo.mybatis.starter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by P10103052 on 2017/4/12.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public UserEntity getUserByAge(int age) {
        return userDao.getUserByAge(age);
    }

}
