package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyErrorController {
    @RequestMapping("/error404")
    public String error404() {
        return "error404";
    }

    /**
     * /testError:/error被系统本身申明
     */
    @RequestMapping("/testError")
    public String error() throws Exception {
        throw new Exception("测试异常");
    }

    @RequestMapping("/testNullError")
    public String nullError() throws Exception {
        int val = 1 / 0;
        return "list";
    }
}
