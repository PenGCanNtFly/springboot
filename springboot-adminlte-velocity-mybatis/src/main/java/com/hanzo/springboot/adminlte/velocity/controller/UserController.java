package com.hanzo.springboot.adminlte.velocity.controller;

import com.hanzo.springboot.adminlte.velocity.mapper.UserMapper;
import com.hanzo.springboot.adminlte.velocity.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by P10103052 on 2017/4/13.
 */
@Controller
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/getuserbyage")
    @ResponseBody
    public UserEntity getuserbyage(@RequestParam("age") int age) {
        return userMapper.getUserByAge(age);
    }
}
