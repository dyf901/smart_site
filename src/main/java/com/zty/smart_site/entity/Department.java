package com.zty.smart_site.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
/*
部门表实体类
department    	部门表
id   					部门id
department_name			部门名称
percount   				部门人数
depthead   				部门负责人
headphone   			负责人联系电话
remark   				备注

*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Department {
    private int id,percount;
    private String department_name,depthead,headphone,remark;

    public Department(){
        super();
    }

    public Department(int id, int percount, String department_name, String depthead, String headphone, String remark) {
        this.id = id;
        this.percount = percount;
        this.department_name = department_name;
        this.depthead = depthead;
        this.headphone = headphone;
        this.remark = remark;
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

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", percount=" + percount +
                ", department_name='" + department_name + '\'' +
                ", depthead='" + depthead + '\'' +
                ", headphone='" + headphone + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
