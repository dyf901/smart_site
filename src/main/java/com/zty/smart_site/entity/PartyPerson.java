package com.zty.smart_site.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Milestone" , description = "里程碑表对象")
public class PartyPerson {
    @ApiModelProperty(value = "积分id" , name = "id")
    private int id;

    @ApiModelProperty(value = "标段id" , name = "section_id")
    private int section_id;

    @ApiModelProperty(value = "党员姓名" , name = "person_name")
    private String person_name;

    @ApiModelProperty(value = "照片地址" , name = "img_url")
    private String img_url;

    @ApiModelProperty(value = "党员状态" , name = "state")
    private String state;

    @ApiModelProperty(value = "党员状态" , name = "duty")
    private String duty;

    @ApiModelProperty(value = "党员状态" , name = "integral")
    private String integral;

    @ApiModelProperty(value = "学历" , name = "education")
    private String education;

    @ApiModelProperty(value = "数量" , name = "count")
    private int count;

    public PartyPerson(){
        super();
    }

    public PartyPerson(int id, int section_id, String person_name, String img_url, String state, String duty, String integral, String education) {
        this.id = id;
        this.section_id = section_id;
        this.person_name = person_name;
        this.img_url = img_url;
        this.state = state;
        this.duty = duty;
        this.integral = integral;
        this.education = education;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPerson_name() {
        return person_name;
    }

    public void setPerson_name(String person_name) {
        this.person_name = person_name;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getSection_id() {
        return section_id;
    }

    public void setSection_id(int section_id) {
        this.section_id = section_id;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public String getIntegral() {
        return integral;
    }

    public void setIntegral(String integral) {
        this.integral = integral;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
