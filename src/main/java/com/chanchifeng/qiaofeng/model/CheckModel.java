package com.chanchifeng.qiaofeng.model;

/**
 * @author:porschan
 * @description:
 * @date: Created in 12:25 2018/12/19
 * @modified By:
 */

public class CheckModel {
    private int code;
    private String message;

    public CheckModel(int code, String msg) {
        this.code = code;
        this.message = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
