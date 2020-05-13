package com.zty.smart_site.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "qualityrectify" , description = "整改通知单对象")
public class Qualityrectify {
    @ApiModelProperty(value = "质量整改通知单id" , name = "id")
    private int id;

    @ApiModelProperty(value = "标段id" , name = "section_id")
    private int section_id;

    @ApiModelProperty(value = "站点id" , name = "station_id")
    private int station_id;

    @ApiModelProperty(value = "具体描述" , name = "description")
    private String description;

    @ApiModelProperty(value = "状态" , name = "active")
    private String active;

    @ApiModelProperty(value = "员工名称" , name = "staff_name")
    private String staff_name;

    @ApiModelProperty(value = "站点名称" , name = "station_name")
    private String station_name;

    @ApiModelProperty(value = "标题" , name = "title")
    private String title;

    @ApiModelProperty(value = "分包单位id" , name = "sub_id")
    private int sub_id;

    @ApiModelProperty(value = "分包单位名称" , name = "sub_name")
    private String sub_name;

    @ApiModelProperty(value = "责任人" , name = "responsible")
    private String responsible;

    @ApiModelProperty(value = "分包单位id" , name = "process_id")
    private int process_id;

    @ApiModelProperty(value = "分包单位名称" , name = "process_name")
    private String process_name;

    @ApiModelProperty(value = "安全隐患记录id" , name = "qualityshow_id")
    private int qualityshow_id;

    public Qualityrectify() {
        super();
    }

    public Qualityrectify(int id, int section_id, int station_id, String description, String active, String staff_name, String station_name, String title, int sub_id, String sub_name, String responsible, int process_id, String process_name, int qualityshow_id) {
        this.id = id;
        this.section_id = section_id;
        this.station_id = station_id;
        this.description = description;
        this.active = active;
        this.staff_name = staff_name;
        this.station_name = station_name;
        this.title = title;
        this.sub_id = sub_id;
        this.sub_name = sub_name;
        this.responsible = responsible;
        this.process_id = process_id;
        this.process_name = process_name;
        this.qualityshow_id = qualityshow_id;
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

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
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

    public int getProcess_id() {
        return process_id;
    }

    public void setProcess_id(int process_id) {
        this.process_id = process_id;
    }

    public String getProcess_name() {
        return process_name;
    }

    public void setProcess_name(String process_name) {
        this.process_name = process_name;
    }

    public int getQualityshow_id() {
        return qualityshow_id;
    }

    public void setQualityshow_id(int qualityshow_id) {
        this.qualityshow_id = qualityshow_id;
    }

    @Override
    public String toString() {
        return "Qualityrectify{" +
                "id=" + id +
                ", section_id=" + section_id +
                ", station_id=" + station_id +
                ", description='" + description + '\'' +
                ", active='" + active + '\'' +
                ", staff_name='" + staff_name + '\'' +
                ", station_name='" + station_name + '\'' +
                ", title='" + title + '\'' +
                ", sub_id=" + sub_id +
                ", sub_name='" + sub_name + '\'' +
                ", responsible='" + responsible + '\'' +
                ", process_id=" + process_id +
                ", process_name='" + process_name + '\'' +
                ", qualityshow_id=" + qualityshow_id +
                '}';
    }
}
