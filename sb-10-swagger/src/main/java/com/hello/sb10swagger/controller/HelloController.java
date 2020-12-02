package com.hello.sb10swagger.controller;

import com.hello.sb10swagger.pojo.User;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

//Operation 接口
@ApiOperation("hello控制类")
@RestController//没有页面，需要返回字符串给浏览器
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    //只要我们的接口中  返回值中存在实体类 它就会被扫描到swagger中
    @PostMapping("/user")
    public User user(){
        return new User();
    }

    @ApiOperation("hello2方法")
    @GetMapping("/hello2")
    public User hello2(@ApiParam("用户名")String name){
        return new User();
    }

    @ApiOperation("hello3方法")
    @PostMapping("/hello3")
    public String hello3(@ApiParam("用户名") User user){
//        int i = 5/0;
        return "hello"+new User();
    }
}
