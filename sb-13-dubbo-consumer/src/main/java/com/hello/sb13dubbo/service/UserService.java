package com.hello.sb13dubbo.service;


import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    //去注册中心拿到服务
    @Reference//法一 定义路径相同的接口名  法二  pom坐标
    TicketService ticketService;

    public void buyTicket(){
        String ticket = ticketService.getTicket();
        System.out.println("在注册中心拿到==>"+ticket);
    }
}
