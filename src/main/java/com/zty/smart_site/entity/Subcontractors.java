package com.zty.smart_site.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

/*
分包单位实体类
subcontractors     分包单位实体类
id						分包单位id
subcontractors_name		分包单位名称
principal				分包单位负责人
principal_phone			负责人联系电话
person_count			总数人
section_id              标段id
remark					备注

section_name            标段名称
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Subcontractors {
    private int id, person_count, section_id, station_id;
    private String subcontractors_name, principal, principal_phone, remark, section_name, state;

    public Subcontractors() {
        super();
    }

    public Subcontractors(int id, int person_count, int section_id, int station_id, String subcontractors_name, String principal, String principal_phone, String remark, String section_name, String state) {
        this.id = id;
        this.person_count = person_count;
        this.section_id = section_id;
        this.station_id = station_id;
        this.subcontractors_name = subcontractors_name;
        this.principal = principal;
        this.principal_phone = principal_phone;
        this.remark = remark;
        this.section_name = section_name;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPerson_count() {
        return person_count;
    }

    public void setPerson_count(int person_count) {
        this.person_count = person_count;
    }

    public String getSubcontractors_name() {
        return subcontractors_name;
    }

    public void setSubcontractors_name(String subcontractors_name) {
        this.subcontractors_name = subcontractors_name;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getPrincipal_phone() {
        return principal_phone;
    }

    public void setPrincipal_phone(String principal_phone) {
        this.principal_phone = principal_phone;
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

    public int getStation_id() {
        return station_id;
    }

    public void setStation_id(int station_id) {
        this.station_id = station_id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Subcontractors{" +
                "id=" + id +
                ", person_count=" + person_count +
                ", section_id=" + section_id +
                ", station_id=" + station_id +
                ", subcontractors_name='" + subcontractors_name + '\'' +
                ", principal='" + principal + '\'' +
                ", principal_phone='" + principal_phone + '\'' +
                ", remark='" + remark + '\'' +
                ", section_name='" + section_name + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
