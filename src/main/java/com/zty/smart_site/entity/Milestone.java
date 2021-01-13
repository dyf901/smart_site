package com.zty.smart_site.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "Milestone" , description = "里程碑表对象")
public class Milestone {
    @ApiModelProperty(value = "积分id" , name = "id")
    private int id;

    @ApiModelProperty(value = "标段id" , name = "section_id")
    private int section_id;

    @ApiModelProperty(value = "项目名称" , name = "project_name")
    private String project_name;

    @ApiModelProperty(value = "计划开始时间" , name = "plan_start")
    private Date plan_start;

    @ApiModelProperty(value = "计划结束时间" , name = "plan_end")
    private Date plan_end;

    @ApiModelProperty(value = "实际开始时间" , name = "practical_start")
    private Date practical_start;

    @ApiModelProperty(value = "实际结束时间" , name = "practical_end")
    private Date practical_end;

    @ApiModelProperty(value = "图片地址" , name = "img_url")
    private String img_url;

    @ApiModelProperty(value = "备注" , name = "message")
    private String message;

    public Milestone(){
        super();
    }

    public Milestone(int id, int section_id, String project_name, Date plan_start, Date plan_end, Date practical_start, Date practical_end, String img_url, String message) {
        this.id = id;
        this.section_id = section_id;
        this.project_name = project_name;
        this.plan_start = plan_start;
        this.plan_end = plan_end;
        this.practical_start = practical_start;
        this.practical_end = practical_end;
        this.img_url = img_url;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public Date getPlan_start() {
        return plan_start;
    }

    public void setPlan_start(Date plan_start) {
        this.plan_start = plan_start;
    }

    public Date getPlan_end() {
        return plan_end;
    }

    public void setPlan_end(Date plan_end) {
        this.plan_end = plan_end;
    }

    public Date getPractical_start() {
        return practical_start;
    }

    public void setPractical_start(Date practical_start) {
        this.practical_start = practical_start;
    }

    public Date getPractical_end() {
        return practical_end;
    }

    public void setPractical_end(Date practical_end) {
        this.practical_end = practical_end;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public int getSection_id() {
        return section_id;
    }

    public void setSection_id(int section_id) {
        this.section_id = section_id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", section_id=" + section_id +
                ", project_name='" + project_name + '\'' +
                ", plan_start=" + plan_start +
                ", plan_end=" + plan_end +
                ", practical_start=" + practical_start +
                ", practical_end=" + practical_end +
                ", img_url='" + img_url + '\'' +
                '}';
    }
}
