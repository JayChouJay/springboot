package com.example.resolver;

import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * 自定义的错误页解析器
 */
@Component
public class MyErrorViewResolver implements ErrorViewResolver {

    @Override
    public ModelAndView resolveErrorView(HttpServletRequest request, HttpStatus status, Map<String, Object> model) {
        if (status.equals(HttpStatus.NOT_FOUND)) {
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("/resolver404");
            return modelAndView;
        }
        return null;
    }
}
