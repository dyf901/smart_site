package com.zty.smart_site.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "message" , description = "我的信息")
public class Message {
    @ApiModelProperty(value = "ID" , name = "id")
    private int id;

    @ApiModelProperty(value = "人员id" , name = "staff_id")
    private int staff_id;

    @ApiModelProperty(value = "站点id" , name = "station_id")
    private int station_id;

    @ApiModelProperty(value = "站点名称" , name = "station_name")
    private String station_name;

    @ApiModelProperty(value = "时间" , name = "uptime")
    private String uptime;

    @ApiModelProperty(value = "时间" , name = "nowtime")
    private String nowtime;

    @ApiModelProperty(value = "时间戳" , name = "noC")
    private String noC;

    public Message() {
        super();
    }

    public Message(int id, int staff_id, int station_id, String station_name, String uptime, String nowtime, String noC) {
        this.id = id;
        this.staff_id = staff_id;
        this.station_id = station_id;
        this.station_name = station_name;
        this.uptime = uptime;
        this.nowtime = nowtime;
        this.noC = noC;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(int staff_id) {
        this.staff_id = staff_id;
    }

    public int getStation_id() {
        return station_id;
    }

    public void setStation_id(int station_id) {
        this.station_id = station_id;
    }

    public String getUptime() {
        return uptime;
    }

    public void setUptime(String uptime) {
        this.uptime = uptime;
    }

    public String getStation_name() {
        return station_name;
    }

    public void setStation_name(String station_name) {
        this.station_name = station_name;
    }

    public String getNowtime() {
        return nowtime;
    }

    public void setNowtime(String nowtime) {
        this.nowtime = nowtime;
    }

    public String getNoC() {
        return noC;
    }

    public void setNoC(String noC) {
        this.noC = noC;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", staff_id=" + staff_id +
                ", station_id=" + station_id +
                ", station_name='" + station_name + '\'' +
                ", uptime='" + uptime + '\'' +
                ", nowtime='" + nowtime + '\'' +
                ", noC='" + noC + '\'' +
                '}';
    }
}
