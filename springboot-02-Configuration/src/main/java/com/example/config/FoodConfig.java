package com.example.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ConfigurationProperties 声明这是一个配置类,将配置文件中的对应数据注入给属性
 */
@ConfigurationProperties(prefix = "food")
@Data
public class FoodConfig {
    private String rice;
    private String meat;
    private String[] sauce;

}
