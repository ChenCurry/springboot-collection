package com.hello.sb02springmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Locale;

//应为类型要求为WebMvcConfigurer，这是一个接口
// （一个人当过兵，我们说他是一个兵；一个人会下象棋，我们说他是一个棋手；接口丶）
//使用自定义类扩展视图解析器的功能
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    @Bean //放到bean中 进入容器
    public ViewResolver myViewResolver(){
        return new MyViewResolver();
    }

    //我们写一个静态内部类，视图解析器就需要实现ViewResolver接口
    private static class MyViewResolver implements ViewResolver{
        @Override
        public View resolveViewName(String s, Locale locale) throws Exception {
            return null;
        }
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // 浏览器发送/test ， 就会跳转到test页面；
        registry.addViewController("/test4").setViewName("test");
    }
}