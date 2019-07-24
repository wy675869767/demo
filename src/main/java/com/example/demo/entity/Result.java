package com.example.demo.entity;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

/**
 * Created with:IntelliJ IDEA
 * USER:wangyue
 * DATE:2019/7/22
 * TIME:14:25
 */
public class Result {

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Result(Object data, String code, String message) {
        this.data = data;
        this.code = code;
        this.message = message;
    }

    public Result() {
        super();
    }

    private Object data;
    private String code;
    private String message;

    public static Result success(Object data){
        return new Result(data,"200","请求成功");
    }
}
