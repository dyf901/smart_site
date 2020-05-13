package com.zty.smart_site.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

/*
标段表实体类
SECTION     	标段表
id      				标段id
section_name    		标段名称
section_time    		项目规定时间
start_time      		开工时间
end_time        		完工时间
section_principal     	项目经理
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Section {
    private int id, section_time;
    private String section_name, start_time, end_time, section_principal;

    public Section() {
        super();
    }

    public Section(int id, int section_time, String section_name, String start_time, String end_time, String section_principal) {
        this.id = id;
        this.section_time = section_time;
        this.section_name = section_name;
        this.start_time = start_time;
        this.end_time = end_time;
        this.section_principal = section_principal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSection_time() {
        return section_time;
    }

    public void setSection_time(int section_time) {
        this.section_time = section_time;
    }

    public String getSection_name() {
        return section_name;
    }

    public void setSection_name(String section_name) {
        this.section_name = section_name;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public String getSection_principal() {
        return section_principal;
    }

    public void setSection_principal(String section_principal) {
        this.section_principal = section_principal;
    }

    @Override
    public String toString() {
        return "Section{" +
                "id=" + id +
                ", section_time=" + section_time +
                ", section_name='" + section_name + '\'' +
                ", start_time='" + start_time + '\'' +
                ", end_time='" + end_time + '\'' +
                ", section_principal='" + section_principal + '\'' +
                '}';
    }
}
