package com.hello.sb10swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2  //开启Swagger2
public class SwaggerConfig {//  WebMvcConfigurer


    @Bean
    public Docket docket1(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("A");
    }

    @Bean
    public Docket docket2(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("B");
    }

    //配置bean实例
    @Bean
    public Docket docket(Environment environment) {
        //获取当前环境 prod或test环境 就激活swagger功能！！
        Profiles profiles = Profiles.of("prod","test");
        boolean flag = environment.acceptsProfiles(profiles);
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .enable(flag)
                .groupName("内马尔")
                .select()
                //RequestHandlerSelectors 配置要扫描接口的方式
                //basePackagez 指定要扫描的包
                .apis(RequestHandlerSelectors.basePackage("com.example.swaggerdemo.controller"))
                //paths() 过滤
                //.paths(PathSelectors.ant("/example/**"))
                .build();
    }

    private ApiInfo apiInfo() {
        //作者信息
        Contact contact = new Contact("neymar", "http://blog.possible2dream.cn", "810808038@qq.com");
        return new ApiInfo("Api 文档"
                , "Api 文拉格档"
                , "1.0"
                , "urn:tos"
                , contact
                , "Apache 2.0"
                , "http://www.apache.org/licenses/LICENSE-2.0"
                , new ArrayList()
        );
    }

}
