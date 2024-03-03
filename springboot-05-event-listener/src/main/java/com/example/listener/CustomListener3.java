package com.example.listener;

import com.example.event.CustomEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * 方式三：不需要实现ApplicationListener接口
 *
 * @Component+@EventListener
 */
@Component
public class CustomListener3 {
    @EventListener
    public void eventListener(CustomEvent event) {
        event.printMessage("CustomListener3监听到了");
    }
    @EventListener
    public void eventListener2(CustomEvent event) {
        event.printMessage("CustomListener33监听到了");
    }
}
