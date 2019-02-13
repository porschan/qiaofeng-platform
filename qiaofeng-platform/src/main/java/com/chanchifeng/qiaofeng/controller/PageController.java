package com.chanchifeng.qiaofeng.controller;

import com.alibaba.fastjson.JSON;
import com.chanchifeng.qiaofeng.model.Iciba;
import com.chanchifeng.qiaofeng.service.PageService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author:porschan
 * @description:
 * @date: Created in 17:36 2019/2/13
 * @modified By:
 */

@RestController
public class PageController {

    @Resource
    private PageService pageService;

    @GetMapping("/")
    public ModelAndView index(Model model) {
        ModelAndView modelAndView = new ModelAndView("index");

        String s = pageService.gainICIBA();
        Map maps = (Map)JSON.parse(s);
        model.addAttribute("data",maps);

        return modelAndView;
    }
}
