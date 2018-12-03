package com.lsj.test.securitytest.controller;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @descriptions:
 * @version: v1.0.0
 * @author: linsj3
 * @create: 2018-11-29 09:32
 **/
@Controller
public class UserController {
    @RequestMapping(value = "/login.do")
    public String login(){
        return "login";
    }

    @RequestMapping(value = "/doLogin.do")
    public void doLogin(String username,String password){

    }

    @RequestMapping(value = "/home")
    public String home(){
        return "home";
    }

    @RequestMapping(value = "/")
    public String defaults(){
        return "index";
    }
}
