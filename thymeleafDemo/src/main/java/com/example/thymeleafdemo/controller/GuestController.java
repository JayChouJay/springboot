package com.example.thymeleafdemo.controller;

import com.example.thymeleafdemo.bean.Guest;
import com.example.thymeleafdemo.service.GuestService;
import lombok.Data;
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
        List<Guest>guestList= guestService.list();
        model.addAttribute(guestList);
        return "list";
    }
    @RequestMapping("/guest/toAdd")
    public String toAdd(){
        return "add";
    }
    @RequestMapping("/guest/add")
    public String add(Guest guest){
        guestService.add(guest);
        return "redirect:list";
    }
    @RequestMapping("/guest/toUpdate")
    public String toUpdate(String name,Model model){
        model.addAttribute(guestService.get(name));
        return "update";
    }
    @RequestMapping("/guest/update")
    public String update(Guest guest){
        guestService.update(guest);
        return "redirect:list";
    }
    @RequestMapping("/guest/toDelete")
    public String delete(String name){
        guestService.delete(name);
        return "redirect:list";
    }
}
