package com.zty.smart_site.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "anintegral" , description = "积分明细对象")
public class MonthValue {
    @ApiModelProperty(value = "值" , name = "value")
    private int value;

    @ApiModelProperty(value = "日期(月份天数或者年月)" , name = "month")
    private String month;

    public MonthValue(){
        super();
    }

    public MonthValue(int value, String month) {
        this.value = value;
        this.month = month;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "{" +
                "value=" + value +
                ", month='" + month + '\'' +
                '}';
    }
}
