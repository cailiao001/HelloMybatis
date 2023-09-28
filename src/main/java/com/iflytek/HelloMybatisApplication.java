package com.iflytek;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.iflytek.mapper")
public class HelloMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloMybatisApplication.class, args);
    }

}
