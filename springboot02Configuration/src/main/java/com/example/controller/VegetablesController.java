package com.example.controller;

import com.example.config.FoodConfig;
import com.example.config.VegetablesConfig;
import com.example.domain.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VegetablesController {
    @Autowired
    VegetablesConfig vConfig;

    @RequestMapping("/vegetables")
    public String vegetables() {
        //验证普通properties注入成功
        System.out.println(vConfig.getPotato() + "--" + vConfig.getEggplant() + "--" + vConfig.getGreenpeper());
        return null;
    }

}
