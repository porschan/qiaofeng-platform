package com.chanchfieng.qiaofeng.controll;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:porschan
 * @description:
 * @date: Created in 17:41 2018/12/6
 * @modified By:
 */

@RestController
public class api {

    @GetMapping("/api/currentTimeMillis")
    public String gainTime(){
        return System.currentTimeMillis() + "";
    }

}
