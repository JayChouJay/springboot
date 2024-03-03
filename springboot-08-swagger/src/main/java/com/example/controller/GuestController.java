package com.example.controller;

import com.example.bean.Guest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @RequestMapping 放在类上面代表类里面的方法是以此开头
 */
@RestController
@RequestMapping("/guest")
@Api(tags = "嘉宾相关的接口", description = "对嘉宾进行增删改查的接口")
public class GuestController {

    /**
     * 查
     *
     * @param model
     * @return
     */
    @GetMapping
    @ApiOperation("查询嘉宾列表")
    public String list(Model model) {
        return "list";
    }

    @ApiIgnore
    @GetMapping("/toAdd")
    public String toAdd() {
        return "add";
    }

    /**
     * 增加
     *
     * @param guest
     * @return
     */
    @PostMapping
    public String add(Guest guest) {
        return "redirect:/guest";
    }

    @ApiIgnore
    @GetMapping("/toUpdate/{name}")
    public String toUpdate(@PathVariable String name, Model model) {
        return "update";
    }

    /**
     * 改
     *
     * @param guest
     * @return
     */
    @ApiOperation("更新嘉宾接口")
    @PutMapping
    public String update(Guest guest) {
        return "redirect:/guest";
    }

    /**
     * 删
     *
     * @param name
     * @return
     */
    @ApiOperation("删除嘉宾接口")
    @ApiImplicitParam(name = "name", value = "姓名")
    @DeleteMapping("/{name}")
    public String delete(@PathVariable String name) {
        return "redirect:/guest";
    }
}
