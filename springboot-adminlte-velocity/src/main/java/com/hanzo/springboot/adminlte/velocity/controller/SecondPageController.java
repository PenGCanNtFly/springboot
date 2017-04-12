package com.hanzo.springboot.adminlte.velocity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by P10103052 on 2017/3/28.
 */
@Controller
public class SecondPageController {

   @RequestMapping(value = "/secondpage/submit", method = RequestMethod.POST)
   @ResponseBody
   public void submit(@RequestParam(value = "email",required = true) String email,
                        @RequestParam(value = "passwd",required = true) String passwd) {
      System.out.println(email);
   }

   @RequestMapping(value = "/secondpage", method = RequestMethod.GET)
   public String secondpage() {
      return "yangqi01/secondpage";
   }
}
