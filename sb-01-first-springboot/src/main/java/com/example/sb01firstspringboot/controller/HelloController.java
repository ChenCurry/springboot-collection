package com.example.sb01firstspringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//spring boot  自动装配
@RestController
public class HelloController {

    @RequestMapping("/hello")//这个接口的名字就叫做http://localhost:8080/hello
    //// 它就单纯的成了一个接口 不用再去管web.xml  前端  等等一系列东西了 它就和vue完全前后端分离了
    public String hello() {
        //接收前端的参数，调用业务
        return "hello world";
    }
}