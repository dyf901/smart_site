package com.zty.smart_site.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

/*
兑换记录实体类
conversion     兑换表
id                  兑换记录id
staff_id            员工id
commodity_id        商品id
section_id          标段id
station_id          站点id
sub_id              分包单位id
conversion_time     兑换时间
active              状态

staff_name          员工名称
commodity_name      商品名称
station_name        站点名称
sub_name            分包单位名称
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Conversions {
    private int id, staff_id, commodity_id, section_id, station_id, sub_id;
    private String conversion_time, active, staff_name, commodity_name, station_name, sub_name, commodity_img;

    public Conversions() {
        super();
    }

    public Conversions(int id, int staff_id, int commodity_id, int section_id, int station_id, int sub_id, String conversion_time, String active, String staff_name, String commodity_name, String station_name, String sub_name, String commodity_img) {
        this.id = id;
        this.staff_id = staff_id;
        this.commodity_id = commodity_id;
        this.section_id = section_id;
        this.station_id = station_id;
        this.sub_id = sub_id;
        this.conversion_time = conversion_time;
        this.active = active;
        this.staff_name = staff_name;
        this.commodity_name = commodity_name;
        this.station_name = station_name;
        this.sub_name = sub_name;
        this.commodity_img = commodity_img;
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

    public int getCommodity_id() {
        return commodity_id;
    }

    public void setCommodity_id(int commodity_id) {
        this.commodity_id = commodity_id;
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

    public int getSub_id() {
        return sub_id;
    }

    public void setSub_id(int sub_id) {
        this.sub_id = sub_id;
    }

    public String getConversion_time() {
        return conversion_time;
    }

    public void setConversion_time(String conversion_time) {
        this.conversion_time = conversion_time;
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

    public String getCommodity_name() {
        return commodity_name;
    }

    public void setCommodity_name(String commodity_name) {
        this.commodity_name = commodity_name;
    }

    public String getStation_name() {
        return station_name;
    }

    public void setStation_name(String station_name) {
        this.station_name = station_name;
    }

    public String getSub_name() {
        return sub_name;
    }

    public void setSub_name(String sub_name) {
        this.sub_name = sub_name;
    }

    public String getCommodity_img() {
        return commodity_img;
    }

    public void setCommodity_img(String commodity_img) {
        this.commodity_img = commodity_img;
    }

    @Override
    public String toString() {
        return "Conversions{" +
                "id=" + id +
                ", staff_id=" + staff_id +
                ", commodity_id=" + commodity_id +
                ", section_id=" + section_id +
                ", station_id=" + station_id +
                ", sub_id=" + sub_id +
                ", conversion_time='" + conversion_time + '\'' +
                ", active='" + active + '\'' +
                ", staff_name='" + staff_name + '\'' +
                ", commodity_name='" + commodity_name + '\'' +
                ", station_name='" + station_name + '\'' +
                ", sub_name='" + sub_name + '\'' +
                ", commodity_img='" + commodity_img + '\'' +
                '}';
    }
}
