package com.hanzo.mybatis.starter.controller;

import com.hanzo.mybatis.starter.model.UserEntity;
import com.hanzo.mybatis.starter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by P10103052 on 2017/4/12.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getUserByAge", method = RequestMethod.GET)
    public UserEntity getuserbyage(@RequestParam(value = "age", required = true) int age) {
        return userService.getUserByAge(age);
    }
}
