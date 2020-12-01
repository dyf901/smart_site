package com.zty.smart_site.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
/*
验证码实体类
code    验证码表
id          验证码id
phone       号码
code        验证码
uptime      时间
*/

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Value {
    private int id;
    private String month, value;

    public Value() {
        super();
    }

    public Value(int id, String month, String value) {
        this.id = id;
        this.month = month;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Value{" +
                "id=" + id +
                ", month='" + month + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
