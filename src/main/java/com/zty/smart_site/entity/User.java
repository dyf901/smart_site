package com.zty.smart_site.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

/*
用户表实体类
USER    		用户表
id   					用户id
username    			用户名
password     			密码
create_time   			创建时间
end_time      			到期时间
section_id     			标段id

section_name            标段名称
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {
    private int id, section_id,station_id;
    private String username, password, create_time, end_time, section_name, user_menu,section_principal;

    public User() {
        super();
    }

    public User(int id, int section_id, int station_id, String username, String password, String create_time, String end_time, String section_name, String user_menu, String section_principal) {
        this.id = id;
        this.section_id = section_id;
        this.station_id = station_id;
        this.username = username;
        this.password = password;
        this.create_time = create_time;
        this.end_time = end_time;
        this.section_name = section_name;
        this.user_menu = user_menu;
        this.section_principal = section_principal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSection_id() {
        return section_id;
    }

    public void setSection_id(int section_id) {
        this.section_id = section_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public String getSection_name() {
        return section_name;
    }

    public void setSection_name(String section_name) {
        this.section_name = section_name;
    }

    public String getUser_menu() {
        return user_menu;
    }

    public void setUser_menu(String user_menu) {
        this.user_menu = user_menu;
    }

    public int getStation_id() {
        return station_id;
    }

    public void setStation_id(int station_id) {
        this.station_id = station_id;
    }

    public String getSection_principal() {
        return section_principal;
    }

    public void setSection_principal(String section_principal) {
        this.section_principal = section_principal;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", section_id=" + section_id +
                ", station_id=" + station_id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", create_time='" + create_time + '\'' +
                ", end_time='" + end_time + '\'' +
                ", section_name='" + section_name + '\'' +
                ", user_menu='" + user_menu + '\'' +
                '}';
    }
}
