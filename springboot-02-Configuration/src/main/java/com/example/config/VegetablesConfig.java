package com.example.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 *
 */
@Configuration
@ConfigurationProperties(prefix = "vegetables")
@Data
public class VegetablesConfig {
    private String potato;
    private String eggplant;
    private String greenpeper;
}
