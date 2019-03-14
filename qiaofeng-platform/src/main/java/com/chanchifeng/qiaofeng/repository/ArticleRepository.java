package com.chanchifeng.qiaofeng.repository;

import com.chanchifeng.qiaofeng.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * @author:porschan
 * @description:
 * @date: Created in 18:59 2019/3/14
 * @modified By:
 */

public interface ArticleRepository extends JpaRepository<Article,String> {

    @Query(value = "SELECT aID,aTitle,aContent,aCreateTime FROM xin_article WHERE aID = :id", nativeQuery = true)
    Article findById(@Param("id") Integer id);

}
