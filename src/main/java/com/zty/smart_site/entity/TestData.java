package com.zty.smart_site.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "train_type" , description = "培训类型")
public class TestData {

    @ApiModelProperty(value = "ID" , name = "id")
    private int id;

    @ApiModelProperty(value = "类型名称" , name = "type_name")
    private String type_name;


    @ApiModelProperty(value = "类型名称" , name = "type_name")
    private List<Train> dataIn;


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

    public List<Train> getDataIn() {
        return dataIn;
    }

    public void setDataIn(List<Train> dataIn) {
        this.dataIn = dataIn;
    }


    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", type_name='" + type_name + '\'' +
                ", dataIn=" + dataIn +
                '}';
    }
}
