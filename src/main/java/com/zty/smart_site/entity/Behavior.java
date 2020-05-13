package com.zty.smart_site.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

/*
行为记录实体类
behavior        行为类型表
id   					行为id
behavior_name   		行为名称
section_id              标段id
detail   				详细
remark   				备注

section_name            标段名称

*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Behavior {
    private int id, section_id;
    private String behavior_name, detail, remark, section_name;

    public Behavior() {
        super();
    }

    public Behavior(int id, int section_id, String behavior_name, String detail, String remark, String section_name) {
        this.id = id;
        this.section_id = section_id;
        this.behavior_name = behavior_name;
        this.detail = detail;
        this.remark = remark;
        this.section_name = section_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBehavior_name() {
        return behavior_name;
    }

    public void setBehavior_name(String behavior_name) {
        this.behavior_name = behavior_name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getSection_id() {
        return section_id;
    }

    public void setSection_id(int section_id) {
        this.section_id = section_id;
    }

    public String getSection_name() {
        return section_name;
    }

    public void setSection_name(String section_name) {
        this.section_name = section_name;
    }

    @Override
    public String toString() {
        return "Behavior{" +
                "id=" + id +
                ", section_id=" + section_id +
                ", behavior_name='" + behavior_name + '\'' +
                ", detail='" + detail + '\'' +
                ", remark='" + remark + '\'' +
                ", section_name='" + section_name + '\'' +
                '}';
    }
}
