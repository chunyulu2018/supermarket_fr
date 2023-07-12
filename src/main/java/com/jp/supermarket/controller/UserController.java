package com.jp.supermarket.controller;

import com.jp.supermarket.pojo.User;
import com.jp.supermarket.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getUserList")
    public void getUser() {
        List<User> list = userService.getUserList(new User());
        for (User user :list ){
            System.out.println(user.toString());
        }
    }
}
