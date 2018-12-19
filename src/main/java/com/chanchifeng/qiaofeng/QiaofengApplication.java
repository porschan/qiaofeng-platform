package com.chanchifeng.qiaofeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com.chanchifeng.qiaofeng")
public class QiaofengApplication {

    public static void main(String[] args) {
        SpringApplication.run(QiaofengApplication.class, args);
    }
}
