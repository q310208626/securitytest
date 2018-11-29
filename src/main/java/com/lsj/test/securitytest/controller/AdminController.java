package com.lsj.test.securitytest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @descriptions:
 * @version: v1.0.0
 * @author: linsj3
 * @create: 2018-11-29 10:33
 **/
@Controller
@RequestMapping(value = "/admin")
public class AdminController {

    @RequestMapping(value = "/auth")
    public String getAuth(){
        return "auth";
    }
}
