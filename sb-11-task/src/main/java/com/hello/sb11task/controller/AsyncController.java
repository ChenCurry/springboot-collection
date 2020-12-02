package com.hello.sb11task.controller;

import com.hello.sb11task.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsyncController {

    @Autowired
    AsyncService asyncService;

    @RequestMapping("/hello")
    public String hello(){
        asyncService.hello();//停止3秒，转圈
        return "OK";
    }
}
