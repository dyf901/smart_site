package com.zty.smart_site.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "AiMonitoring" , description = "Ai监控表实体类")
public class AiMonitoring {
    @ApiModelProperty(value = "ai监控图片id" , name = "id")
    private int id;

    @ApiModelProperty(value = "主机设备id" , name = "deviceid")
    private String deviceid;

    @ApiModelProperty(value = "相机编号" , name = "cip")
    private String cip;

    @ApiModelProperty(value = "抓拍日期" , name = "datetime")
    private String datetime;

    @ApiModelProperty(value = "抓拍类型" , name = "option")
    private String option;

    @ApiModelProperty(value = "所属管理部门" , name = "department")
    private String department;

    @ApiModelProperty(value = "抓拍图片的base64编码" , name = "img")
    private String img;

    public AiMonitoring(){
        super();
    }

    public AiMonitoring(int id, String deviceid, String cip, String datetime, String option, String department, String img) {
        this.id = id;
        this.deviceid = deviceid;
        this.cip = cip;
        this.datetime = datetime;
        this.option = option;
        this.department = department;
        this.img = img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid;
    }

    public String getCip() {
        return cip;
    }

    public void setCip(String cip) {
        this.cip = cip;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
