package com.hanzo.springboot.adminlte.velocity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by P10103052 on 2017/3/30.
 */
@Controller
public class ztree {

//   @RequestMapping("/get_json")
//   public String getJson(HttpServletResponse response) {
//       response.setContentType("text/html;charset=utf-8");

//       String s1 = "{id:1, pId:0, name:\"test1\" , open:true}";
//       String s2 = "{id:2, pId:1, name:\"test2\" , open:true}";
//       String s3 = "{id:3, pId:1, name:\"test3\" , open:true}";
//       String s4 = "{id:4, pId:2, name:\"test4\" , open:true}";

//       List<String> lstTree = new ArrayList<String>();
//       lstTree.add(s1);
//       lstTree.add(s2);
//       lstTree.add(s3);
//       lstTree.add(s4);

//       JSONArray jsonArray = JSONArray.fromObject(lstTree);
//       jsonArrayString = jsonArray.toString();
//       PrintWriter out = response.getWriter();
//       out.write(jsonArrayString);
//       out.flush();
//       out.close();
//       return null;
//   }

    @RequestMapping(value = "/textarea/submit", method = RequestMethod.POST)
    @ResponseBody
    public String acceptformdata(@RequestParam(value = "textinfo", required = true) String textinfo) {
        System.out.println(textinfo);
        return  "redirect: yangqi01/firstpage";
    }

    @RequestMapping(value = "/ztree", method = RequestMethod.GET)
    public String ztree() {
        return "yangqi01/ztree";
    }
}
