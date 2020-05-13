package com.zty.smart_site.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

/*
菜单表实体类
MENU    		菜单表
id      				菜单id
menu_name    			菜单名称
menu_url     			菜单路由
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Menu {
    private int id;
    private String menu_name, menu_url;

    public Menu() {
        super();
    }

    public Menu(int id, String menu_name, String menu_url) {
        this.id = id;
        this.menu_name = menu_name;
        this.menu_url = menu_url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMenu_name() {
        return menu_name;
    }

    public void setMenu_name(String menu_name) {
        this.menu_name = menu_name;
    }

    public String getMenu_url() {
        return menu_url;
    }

    public void setMenu_url(String menu_url) {
        this.menu_url = menu_url;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", menu_name='" + menu_name + '\'' +
                ", menu_url='" + menu_url + '\'' +
                '}';
    }
}
