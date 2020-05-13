package com.zty.smart_site.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

/*
工种表实体类
worktype   		工种表
id    					工种id
worktype_name   		工种名称
content    				工作内容
section_id              标段id
station_id              站点id
sub_id       分包单位id
person_count            人数
remark   				备注

section_name            标段名称
station_name            站点名称
sub_name     分包单位名称
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Worktype {
    private int id, section_id, station_id, person_count, sub_id;
    private String worktype_name, content, remark;
    private String section_name, station_name, sub_name, state;

    public Worktype() {
        super();
    }

    public Worktype(int id, int section_id, int station_id, int person_count, int sub_id, String worktype_name, String content, String remark, String section_name, String station_name, String sub_name, String state) {
        this.id = id;
        this.section_id = section_id;
        this.station_id = station_id;
        this.person_count = person_count;
        this.sub_id = sub_id;
        this.worktype_name = worktype_name;
        this.content = content;
        this.remark = remark;
        this.section_name = section_name;
        this.station_name = station_name;
        this.sub_name = sub_name;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWorktype_name() {
        return worktype_name;
    }

    public void setWorktype_name(String worktype_name) {
        this.worktype_name = worktype_name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    public int getStation_id() {
        return station_id;
    }

    public void setStation_id(int station_id) {
        this.station_id = station_id;
    }

    public int getPerson_count() {
        return person_count;
    }

    public void setPerson_count(int person_count) {
        this.person_count = person_count;
    }

    public String getSection_name() {
        return section_name;
    }

    public void setSection_name(String section_name) {
        this.section_name = section_name;
    }

    public String getStation_name() {
        return station_name;
    }

    public void setStation_name(String station_name) {
        this.station_name = station_name;
    }

    public int getSub_id() {
        return sub_id;
    }

    public void setSub_id(int sub_id) {
        this.sub_id = sub_id;
    }

    public String getSub_name() {
        return sub_name;
    }

    public void setSub_name(String sub_name) {
        this.sub_name = sub_name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Worktype{" +
                "id=" + id +
                ", section_id=" + section_id +
                ", station_id=" + station_id +
                ", person_count=" + person_count +
                ", sub_id=" + sub_id +
                ", worktype_name='" + worktype_name + '\'' +
                ", content='" + content + '\'' +
                ", remark='" + remark + '\'' +
                ", section_name='" + section_name + '\'' +
                ", station_name='" + station_name + '\'' +
                ", sub_name='" + sub_name + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
