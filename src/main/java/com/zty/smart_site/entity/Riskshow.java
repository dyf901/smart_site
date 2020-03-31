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

    @ApiModelProperty(value = "站点名称",name = "station_name")
    private String station_name;

    @ApiModelProperty(value = "标题",name = "title")
    private String title;

    @ApiModelProperty(value = "分包单位id",name = "sub_id")
    private int sub_id;

    @ApiModelProperty(value = "分包单位名称",name = "sub_name")
    private String sub_name;

    @ApiModelProperty(value = "责任人",name = "responsible")
    private String responsible;

    @ApiModelProperty(value = "数量",name = "count")
    private String count;

    @ApiModelProperty(value = "计划整改时间",name = "plan_time")
    private String plan_time;

    @ApiModelProperty(value = "整改图片地址",name = "zg_url")
    private String zg_url;

    public Riskshow(){
        super();
    }

    public Riskshow(int id, int risk_id, int section_id, int station_id, String description, String uptime, String url, String active, String risk_name, String staff_name, String station_name, String title, int sub_id, String sub_name, String responsible, String count, String plan_time, String zg_url) {
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
        this.title = title;
        this.sub_id = sub_id;
        this.sub_name = sub_name;
        this.responsible = responsible;
        this.count = count;
        this.plan_time = plan_time;
        this.zg_url = zg_url;
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

    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }

    public String getSub_name() {
        return sub_name;
    }

    public void setSub_name(String sub_name) {
        this.sub_name = sub_name;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getPlan_time() {
        return plan_time;
    }

    public void setPlan_time(String plan_time) {
        this.plan_time = plan_time;
    }

    public String getZg_url() {
        return zg_url;
    }

    public void setZg_url(String zg_url) {
        this.zg_url = zg_url;
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
                ", title='" + title + '\'' +
                ", sub_id=" + sub_id +
                ", sub_name='" + sub_name + '\'' +
                ", responsible='" + responsible + '\'' +
                ", count='" + count + '\'' +
                ", plan_time='" + plan_time + '\'' +
                ", zg_url='" + zg_url + '\'' +
                '}';
    }
}
