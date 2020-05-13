package com.zty.smart_site.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

/*
菜单图标表实体类
position_title          菜单图标表
id                  菜单图标id
position_id         菜单id
title_id            图标id
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PositionTitle {
    private int id, position_id, title_id;

    public PositionTitle() {
        super();
    }

    public PositionTitle(int id, int position_id, int title_id) {
        this.id = id;
        this.position_id = position_id;
        this.title_id = title_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPosition_id() {
        return position_id;
    }

    public void setPosition_id(int position_id) {
        this.position_id = position_id;
    }

    public int getTitle_id() {
        return title_id;
    }

    public void setTitle_id(int title_id) {
        this.title_id = title_id;
    }

    @Override
    public String toString() {
        return "PositionTitle{" +
                "id=" + id +
                ", position_id=" + position_id +
                ", title_id=" + title_id +
                '}';
    }
}
