package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * @Controller视图层使用的注解
 * @RestController 是返回json数据时返回的注解
 */
@Controller
public class FTLController {
    @RequestMapping("/ftl")
    public String ftl(Model model) {
        model.addAttribute("now",new Date().toString());
        return "/freemarker/index";
    }
}
