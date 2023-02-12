package com.example.springbootjpa.controller;

import com.example.springbootjpa.bean.Guest;
import com.example.springbootjpa.bean.User;
import com.example.springbootjpa.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 *
 */
@Controller
public class GuestController {
    @Autowired
    private GuestService guestService;
    @RequestMapping("/guest/list")
    public String list(Model model){
        List<User>userList= guestService.list();
        model.addAttribute(userList);
        return "list";
    }
}
