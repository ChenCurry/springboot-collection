package com.hello.sb12redis;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.hello.sb12redis.pojo.User;
import com.hello.sb12redis.utils.RedisUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class Sb12RedisApplicationTests {

    @Autowired
    //@Qualifier("redisTemplate")
    private RedisTemplate redisTemplate;

    @Autowired
    private RedisUtil redisUtil;

    @Test
    public void test1(){
        redisUtil.set("name","kkkkksssss");
        System.out.println(redisUtil.get("name"));
    }

    @Test
    void contextLoads() {

        //.opsForValue()操作String
        //.opsForList()操作list
        //除了基本的操作，常用的方式都可以直接通过redisTemplate操作
        redisTemplate.opsForValue().set("mykey","possible2dream.cn");
        System.out.println(redisTemplate.opsForValue().get("mykey"));
    }

    @Test
    public void test() throws JsonProcessingException {
        User user = new User("内马尔", 3);
        //String jsonUser = new ObjectMapper().writeValueAsString(user);
        redisTemplate.opsForValue().set("user",user);
        System.out.println(redisTemplate.opsForValue().get("user"));
    }
}
