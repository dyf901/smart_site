package com.zty.smart_site.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "ProjectBrief" , description = "大屏项目简介表对象")
public class ProjectBrief {
    @ApiModelProperty(value = "党建新闻id" , name = "id")
    private int id;

    @ApiModelProperty(value = "文字介绍" , name = "brief")
    private String brief;

    @ApiModelProperty(value = "图片地址" , name = "img_url")
    private String img_url;

    @ApiModelProperty(value = "标段id" , name = "section_id")
    private int section_id;

    public ProjectBrief(){
        super();
    }

    public ProjectBrief(int id, String brief, String img_url, int section_id) {
        this.id = id;
        this.brief = brief;
        this.img_url = img_url;
        this.section_id = section_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
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
}
