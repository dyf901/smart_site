package com.zty.smart_site.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "examination_type",description = "试卷类型表对象")
public class ExaminationType {
    @ApiModelProperty(value = "试卷类型id",name = "id")
    private int id;

    @ApiModelProperty(value = "试卷类型名称",name = "type_name")
    private String type_name;

    public ExaminationType(){
        super();
    }

    public ExaminationType(int id, String type_name) {
        this.id = id;
        this.type_name = type_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }

    @Override
    public String toString() {
        return "ExaminationType{" +
                "id=" + id +
                ", type_name='" + type_name + '\'' +
                '}';
    }
}
