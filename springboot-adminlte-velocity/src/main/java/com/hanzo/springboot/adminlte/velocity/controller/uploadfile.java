package com.hanzo.springboot.adminlte.velocity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by P10103052 on 2017/3/31.
 */
@Controller
public class uploadfile {

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public void upload(HttpServletRequest request) {
        MultipartHttpServletRequest mreq = (MultipartHttpServletRequest)request;
        MultipartFile file = mreq.getFile("file");
        String fileName = file.getOriginalFilename();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(request.getSession().getServletContext().getRealPath("/")+
                    "upload/"+sdf.format(new Date()) + fileName.substring(fileName.indexOf('.')));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            fos.write(file.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/upload", method = RequestMethod.GET)
    public String upload() {
        return "yangqi01/upload";
    }

}
