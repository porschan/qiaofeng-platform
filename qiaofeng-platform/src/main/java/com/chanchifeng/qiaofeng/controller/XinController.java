package com.chanchifeng.qiaofeng.controller;

import com.alibaba.fastjson.JSONObject;
import com.chanchifeng.qiaofeng.model.Article;
import com.chanchifeng.qiaofeng.service.ArticleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author:porschan
 * @description:
 * @date: Created in 18:55 2019/3/14
 * @modified By:
 */


@RestController
public class XinController {

    @Resource
    ArticleService articleService;

    @ResponseBody
    @RequestMapping("/xin/postArticle")
    public String saveArticle(@RequestParam(value="aTitle") String aTitle,@RequestParam(value="aContent") String aContent){
        Article article = new Article();
        article.setaTitle(aTitle);
        article.setaContent(aContent);
        Article save = articleService.save(article);
        JSONObject result = new JSONObject();
        result.put("state", true);
        result.put("data",save);
        System.out.println(result.toJSONString());
        return result.toJSONString();
    }

    @ResponseBody
    @RequestMapping("/xin/gainAllArticle")
    public String gainAllArticle(){

        List<Article> articles = articleService.gainAll();
        JSONObject result = new JSONObject();
        result.put("state", true);
        result.put("data",articles);
        return result.toJSONString();
    }

    @ResponseBody
    @RequestMapping("/xin/gainArticleByID")
    public String gainArticleByID(@RequestParam(value="ID") Integer ID){
        Article article = articleService.gainArticleByID(ID);
        JSONObject result = new JSONObject();
        result.put("state", true);
        result.put("data",article);
        return result.toString();
    }

}
