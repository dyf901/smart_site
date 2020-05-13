package com.zty.smart_site.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

/*
图标表实体类
title       图标表
id              图标id
title_name      图标名称
title_img       图标图片
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Title {
    private int id;
    private String title_name, title_img;

    public Title() {
        super();
    }

    public Title(int id, String title_name, String title_img) {
        this.id = id;
        this.title_name = title_name;
        this.title_img = title_img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle_name() {
        return title_name;
    }

    public void setTitle_name(String title_name) {
        this.title_name = title_name;
    }

    public String getTitle_img() {
        return title_img;
    }

    public void setTitle_img(String title_img) {
        this.title_img = title_img;
    }

    @Override
    public String toString() {
        return "Title{" +
                "id=" + id +
                ", title_name='" + title_name + '\'' +
                ", title_img='" + title_img + '\'' +
                '}';
    }
}
