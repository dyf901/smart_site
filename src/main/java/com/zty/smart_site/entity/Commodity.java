package com.zty.smart_site.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

/*
商品实体类
commodity   商品表
id                  商品id
commodity_name      商品名称
commodity_price     商品价格
commodity_img       商品图片
section_id          标段id
up_time             上架时间
active              状态


*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Commodity {
    private int id, commodity_price, section_id;
    private String commodity_name, commodity_img, up_time, active;

    public Commodity() {
        super();
    }

    public Commodity(int id, int commodity_price, int section_id, String commodity_name, String commodity_img, String up_time, String active) {
        this.id = id;
        this.commodity_price = commodity_price;
        this.section_id = section_id;
        this.commodity_name = commodity_name;
        this.commodity_img = commodity_img;
        this.up_time = up_time;
        this.active = active;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCommodity_price() {
        return commodity_price;
    }

    public void setCommodity_price(int commodity_price) {
        this.commodity_price = commodity_price;
    }

    public String getCommodity_name() {
        return commodity_name;
    }

    public void setCommodity_name(String commodity_name) {
        this.commodity_name = commodity_name;
    }

    public String getCommodity_img() {
        return commodity_img;
    }

    public void setCommodity_img(String commodity_img) {
        this.commodity_img = commodity_img;
    }

    public String getUp_time() {
        return up_time;
    }

    public void setUp_time(String up_time) {
        this.up_time = up_time;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public int getSection_id() {
        return section_id;
    }

    public void setSection_id(int section_id) {
        this.section_id = section_id;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "id=" + id +
                ", commodity_price=" + commodity_price +
                ", section_id=" + section_id +
                ", commodity_name='" + commodity_name + '\'' +
                ", commodity_img='" + commodity_img + '\'' +
                ", up_time='" + up_time + '\'' +
                ", active='" + active + '\'' +
                '}';
    }
}
