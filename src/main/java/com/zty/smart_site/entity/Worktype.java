package com.zty.smart_site.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
/*
工种表实体类
worktype   		工种表
id    					工种id
worktype_name   		工种名称
content    				工作内容
department_id   		所属部门
remark   				备注

*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Worktype {
    private int id,department_id;
    private String worktype_name,content,remark;

    public Worktype(){
        super();
    }

    public Worktype(int id, int department_id, String worktype_name, String content, String remark) {
        this.id = id;
        this.department_id = department_id;
        this.worktype_name = worktype_name;
        this.content = content;
        this.remark = remark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
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

    @Override
    public String toString() {
        return "Worktype{" +
                "id=" + id +
                ", department_id=" + department_id +
                ", worktype_name='" + worktype_name + '\'' +
                ", content='" + content + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
