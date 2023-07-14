package com.jp.supermarket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("supermarket","超市管理系统");
        model.addAttribute("test", "This is a test");
        return "index";
    }

    @GetMapping("/login")
    public String login(Model model){
        model.addAttribute("error", "meet error");
        return "login";
    }

    @GetMapping("/error")
    public String error(Model model){

        return "error";
    }

//    @PostMapping("/login.do")
//    public String login(@ModelAttribute User user) {
//        // do something with user
//        return "success";
//    }
}



