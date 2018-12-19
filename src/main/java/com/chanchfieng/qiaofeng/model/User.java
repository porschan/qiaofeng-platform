package com.chanchfieng.qiaofeng.model;

/**
 * @author:porschan
 * @description:
 * @date: Created in 11:12 2018/12/19
 * @modified By:
 */

public class User {
    private String userName;
    private String note;

    public User() {

        super();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
