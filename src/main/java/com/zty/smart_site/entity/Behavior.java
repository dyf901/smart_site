package com.zty.smart_site.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
/*
行为记录实体类
behavior        行为类型表
id   					行为id
behavior_name   		行为名称
detail   				详细
remark   				备注
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Behavior {
    private int id;
    private String behavior_name,detail,remark;

    public Behavior(){
        super();
    }

    public Behavior(int id, String behavior_name, String detail, String remark) {
        this.id = id;
        this.behavior_name = behavior_name;
        this.detail = detail;
        this.remark = remark;
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

    @Override
    public String toString() {
        return "Behavior{" +
                "id=" + id +
                ", behavior_name='" + behavior_name + '\'' +
                ", detail='" + detail + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
