package com.zty.smart_site.entity;

import io.swagger.annotations.ApiModelProperty;

public class PlanPhoto {
    @ApiModelProperty(value = "进度图片id", name = "id")
    private int id;

    @ApiModelProperty(value = "标段id", name = "section_id")
    private int section_id;

    @ApiModelProperty(value = "图片地址", name = "img_url")
    private String img_url;

    @ApiModelProperty(value = "上传时间", name = "uptime")
    private String uptime;

    public PlanPhoto(){
        super();
    }

    public PlanPhoto(int id, int section_id, String img_url, String uptime) {
        this.id = id;
        this.section_id = section_id;
        this.img_url = img_url;
        this.uptime = uptime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSection_id() {
        return section_id;
    }

    public void setSection_id(int section_id) {
        this.section_id = section_id;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public String getUptime() {
        return uptime;
    }

    public void setUptime(String uptime) {
        this.uptime = uptime;
    }
}
