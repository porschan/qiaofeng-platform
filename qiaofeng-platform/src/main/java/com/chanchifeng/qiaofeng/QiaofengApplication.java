package com.chanchifeng.qiaofeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * @author:porschan
 * @description:
 * @date: Created in 18:12 2019/2/13
 * @modified By:
 */

@EnableJpaAuditing
@SpringBootApplication
public class QiaofengApplication {

    public static void main(String[] args) {
        SpringApplication.run(QiaofengApplication.class, args);
    }

}