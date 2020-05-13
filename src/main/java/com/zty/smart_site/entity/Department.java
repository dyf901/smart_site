package com.zty.smart_site.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

/*
部门表实体类
department    	部门表
id   					部门id
section_id              标段id
department_name			部门名称
percount   				部门人数
depthead   				部门负责人
headphone   			负责人联系电话
remark   				备注

section_name            标段名称
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Department {
    private int id, percount, section_id;
    private String department_name, depthead, headphone, remark, section_name;

    public Department() {
        super();
    }

    public Department(int id, int percount, int section_id, String department_name, String depthead, String headphone, String remark, String section_name) {
        this.id = id;
        this.percount = percount;
        this.section_id = section_id;
        this.department_name = department_name;
        this.depthead = depthead;
        this.headphone = headphone;
        this.remark = remark;
        this.section_name = section_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPercount() {
        return percount;
    }

    public void setPercount(int percount) {
        this.percount = percount;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public String getDepthead() {
        return depthead;
    }

    public void setDepthead(String depthead) {
        this.depthead = depthead;
    }

    public String getHeadphone() {
        return headphone;
    }

    public void setHeadphone(String headphone) {
        this.headphone = headphone;
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
        return "Department{" +
                "id=" + id +
                ", percount=" + percount +
                ", section_id=" + section_id +
                ", department_name='" + department_name + '\'' +
                ", depthead='" + depthead + '\'' +
                ", headphone='" + headphone + '\'' +
                ", remark='" + remark + '\'' +
                ", section_name='" + section_name + '\'' +
                '}';
    }
}
