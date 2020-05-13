package com.zty.smart_site.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

/*
站点表实体类
STATION     	站点表
id      				站点id
section_id              标段id
station_name    		站点称
station_time    		站点规定时间
start_time      		开工时间
end_time        		完工时间
station_principal     	站点负责人
station_area			站点面积

section_name            标段名称
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Station {
    private int id, station_time, section_id;
    private String station_name, start_time, end_time, station_principal, station_area, section_name;
    private String userId, groupId, deviceKey;

    public Station() {
        super();
    }

    public Station(int id, int station_time, int section_id, String station_name, String start_time, String end_time, String station_principal, String station_area, String section_name, String userId, String groupId, String deviceKey) {
        this.id = id;
        this.station_time = station_time;
        this.section_id = section_id;
        this.station_name = station_name;
        this.start_time = start_time;
        this.end_time = end_time;
        this.station_principal = station_principal;
        this.station_area = station_area;
        this.section_name = section_name;
        this.userId = userId;
        this.groupId = groupId;
        this.deviceKey = deviceKey;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStation_time() {
        return station_time;
    }

    public void setStation_time(int station_time) {
        this.station_time = station_time;
    }

    public String getStation_name() {
        return station_name;
    }

    public void setStation_name(String station_name) {
        this.station_name = station_name;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public String getStation_principal() {
        return station_principal;
    }

    public void setStation_principal(String station_principal) {
        this.station_principal = station_principal;
    }

    public String getStation_area() {
        return station_area;
    }

    public void setStation_area(String station_area) {
        this.station_area = station_area;
    }

    public int getSection_id() {
        return section_id;
    }

    public void setSection_id(int section_id) {
        this.section_id = section_id;
    }

    public String getSection_name() {
        return section_name;
    }

    public void setSection_name(String section_name) {
        this.section_name = section_name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getDeviceKey() {
        return deviceKey;
    }

    public void setDeviceKey(String deviceKey) {
        this.deviceKey = deviceKey;
    }

    @Override
    public String toString() {
        return "Station{" +
                "id=" + id +
                ", station_time=" + station_time +
                ", section_id=" + section_id +
                ", station_name='" + station_name + '\'' +
                ", start_time='" + start_time + '\'' +
                ", end_time='" + end_time + '\'' +
                ", station_principal='" + station_principal + '\'' +
                ", station_area='" + station_area + '\'' +
                ", section_name='" + section_name + '\'' +
                ", userId='" + userId + '\'' +
                ", groupId='" + groupId + '\'' +
                ", deviceKey='" + deviceKey + '\'' +
                '}';
    }
}
