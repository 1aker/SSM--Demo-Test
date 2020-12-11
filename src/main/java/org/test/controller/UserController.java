package org.test.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.test.domain.User;
import org.test.service.AccountService;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private AccountService accountService;
    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层，查询所有用户");
        List<User> list = accountService.findAll();
        model.addAttribute("list", list);
        return "list";
    }
}
