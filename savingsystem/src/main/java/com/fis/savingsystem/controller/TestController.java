package com.fis.savingsystem.controller;

import com.fis.savingsystem.pojo.User;
import com.fis.savingsystem.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TestController {
    @Autowired
    private IUserService userService;
    @RequestMapping("test")
    public String test(Model model){
        User user = userService.get(1);
        model.addAttribute("user",user);
        return "test";
    }
}
