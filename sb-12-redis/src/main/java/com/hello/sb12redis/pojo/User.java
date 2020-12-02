package com.hello.sb12redis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
//企业中，实体类通常都要序列化
public class User implements Serializable {
    private String name;
    private int age;
}
