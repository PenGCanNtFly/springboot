package com.hanzo.springboot.adminlte.velocity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by P10103052 on 2017/3/29.
 */
@Controller
public class ThirdPageLayoutController {
    @RequestMapping(value = "/thirdpage", method = RequestMethod.GET)
    public String thirdpage() {
        return "yangqi01/thirdpage-layout";
    }
}
