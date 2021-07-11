package com.gjw.controller;


import com.gjw.bean.User;
import com.gjw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("admin")
public class LoginController {

    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;

    @RequestMapping("/login")
    public String login(String acc, String pwd) {
        System.out.println(acc + "，" + pwd);
        return acc.equals("admin") && pwd.equals("123") ? "loginTrue" : "loginFalse";
    }

    @RequestMapping("/allInfo")
    public List<User> allInfo() {
        System.out.println("sasa");

        return userService.queryAllUser();
    }

    @RequestMapping("userTable")
    public List userTable() {

        return Arrays.asList("vip", "svip", "sssvip");
    }

}
