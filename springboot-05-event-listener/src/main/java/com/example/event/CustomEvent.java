package com.example.event;

import org.springframework.context.ApplicationEvent;

import java.time.Clock;

public class CustomEvent extends ApplicationEvent {
    public CustomEvent(Object source) {
        super(source);
    }
    public void printMessage(String msg){
        System.out.println("自定义事件，打印信息："+msg);
    }
}
