package com.example.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * controller通知
 *
 * 内嵌Component注解
 * 切面的处理方式，使用@ControllerAdvice注解（Spring3.x提供的）
 */
@ControllerAdvice
public class MyExceptionHandler {
    @ExceptionHandler(ArithmeticException.class)
    public ModelAndView handler2(Exception e) {
        ModelAndView mv = new ModelAndView();

        mv.addObject("message", e.getMessage()+",number");
        mv.setViewName("/error");
        return mv;
    }

    @ExceptionHandler(Exception.class)
    public ModelAndView handler(Exception e) {
        ModelAndView mv = new ModelAndView();

        mv.addObject("message", e.getMessage());
        mv.setViewName("/error");
        return mv;
    }



}
