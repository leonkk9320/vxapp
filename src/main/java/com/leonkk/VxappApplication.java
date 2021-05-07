package com.leonkk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.leonkk.dao")
public class VxappApplication {

    public static void main(String[] args) {
        SpringApplication.run(VxappApplication.class, args);
    }

}
