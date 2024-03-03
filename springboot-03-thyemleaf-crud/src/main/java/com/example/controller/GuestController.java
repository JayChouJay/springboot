package com.example.controller;

import com.example.domain.Guest;
import com.example.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 业务控制类 返回视图
 */
@Controller
public class GuestController {
    @Autowired
    private GuestService guestService;

    /**
     * 查询所有嘉宾
     * @param model
     * @return 返回 带有嘉宾列表 的 嘉宾列表 页面
     */
    @RequestMapping("/guest/list")
    public String list(Model model) {
        List<Guest> guestList = guestService.list();
        model.addAttribute(guestList);
        return "list";
    }

    /**
     * 跳转到 增加嘉宾 页面
     * @return
     */
    @RequestMapping("/guest/toAdd")
    public String toAdd() {
        return "add";
    }

    /**
     * 增加嘉宾
     * @param guest
     * @return 返回 嘉宾列表 页面
     */
    @RequestMapping("/guest/add")
    public String add(Guest guest) {
        guestService.add(guest);
        return "redirect:list";
    }

    /**
     * 根据 姓名 跳转到 更新嘉宾 页面
     * @param name
     * @param model
     * @return
     */
    @RequestMapping("/guest/toUpdate")
    public String toUpdate(String name, Model model) {
        model.addAttribute(guestService.get(name));
        return "update";
    }

    /**
     * 更新 指定 嘉宾信息
     * @param guest
     * @return返回嘉宾列表页面
     */
    @RequestMapping("/guest/update")
    public String update(Guest guest) {
        guestService.update(guest);
        return "redirect:list";
    }

    /**
     * 根据 名字 删除 嘉宾
     * @param name
     * @return返回嘉宾列表页
     */
    @RequestMapping("/guest/toDelete")
    public String delete(String name) {
        guestService.delete(name);
        return "redirect:list";
    }
}
