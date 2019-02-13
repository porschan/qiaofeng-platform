package com.chanchifeng.qiaofeng.model;

/**
 * @author:porschan
 * @description:
 * @date: Created in 19:52 2019/2/13
 * @modified By:
 */

public class Iciba {
    private Integer sid;

    @Override
    public String toString() {
        return "Iciba{" +
                "sid=" + sid +
                '}';
    }

    public Iciba() {
        super();
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }
}
