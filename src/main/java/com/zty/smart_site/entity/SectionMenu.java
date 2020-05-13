package com.zty.smart_site.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

/*
标段菜单表实体类
SECTION_MENU    标段菜单表
id            			标段菜单id
section_id     			标段id
menu_id         		菜单id
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SectionMenu {
    private int id, section_id, menu_id;

    public SectionMenu() {
        super();
    }

    public SectionMenu(int id, int section_id, int menu_id) {
        this.id = id;
        this.section_id = section_id;
        this.menu_id = menu_id;
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

    public int getMenu_id() {
        return menu_id;
    }

    public void setMenu_id(int menu_id) {
        this.menu_id = menu_id;
    }

    @Override
    public String toString() {
        return "SectionMenu{" +
                "id=" + id +
                ", section_id=" + section_id +
                ", menu_id=" + menu_id +
                '}';
    }
}
