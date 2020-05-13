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
public class Code {
    private int id, code;
    private String phone, uptime;

    public Code() {
        super();
    }

    public Code(int id, int code, String phone, String uptime) {
        this.id = id;
        this.code = code;
        this.phone = phone;
        this.uptime = uptime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUptime() {
        return uptime;
    }

    public void setUptime(String uptime) {
        this.uptime = uptime;
    }

    @Override
    public String toString() {
        return "Code{" +
                "id=" + id +
                ", code=" + code +
                ", phone='" + phone + '\'' +
                ", uptime='" + uptime + '\'' +
                '}';
    }
}
