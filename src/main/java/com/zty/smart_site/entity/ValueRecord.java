package com.zty.smart_site.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "ValueRecord", description = "产值记录表对象")
public class ValueRecord {
    @ApiModelProperty(value = "产值记录id", name = "id")
    private int id;

    @ApiModelProperty(value = "标段id", name = "section_id")
    private int section_id;

    @ApiModelProperty(value = "每天产值", name = "day_value")
    private Double day_value;

    @ApiModelProperty(value = "上传时间",name="time")
    private String time;

    @ApiModelProperty(value = "累计产值",name = "count")
    private Double count;

    @ApiModelProperty(value = "累计产值",name = "month")
    private String month;

    public ValueRecord(){
        super();
    }

    public ValueRecord(int id, int section_id, Double day_value, String time, Double count, String month) {
        this.id = id;
        this.section_id = section_id;
        this.day_value = day_value;
        this.time = time;
        this.count = count;
        this.month = month;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getDay_value() {
        return day_value;
    }

    public void setDay_value(Double day_value) {
        this.day_value = day_value;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Double getCount() {
        return count;
    }

    public void setCount(Double count) {
        this.count = count;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getSection_id() {
        return section_id;
    }

    public void setSection_id(int section_id) {
        this.section_id = section_id;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", section_id=" + section_id +
                ", day_value=" + day_value +
                ", time='" + time + '\'' +
                ", count=" + count +
                ", month='" + month + '\'' +
                '}';
    }
}
