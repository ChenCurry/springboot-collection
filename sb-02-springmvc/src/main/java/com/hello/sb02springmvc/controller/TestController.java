package com.hello.sb02springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.Map;

@Controller
public class TestController {

    @RequestMapping("/test")
    public String test(Model model){
        //存入数据
        model.addAttribute("msg","Hello,Thymeleaf");
        //classpath:/templates/test.html
        return "test";
    }

    @RequestMapping("/test2")
    public String test2(Map<String,Object> map){
        //存入数据
        map.put("msg","<h1>Hello</h1>");
        map.put("users", Arrays.asList("xiaoming","xiaohong"));
        //classpath:/templates/test.html
        return "test";
    }
}