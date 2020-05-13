package com.zty.smart_site.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "process" , description = "工序表对象")
public class Process {
    @ApiModelProperty(value = "题目id" , name = "id")
    private int id;

    @ApiModelProperty(value = "标段id" , name = "section_id")
    private int section_id;

    @ApiModelProperty(value = "站点id" , name = "station_id")
    private int station_id;

    @ApiModelProperty(value = "站点id" , name = "station_name")
    private String station_name;

    @ApiModelProperty(value = "工序名称" , name = "process_name")
    private String process_name;

    public Process() {
        super();
    }

    public Process(int id, int section_id, int station_id, String station_name, String process_name) {
        this.id = id;
        this.section_id = section_id;
        this.station_id = station_id;
        this.station_name = station_name;
        this.process_name = process_name;
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

    public String getStation_name() {
        return station_name;
    }

    public void setStation_name(String station_name) {
        this.station_name = station_name;
    }

    public String getProcess_name() {
        return process_name;
    }

    public void setProcess_name(String process_name) {
        this.process_name = process_name;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", section_id=" + section_id +
                ", station_id=" + station_id +
                ", station_name='" + station_name + '\'' +
                ", process_name='" + process_name + '\'' +
                '}';
    }
}
