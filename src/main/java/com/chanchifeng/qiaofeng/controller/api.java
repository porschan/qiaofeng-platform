package com.chanchifeng.qiaofeng.controller;

import com.chanchifeng.qiaofeng.model.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:porschan
 * @description:
 * @date: Created in 17:41 2018/12/6
 * @modified By:
 */

@RestController
public class api {

    @RequestMapping("/api/currentTimeMillis")
    public String gainTime(){
        return System.currentTimeMillis() + "";
    }


    @RequestMapping("/api/person")
    @ResponseBody
    public User helloWord(@RequestBody User user){
        System.out.println(user);
        return user;
    }
}
