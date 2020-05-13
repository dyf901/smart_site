package com.zty.smart_site.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

/*
菜单表实体类
position            菜单表
id						菜单id
position_name			菜单名称
remark					备注

*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Position {
    private int id;
    private String position_name, remark;

    public Position() {
        super();
    }

    public Position(int id, String position_name, String remark) {
        this.id = id;
        this.position_name = position_name;
        this.remark = remark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPosition_name() {
        return position_name;
    }

    public void setPosition_name(String position_name) {
        this.position_name = position_name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Position{" +
                "id=" + id +
                ", position_name='" + position_name + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
