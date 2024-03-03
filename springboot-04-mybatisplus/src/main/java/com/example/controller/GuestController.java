package com.example.controller;

import com.example.bean.User;
import com.example.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 *
 */
@Controller
@RequestMapping("/guest")
public class GuestController {
    @Autowired
    private GuestService guestService;

    @GetMapping
    public String list(Model model) {
        List<User> userList = guestService.list();
        model.addAttribute(userList);
        return "list";
    }

    @GetMapping("/toAdd")
    public String toAdd() {
        return "add";
    }

    /**
     * @Transactional
     * 声明事务
     * @param user
     * @return
     */
    @Transactional
    @PostMapping
    public String add(User user) {
        System.out.println(user);
        guestService.save(user);
        //测试@Transactional注解
        int result = 1 / 0;
        return "redirect:list";
    }
}