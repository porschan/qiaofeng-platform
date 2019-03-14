package com.chanchifeng.qiaofeng.service;

import com.chanchifeng.qiaofeng.model.Article;

import java.util.List;

/**
 * @author:porschan
 * @description:
 * @date: Created in 19:02 2019/3/14
 * @modified By:
 */

public interface ArticleService {

    Article save(Article article);

    List<Article> gainAll();

    Article gainArticleByID(Integer ID);
}
