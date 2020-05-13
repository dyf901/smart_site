package com.zty.smart_site.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

/*
用户标段表实体类
USER_SECTION    用户标段表
id						用户标段id
user_id       			用户id
section_id       		标段id
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserSection {
    private int id, user_id, section_id;

    public UserSection() {
        super();
    }

    public UserSection(int id, int user_id, int section_id) {
        this.id = id;
        this.user_id = user_id;
        this.section_id = section_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getSection_id() {
        return section_id;
    }

    public void setSection_id(int section_id) {
        this.section_id = section_id;
    }

    @Override
    public String toString() {
        return "UserSection{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", section_id=" + section_id +
                '}';
    }
}
