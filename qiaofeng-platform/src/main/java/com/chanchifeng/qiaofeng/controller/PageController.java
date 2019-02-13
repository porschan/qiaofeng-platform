package com.chanchifeng.qiaofeng.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author:porschan
 * @description:
 * @date: Created in 17:36 2019/2/13
 * @modified By:
 */

@RestController
public class PageController {

    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }
}
