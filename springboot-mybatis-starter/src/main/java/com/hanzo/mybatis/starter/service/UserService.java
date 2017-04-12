package com.hanzo.mybatis.starter.service;

import com.hanzo.mybatis.starter.model.UserEntity;
import org.springframework.stereotype.Service;

/**
 * Created by P10103052 on 2017/4/12.
 */
public interface UserService {
    UserEntity getUserByAge(int age);
}
