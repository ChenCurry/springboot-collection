package com.hello.sb03diystartertest.controller;

import com.hello.sb03diystarterautoconfigure.test.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping("/hello")
    public String hello() {
        return helloService.sayHello("zxc");
    }

}