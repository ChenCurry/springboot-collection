package com.hello.sb13dubbo.service;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Service
@Component//用了dubbo尽量不要使用@Service注解，容易误解  Component万能注解
public class TicketServiceImpl implements TicketService {
    @Override
    public String getTicket() {
        return "yeeee";
    }
}
