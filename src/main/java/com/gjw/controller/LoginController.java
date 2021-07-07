package com.gjw.controller;

import com.alibaba.fastjson.JSONObject;
import com.gjw.bean.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("admin")
public class LoginController {

    @RequestMapping("/login")
    public String login(String acc, String pwd) {
        System.out.println(acc + "，" + pwd);

        return acc.equals("admin") && pwd.equals("123") ? "loginTrue" : "loginFalse";
    }

    @RequestMapping("/allInfo")
    public List<UserInfo> allInfo() {
        System.out.println("sasa");
        List<UserInfo> list = new ArrayList<UserInfo>();
        list.add(new UserInfo(1, "张三", 10, "福建"));
        list.add(new UserInfo(2, "张四", 11, "广州"));
        list.add(new UserInfo(3, "张五", 12, "北京"));
        list.add(new UserInfo(4, "张六", 13, "上海"));
        list.add(new UserInfo(5, "张三", 10, "福建"));
        list.add(new UserInfo(6, "张四", 11, "广州"));
        list.add(new UserInfo(7, "张五", 12, "北京"));
        list.add(new UserInfo(8, "张六", 13, "上海"));
        list.add(new UserInfo(9, "张三", 10, "福建"));
        list.add(new UserInfo(10, "张四", 11, "广州"));
        list.add(new UserInfo(11, "张五", 12, "北京"));
        list.add(new UserInfo(12, "张六", 13, "上海"));
//        JSONObject jsonObject = new JSONObject();
//        jsonObject.put("allInfos", list);
//        return jsonObject.toString();

        return list;
    }

    @RequestMapping("userTable")
    public List userTable() {

        return Arrays.asList("厦门", "三明", "福州");
    }

}
