package com.zty.smart_site.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "riskshow",description = "安全隐患对象")
public class Integral {
    @ApiModelProperty(value = "积分id",name = "id")
    private int id;

    @ApiModelProperty(value = "内容",name = "content")
    private String content;

    @ApiModelProperty(value = "上传时间",name="up_time")
    private String up_time;

    @ApiModelProperty(value = "用户id",name = "staff_id")
    private int staff_id;

    public Integral(){
        super();
    }

    public Integral(int id, String content, String up_time, int staff_id) {
        this.id = id;
        this.content = content;
        this.up_time = up_time;
        this.staff_id = staff_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUp_time() {
        return up_time;
    }

    public void setUp_time(String up_time) {
        this.up_time = up_time;
    }

    public int getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(int staff_id) {
        this.staff_id = staff_id;
    }

    @Override
    public String toString() {
        return "Integral{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", up_time='" + up_time + '\'' +
                ", staff_id=" + staff_id +
                '}';
    }
}