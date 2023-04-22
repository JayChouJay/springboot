package com.example.controller;

import com.example.bean.Restaurant;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeController {
    @RequestMapping("/thyme")
    public String thymeleaf(Model model) {
        //第一部分：简单传值
        model.addAttribute("name", "Thymeleaf");
        //第二部分：解析标签
        model.addAttribute("name2", "<h3>Thymeleaf<h3>");
        //第三部分：传递对象
        model.addAttribute("restaurant", new Restaurant("黄晓明", "林大厨"));
        return "thymeleaf/index";
    }

    @RequestMapping("/welcome")
    public String welcome() {
        return "thymeleaf/welcome";
    }
}
