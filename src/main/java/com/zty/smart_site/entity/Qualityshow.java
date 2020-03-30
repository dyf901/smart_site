package com.zty.smart_site.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "qualityshow",description = "质量隐患对象")
public class Qualityshow {
    @ApiModelProperty(value = "质量隐患id",name = "id")
    private int id;

    @ApiModelProperty(value = "质量隐患类型id",name = "quality_id")
    private int quality_id;

    @ApiModelProperty(value = "标段id",name = "section_id")
    private int section_id;

    @ApiModelProperty(value = "站点id",name = "station_id")
    private int station_id;

    @ApiModelProperty(value = "具体描述",name = "description")
    private String description;

    @ApiModelProperty(value = "上传时间",name = "uptime")
    private String uptime;

    @ApiModelProperty(value = "图片地址",name = "url")
    private String url;

    @ApiModelProperty(value = "状态",name = "active")
    private String active;

    @ApiModelProperty(value = "质量隐患类型名称",name = "quality_name")
    private String quality_name;

    @ApiModelProperty(value = "员工名称",name = "staff_name")
    private String staff_name;

    @ApiModelProperty(value = "站点id",name = "station_name")
    private String station_name;

    @ApiModelProperty(value = "标题",name = "title")
    private String title;

    @ApiModelProperty(value = "分包单位id",name = "sub_id")
    private int sub_id;

    @ApiModelProperty(value = "分包单位名称",name = "sub_name")
    private String sub_name;

    @ApiModelProperty(value = "责任人",name = "responsible")
    private String responsible;

    public Qualityshow(){
        super();
    }

    public Qualityshow(int id, int quality_id, int section_id, int station_id, String description, String uptime, String url, String active, String quality_name, String staff_name, String station_name, String title, int sub_id, String sub_name, String responsible) {
        this.id = id;
        this.quality_id = quality_id;
        this.section_id = section_id;
        this.station_id = station_id;
        this.description = description;
        this.uptime = uptime;
        this.url = url;
        this.active = active;
        this.quality_name = quality_name;
        this.staff_name = staff_name;
        this.station_name = station_name;
        this.title = title;
        this.sub_id = sub_id;
        this.sub_name = sub_name;
        this.responsible = responsible;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuality_id() {
        return quality_id;
    }

    public void setQuality_id(int quality_id) {
        this.quality_id = quality_id;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUptime() {
        return uptime;
    }

    public void setUptime(String uptime) {
        this.uptime = uptime;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getQuality_name() {
        return quality_name;
    }

    public void setQuality_name(String quality_name) {
        this.quality_name = quality_name;
    }

    public String getStaff_name() {
        return staff_name;
    }

    public void setStaff_name(String staff_name) {
        this.staff_name = staff_name;
    }

    public String getStation_name() {
        return station_name;
    }

    public void setStation_name(String station_name) {
        this.station_name = station_name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSub_id() {
        return sub_id;
    }

    public void setSub_id(int sub_id) {
        this.sub_id = sub_id;
    }

    public String getSub_name() {
        return sub_name;
    }

    public void setSub_name(String sub_name) {
        this.sub_name = sub_name;
    }

    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }

    @Override
    public String toString() {
        return "Qualityshow{" +
                "id=" + id +
                ", quality_id=" + quality_id +
                ", section_id=" + section_id +
                ", station_id=" + station_id +
                ", description='" + description + '\'' +
                ", uptime='" + uptime + '\'' +
                ", url='" + url + '\'' +
                ", active='" + active + '\'' +
                ", quality_name='" + quality_name + '\'' +
                ", staff_name='" + staff_name + '\'' +
                ", station_name='" + station_name + '\'' +
                ", title='" + title + '\'' +
                ", sub_id=" + sub_id +
                ", sub_name='" + sub_name + '\'' +
                ", responsible='" + responsible + '\'' +
                '}';
    }
}
