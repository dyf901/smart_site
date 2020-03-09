package com.zty.smart_site.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
/*
站点表实体类
STATION     	站点表
id      				站点id
station_name    		站点称
station_time    		站点规定时间
start_time      		开工时间
end_time        		完工时间
station_principal     	站点负责人
station_area			站点面积

*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Station {
    private int id,station_time;
    private String station_name,start_time,end_time,station_principal,station_area;

    public Station(){
        super();
    }

    public Station(int id, int station_time, String station_name, String start_time, String end_time, String station_principal, String station_area) {
        this.id = id;
        this.station_time = station_time;
        this.station_name = station_name;
        this.start_time = start_time;
        this.end_time = end_time;
        this.station_principal = station_principal;
        this.station_area = station_area;
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

    @Override
    public String  toString() {
        return "Station{" +
                "id=" + id +
                ", station_time=" + station_time +
                ", station_name='" + station_name + '\'' +
                ", start_time='" + start_time + '\'' +
                ", end_time='" + end_time + '\'' +
                ", station_principal='" + station_principal + '\'' +
                ", station_area='" + station_area + '\'' +
                '}';
    }
}
