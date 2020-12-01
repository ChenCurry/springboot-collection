package com.hello.sb02springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * templates目录下的资源只能通过controller进行跳转而访问
 * 这种访问方式需要导入依赖
 */
@Controller
public class IndexController {

    @GetMapping("/index")
    public String index(){
        return "index";
    }
}