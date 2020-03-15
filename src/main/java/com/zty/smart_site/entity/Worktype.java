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
department_id   		所属部门
remark   				备注

*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Worktype {
    private int id,section_id,station_id,department_id;
    private String worktype_name,content,remark;

    public Worktype(){
        super();
    }

    public Worktype(int id, int section_id, int station_id, int department_id, String worktype_name, String content, String remark) {
        this.id = id;
        this.section_id = section_id;
        this.station_id = station_id;
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

    @Override
    public String toString() {
        return "Worktype{" +
                "id=" + id +
                ", section_id=" + section_id +
                ", station_id=" + station_id +
                ", department_id=" + department_id +
                ", worktype_name='" + worktype_name + '\'' +
                ", content='" + content + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
