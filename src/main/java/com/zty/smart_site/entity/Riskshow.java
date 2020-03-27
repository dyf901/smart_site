package com.zty.smart_site.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "riskshow",description = "安全隐患对象")
public class Riskshow {
    @ApiModelProperty(value = "安全隐患id",name = "id")
    private int id;

    @ApiModelProperty(value = "安全隐患类型id",name = "risk_id")
    private int risk_id;

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

    @ApiModelProperty(value = "安全隐患类型名称",name = "risk_name")
    private String risk_name;

    @ApiModelProperty(value = "员工名称",name = "staff_name")
    private String staff_name;

    @ApiModelProperty(value = "站点id",name = "station_name")
    private String station_name;

    public Riskshow(){
        super();
    }

    public Riskshow(int id, int risk_id, int section_id, int station_id, String description, String uptime, String url, String active, String risk_name, String staff_name, String station_name) {
        this.id = id;
        this.risk_id = risk_id;
        this.section_id = section_id;
        this.station_id = station_id;
        this.description = description;
        this.uptime = uptime;
        this.url = url;
        this.active = active;
        this.risk_name = risk_name;
        this.staff_name = staff_name;
        this.station_name = station_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRisk_id() {
        return risk_id;
    }

    public void setRisk_id(int risk_id) {
        this.risk_id = risk_id;
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

    public String getRisk_name() {
        return risk_name;
    }

    public void setRisk_name(String risk_name) {
        this.risk_name = risk_name;
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

    @Override
    public String toString() {
        return "Riskshow{" +
                "id=" + id +
                ", risk_id=" + risk_id +
                ", section_id=" + section_id +
                ", station_id=" + station_id +
                ", description='" + description + '\'' +
                ", uptime='" + uptime + '\'' +
                ", url='" + url + '\'' +
                ", active='" + active + '\'' +
                ", risk_name='" + risk_name + '\'' +
                ", staff_name='" + staff_name + '\'' +
                ", station_name='" + station_name + '\'' +
                '}';
    }
}
