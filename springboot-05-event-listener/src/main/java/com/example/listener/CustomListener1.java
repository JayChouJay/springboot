package com.example.listener;

import com.example.event.CustomEvent;
import org.springframework.context.ApplicationListener;

/**
 * 方式一：容器加载
 * 四种顺序：4 2 3 1
 */
public class CustomListener1 implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent event) {
        event.printMessage("CustomListener1监听到了");
    }
}
