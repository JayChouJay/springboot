package com.example.controller;

import com.example.config.FoodConfig;
import com.example.domain.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController 是@Controller和@ResponseBody
 * 返回json形式响应结果，而不是师徒（jsp，html）
 */
@RestController
public class HelloController {
    /**
     * @Value 通过${}结构获得配置文件中的属性值
     */
    @Value("${food.rice}")
    private String rice;
    @Value("${food.meat}")
    private String meat;
    @Value("${meatRice}")
    private String meatRice;
    @Value("${randomInt}")
    private Integer randomInt;
    @Autowired
    private FoodConfig foodConfig;

    @RequestMapping("/json")
    public String json() {
        return "hello json";
    }

    @RequestMapping("/food")
    public Food food() {
//        Food food = new Food("烤肉", "拌饭");
        System.out.println(meat + "--" + rice + "--" + meatRice + "--" + randomInt);
        //测试配置类能否注入
        System.out.println(foodConfig);
        Food food = new Food(meat, rice);
        return food;
    }

}
