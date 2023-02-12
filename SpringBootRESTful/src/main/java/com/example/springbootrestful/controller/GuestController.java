package com.example.springbootrestful.controller;

import com.example.springbootrestful.bean.Guest;
import com.example.springbootrestful.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    public String list(Model model){
        List<Guest>guestList= guestService.list();
        model.addAttribute(guestList);
        return "list";
    }
    @GetMapping ("/toAdd")
    public String toAdd(){
        return "add";
    }
    @PostMapping
    public String add(Guest guest){
        guestService.add(guest);
        return "redirect:/guest";
    }
    @GetMapping("/toUpdate/{name}")
    public String toUpdate(@PathVariable String name, Model model){
        model.addAttribute(guestService.get(name));
        return "update";
    }
    @PutMapping
    public String update(Guest guest){
        guestService.update(guest);
        return "redirect:/guest";
    }
    @DeleteMapping("/{name}")
    public String delete(@PathVariable String name){
        guestService.delete(name);
        return "redirect:/guest";
    }
}
