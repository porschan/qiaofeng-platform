package com.chanchifeng.qiaofeng.service.impl;

import com.chanchifeng.qiaofeng.model.Article;
import com.chanchifeng.qiaofeng.repository.ArticleRepository;
import com.chanchifeng.qiaofeng.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:porschan
 * @description:
 * @date: Created in 19:04 2019/3/14
 * @modified By:
 */

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    ArticleRepository articleRepository;

    @Override
    public Article save(Article article) {
        return articleRepository.save(article);
    }

    @Override
    public List<Article> gainAll() {
        return articleRepository.findAll();
    }

    @Override
    public Article gainArticleByID(Integer ID) {
        return articleRepository.findById(ID);
    }
}
