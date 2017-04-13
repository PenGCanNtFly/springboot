package com.hanzo.springboot.adminlte.velocity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by P10103052 on 2017/3/28.
 */
@Controller
public class FirstPageController {
    @RequestMapping(value = "/firstpage", method = RequestMethod.GET)
    public String firstPage() {
        return "yangqi01/firstpage";
    }
}
