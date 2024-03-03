package com.example.config;

import com.example.filter.CustomFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
    @Bean
    public FilterRegistrationBean<CustomFilter> filterRegistrationBean() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        CustomFilter customFilter = new CustomFilter();

        registrationBean.setFilter(customFilter);
        //设置过滤规则
        registrationBean.addUrlPatterns("/*");
        //决定注册的优先级
        //registrationBean.setOrder(0);
        return registrationBean;
    }
}
