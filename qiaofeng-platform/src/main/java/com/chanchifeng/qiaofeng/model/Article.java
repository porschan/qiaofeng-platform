package com.chanchifeng.qiaofeng.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

/**
 * @author:porschan
 * @description:
 * @date: Created in 18:57 2019/3/14
 * @modified By:
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "xin_article")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer aID;

    @Column(name="aTitle")
    private String aTitle;

    @Column(name="aContent")
    private String aContent;

    @JsonFormat(locale = "zh",timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @CreatedDate
    @Column(name="aCreateTime")
    private Date aCreateTime;

    @Override
    public String toString() {
        return "Article{" +
                "aID=" + aID +
                ", aTitle='" + aTitle + '\'' +
                ", aContent='" + aContent + '\'' +
                ", aCreateTime=" + aCreateTime +
                '}';
    }

    public Integer getaID() {
        return aID;
    }

    public void setaID(Integer aID) {
        this.aID = aID;
    }

    public String getaTitle() {
        return aTitle;
    }

    public void setaTitle(String aTitle) {
        this.aTitle = aTitle;
    }

    public String getaContent() {
        return aContent;
    }

    public void setaContent(String aContent) {
        this.aContent = aContent;
    }

    public Date getaCreateTime() {
        return aCreateTime;
    }

    public void setaCreateTime(Date aCreateTime) {
        this.aCreateTime = aCreateTime;
    }
}
