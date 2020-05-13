package com.zty.smart_site.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/*
质量安全类型实体类
quality                 质量安全表
id                      质量安全id
section_id              标段id
quality_category        质量问题源类别
quality_description     具体质量问题描述
quality_grade           质量问题等级
quality_duration        质量问题预计持续时段
construction            施工控制设施
construction_person     施工责任人
construction_phone      施工责任人电话
supervisor              监理控制设施
supervisor_person       监理责任人
supervisor_phone        监理责任人电话

*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "quality" , description = "质量隐患类型对象")
public class Quality {
    @ApiModelProperty(value = "安全隐患类型id" , name = "id")
    private int id;

    @ApiModelProperty(value = "标段id" , name = "section_id")
    private int section_id;

    @ApiModelProperty(value = "站点id" , name = "station_id")
    private int station_id;

    @ApiModelProperty(value = "风险源类别" , name = "quality_category")
    private String quality_category;

    @ApiModelProperty(value = "具体风险描述" , name = "quality_description")
    private String quality_description;

    @ApiModelProperty(value = "风险等级" , name = "quality_grade")
    private String quality_grade;

    @ApiModelProperty(value = "风险预计持续时段" , name = "quality_duration")
    private String quality_duration;

    @ApiModelProperty(value = "施工控制设施" , name = "construction")
    private String construction;

    @ApiModelProperty(value = "施工责任人" , name = "construction_person")
    private String construction_person;

    @ApiModelProperty(value = "施工责任人电话" , name = "construction_phone")
    private String construction_phone;

    @ApiModelProperty(value = "监理控制设施" , name = "supervisor")
    private String supervisor;

    @ApiModelProperty(value = "监理责任人" , name = "supervisor_person")
    private String supervisor_person;

    @ApiModelProperty(value = "监理责任人电话" , name = "supervisor_phone")
    private String supervisor_phone;

    @ApiModelProperty(value = "站点名称" , name = "station_name")
    private String station_name;

    public Quality() {
        super();
    }

    public Quality(int id, int section_id, int station_id, String quality_category, String quality_description, String quality_grade, String quality_duration, String construction, String construction_person, String construction_phone, String supervisor, String supervisor_person, String supervisor_phone, String station_name) {
        this.id = id;
        this.section_id = section_id;
        this.station_id = station_id;
        this.quality_category = quality_category;
        this.quality_description = quality_description;
        this.quality_grade = quality_grade;
        this.quality_duration = quality_duration;
        this.construction = construction;
        this.construction_person = construction_person;
        this.construction_phone = construction_phone;
        this.supervisor = supervisor;
        this.supervisor_person = supervisor_person;
        this.supervisor_phone = supervisor_phone;
        this.station_name = station_name;
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

    public String getQuality_category() {
        return quality_category;
    }

    public void setQuality_category(String quality_category) {
        this.quality_category = quality_category;
    }

    public String getQuality_description() {
        return quality_description;
    }

    public void setQuality_description(String quality_description) {
        this.quality_description = quality_description;
    }

    public String getQuality_grade() {
        return quality_grade;
    }

    public void setQuality_grade(String quality_grade) {
        this.quality_grade = quality_grade;
    }

    public String getQuality_duration() {
        return quality_duration;
    }

    public void setQuality_duration(String quality_duration) {
        this.quality_duration = quality_duration;
    }

    public String getConstruction() {
        return construction;
    }

    public void setConstruction(String construction) {
        this.construction = construction;
    }

    public String getConstruction_person() {
        return construction_person;
    }

    public void setConstruction_person(String construction_person) {
        this.construction_person = construction_person;
    }

    public String getConstruction_phone() {
        return construction_phone;
    }

    public void setConstruction_phone(String construction_phone) {
        this.construction_phone = construction_phone;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public String getSupervisor_person() {
        return supervisor_person;
    }

    public void setSupervisor_person(String supervisor_person) {
        this.supervisor_person = supervisor_person;
    }

    public String getSupervisor_phone() {
        return supervisor_phone;
    }

    public void setSupervisor_phone(String supervisor_phone) {
        this.supervisor_phone = supervisor_phone;
    }

    public int getStation_id() {
        return station_id;
    }

    public void setStation_id(int station_id) {
        this.station_id = station_id;
    }

    public String getStation_name() {
        return station_name;
    }

    public void setStation_name(String station_name) {
        this.station_name = station_name;
    }

    @Override
    public String toString() {
        return "Quality{" +
                "id=" + id +
                ", section_id=" + section_id +
                ", station_id=" + station_id +
                ", quality_category='" + quality_category + '\'' +
                ", quality_description='" + quality_description + '\'' +
                ", quality_grade='" + quality_grade + '\'' +
                ", quality_duration='" + quality_duration + '\'' +
                ", construction='" + construction + '\'' +
                ", construction_person='" + construction_person + '\'' +
                ", construction_phone='" + construction_phone + '\'' +
                ", supervisor='" + supervisor + '\'' +
                ", supervisor_person='" + supervisor_person + '\'' +
                ", supervisor_phone='" + supervisor_phone + '\'' +
                ", station_name=" + station_name +
                '}';
    }
}
