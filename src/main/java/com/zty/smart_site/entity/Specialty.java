package com.zty.smart_site.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "specialty" , description = "专业表对象")
public class Specialty {
    @ApiModelProperty(value = "专业id" , name = "id")
    private int id;

    @ApiModelProperty(value = "专业名称" , name = "specialty_name")
    private String specialty_name;

    @ApiModelProperty(value = "标段id" , name = "section_id")
    private int section_id;

    public Specialty() {
        super();
    }

    public Specialty(int id, String specialty_name, int section_id) {
        this.id = id;
        this.specialty_name = specialty_name;
        this.section_id = section_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpecialty_name() {
        return specialty_name;
    }

    public void setSpecialty_name(String specialty_name) {
        this.specialty_name = specialty_name;
    }

    public int getSection_id() {
        return section_id;
    }

    public void setSection_id(int section_id) {
        this.section_id = section_id;
    }

    @Override
    public String toString() {
        return "Specialty{" +
                "id=" + id +
                ", specialty_name='" + specialty_name + '\'' +
                ", section_id=" + section_id +
                '}';
    }
}
