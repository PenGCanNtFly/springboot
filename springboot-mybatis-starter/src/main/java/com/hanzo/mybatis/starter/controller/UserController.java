package com.hanzo.mybatis.starter.controller;

import com.hanzo.mybatis.starter.mapper.UserMapper;
import com.hanzo.mybatis.starter.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by P10103052 on 2017/4/13.
 */
@Controller
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello";
    }


    @GetMapping("/getuserbyage")
    @ResponseBody
    public UserEntity getuserbyage(@RequestParam("age") int age) {
        return userMapper.getUserByAge(age);
    }
}
