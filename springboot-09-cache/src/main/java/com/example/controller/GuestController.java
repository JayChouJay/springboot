package com.example.controller;

import com.example.domain.Guest;
import com.example.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 业务控制类 返回视图
 */
@RestController
@RequestMapping("/guest")
public class GuestController {
    @Autowired
    private GuestService guestService;

    /**
     * 查询所有嘉宾
     *
     * @param model
     * @return 返回 带有嘉宾列表 的 嘉宾列表 页面
     */
    @GetMapping
    public String list(Model model) {
        List<Guest> guestList = guestService.list();
        model.addAttribute(guestList);
        System.out.println(guestList.toString());
        return guestList.toString();
    }

    @GetMapping("/{id}")
    public Guest getGuests(@PathVariable("id") int id) {
        Guest guest = guestService.get(id);
        return guest;
    }

    /**
     * http://localhost:8080/guest/update?id=2&name=杨紫&role=大堂经理
     *
     * @param guest
     * @return
     */
    @GetMapping("/update")
    public String update(Guest guest) {
        guestService.update(guest);
        return "Success";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id) {
        if (id != 0)
            guestService.delete(id);
        else
            guestService.deleteAll();
        return "Success";
    }
}
