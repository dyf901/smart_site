package com.zty.smart_site.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "Value", description = "产值表对象")
public class ValueZ {
    @ApiModelProperty(value = "产值id", name = "id")
    private int id;

    @ApiModelProperty(value = "标段id", name = "section_id")
    private int section_id;

    @ApiModelProperty(value = "总共产值", name = "altogether")
    private Double altogether;

    public ValueZ(){
        super();
    }

    public ValueZ(int id, int section_id, Double altogether) {
        this.id = id;
        this.section_id = section_id;
        this.altogether = altogether;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getAltogether() {
        return altogether;
    }

    public void setAltogether(Double altogether) {
        this.altogether = altogether;
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
                ", altogether=" + altogether +
                '}';
    }
}
