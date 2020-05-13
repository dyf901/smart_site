package com.zty.smart_site.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/*
安全隐患类型实体类
risk                安全隐患类型
id                      安全隐患类型id
section_id              标段id
risk_category           风险源类别
risk_description        具体风险描述
risk_grade              风险等级
risk_duration           风险预计持续时段
construction            施工控制设施
construction_person     施工责任人
construction_phone      施工责任人电话
supervisor              监理控制设施
supervisor_person       监理责任人
supervisor_phone        监理责任人电话

*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "risk" , description = "安全隐患类型")
public class Risk {
    @ApiModelProperty(value = "安全隐患类型id" , name = "id")
    private int id;

    @ApiModelProperty(value = "标段id" , name = "section_id")
    private int section_id;

    @ApiModelProperty(value = "站点id" , name = "station_id")
    private int station_id;

    @ApiModelProperty(value = "风险源类别" , name = "risk_category")
    private String risk_category;

    @ApiModelProperty(value = "具体风险描述" , name = "risk_description")
    private String risk_description;

    @ApiModelProperty(value = "风险等级" , name = "risk_grade")
    private String risk_grade;

    @ApiModelProperty(value = "风险预计持续时段" , name = "risk_duration")
    private String risk_duration;

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

    public Risk() {
        super();
    }

    public Risk(int id, int section_id, int station_id, String risk_category, String risk_description, String risk_grade, String risk_duration, String construction, String construction_person, String construction_phone, String supervisor, String supervisor_person, String supervisor_phone, String station_name) {
        this.id = id;
        this.section_id = section_id;
        this.station_id = station_id;
        this.risk_category = risk_category;
        this.risk_description = risk_description;
        this.risk_grade = risk_grade;
        this.risk_duration = risk_duration;
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

    public String getRisk_category() {
        return risk_category;
    }

    public void setRisk_category(String risk_category) {
        this.risk_category = risk_category;
    }

    public String getRisk_description() {
        return risk_description;
    }

    public void setRisk_description(String risk_description) {
        this.risk_description = risk_description;
    }

    public String getRisk_grade() {
        return risk_grade;
    }

    public void setRisk_grade(String risk_grade) {
        this.risk_grade = risk_grade;
    }

    public String getRisk_duration() {
        return risk_duration;
    }

    public void setRisk_duration(String risk_duration) {
        this.risk_duration = risk_duration;
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
        return "Risk{" +
                "id=" + id +
                ", section_id=" + section_id +
                ", station_id=" + station_id +
                ", risk_category='" + risk_category + '\'' +
                ", risk_description='" + risk_description + '\'' +
                ", risk_grade='" + risk_grade + '\'' +
                ", risk_duration='" + risk_duration + '\'' +
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
