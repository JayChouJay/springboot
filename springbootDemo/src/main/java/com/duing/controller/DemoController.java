package com.duing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.ResponseWrapper;

@Controller
public class DemoController {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello World";
    }
}
