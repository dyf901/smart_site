package com.zty.smart_site.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "Environment" , description = "扬尘检测仪数据表对象")
public class Environment {
    @ApiModelProperty(value = "题目id" , name = "id")
    private int id;

    @ApiModelProperty(value = "知识名称" , name = "deviceId")
    private String deviceId;

    @ApiModelProperty(value = "知识名称" , name = "pm25")
    private String pm25;

    @ApiModelProperty(value = "知识名称" , name = "pm10")
    private String pm10;

    @ApiModelProperty(value = "知识名称" , name = "noise")
    private String noise;

    @ApiModelProperty(value = "知识名称" , name = "tem")
    private String tem;

    @ApiModelProperty(value = "知识名称" , name = "hum")
    private String hum;

    @ApiModelProperty(value = "知识名称" , name = "wp")
    private String wp;

    @ApiModelProperty(value = "知识名称" , name = "ws")
    private String ws;

    @ApiModelProperty(value = "知识名称" , name = "wd")
    private String wd;

    @ApiModelProperty(value = "知识名称" , name = "tsp")
    private String tsp;

    @ApiModelProperty(value = "知识名称" , name = "atm")
    private String atm;

    @ApiModelProperty(value = "知识名称" , name = "datatime")
    private String datatime;

    public Environment(){
        super();
    }

    public Environment(int id, String deviceId, String pm25, String pm10, String noise, String tem, String hum, String wp, String ws, String wd, String tsp, String atm, String datatime) {
        this.id = id;
        this.deviceId = deviceId;
        this.pm25 = pm25;
        this.pm10 = pm10;
        this.noise = noise;
        this.tem = tem;
        this.hum = hum;
        this.wp = wp;
        this.ws = ws;
        this.wd = wd;
        this.tsp = tsp;
        this.atm = atm;
        this.datatime = datatime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getPm25() {
        return pm25;
    }

    public void setPm25(String pm25) {
        this.pm25 = pm25;
    }

    public String getPm10() {
        return pm10;
    }

    public void setPm10(String pm10) {
        this.pm10 = pm10;
    }

    public String getNoise() {
        return noise;
    }

    public void setNoise(String noise) {
        this.noise = noise;
    }

    public String getTem() {
        return tem;
    }

    public void setTem(String tem) {
        this.tem = tem;
    }

    public String getHum() {
        return hum;
    }

    public void setHum(String hum) {
        this.hum = hum;
    }

    public String getWp() {
        return wp;
    }

    public void setWp(String wp) {
        this.wp = wp;
    }

    public String getWs() {
        return ws;
    }

    public void setWs(String ws) {
        this.ws = ws;
    }

    public String getWd() {
        return wd;
    }

    public void setWd(String wd) {
        this.wd = wd;
    }

    public String getTsp() {
        return tsp;
    }

    public void setTsp(String tsp) {
        this.tsp = tsp;
    }

    public String getAtm() {
        return atm;
    }

    public void setAtm(String atm) {
        this.atm = atm;
    }

    public String getDatatime() {
        return datatime;
    }

    public void setDatatime(String datatime) {
        this.datatime = datatime;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", deviceId='" + deviceId + '\'' +
                ", pm25='" + pm25 + '\'' +
                ", pm10='" + pm10 + '\'' +
                ", noise='" + noise + '\'' +
                ", tem='" + tem + '\'' +
                ", hum='" + hum + '\'' +
                ", wp='" + wp + '\'' +
                ", ws='" + ws + '\'' +
                ", wd='" + wd + '\'' +
                ", tsp='" + tsp + '\'' +
                ", atm='" + atm + '\'' +
                ", datatime='" + datatime + '\'' +
                '}';
    }
}
