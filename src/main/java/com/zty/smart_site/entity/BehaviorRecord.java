package com.zty.smart_site.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
/*
行为记录实体类
behavior_record   行为记录表
id   					行为记录id
staff_id   				员工id
behavior_id   			行为id
uptime   				上传时间
remark   				备注

staff_name              员工姓名
behavior_name           行为名称
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BehaviorRecord {
    private int id,staff_id,behavior_id;
    private String uptime,remark;
    private String staff_name,behavior_name;

    public BehaviorRecord(){
        super();
    }

    public BehaviorRecord(int id, int staff_id, int behavior_id, String uptime, String remark, String staff_name, String behavior_name) {
        this.id = id;
        this.staff_id = staff_id;
        this.behavior_id = behavior_id;
        this.uptime = uptime;
        this.remark = remark;
        this.staff_name = staff_name;
        this.behavior_name = behavior_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(int staff_id) {
        this.staff_id = staff_id;
    }

    public int getBehavior_id() {
        return behavior_id;
    }

    public void setBehavior_id(int behavior_id) {
        this.behavior_id = behavior_id;
    }

    public String getUptime() {
        return uptime;
    }

    public void setUptime(String uptime) {
        this.uptime = uptime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getStaff_name() {
        return staff_name;
    }

    public void setStaff_name(String staff_name) {
        this.staff_name = staff_name;
    }

    public String getBehavior_name() {
        return behavior_name;
    }

    public void setBehavior_name(String behavior_name) {
        this.behavior_name = behavior_name;
    }

    @Override
    public String toString() {
        return "BehaviorRecord{" +
                "id=" + id +
                ", staff_id=" + staff_id +
                ", behavior_id=" + behavior_id +
                ", uptime='" + uptime + '\'' +
                ", remark='" + remark + '\'' +
                ", staff_name='" + staff_name + '\'' +
                ", behavior_name='" + behavior_name + '\'' +
                '}';
    }
}
