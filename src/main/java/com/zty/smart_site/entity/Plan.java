package com.zty.smart_site.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "Plan", description = "进度表对象")
public class Plan {
    @ApiModelProperty(value = "进度id", name = "id")
    private int id;

    @ApiModelProperty(value = "项目名称", name = "progress_name")
    private String progress_name;

    @ApiModelProperty(value = "计划开始时间", name = "start_time")
    private String start_time;

    @ApiModelProperty(value = "开始天数", name = "start_day")
    private int start_day;


    @ApiModelProperty(value = "计划结束时间", name = "end_time")
    private String end_time;

    @ApiModelProperty(value = "结束天数", name = "end_day")
    private int end_day;


    @ApiModelProperty(value = "计划施工天数", name = "duration")
    private int duration;

    @ApiModelProperty(value = "实际施工天数", name = "practical_day")
    private int practical_day;

    @ApiModelProperty(value = "实际结束时间", name = "practical_time")
    private String practical_time;

    @ApiModelProperty(value = "状态", name = "state")
    private int state;

    public Plan(){
        super();
    }

    public Plan(int id, String progress_name, String start_time, int start_day, String end_time, int end_day, int duration, int practical_day, String practical_time, int state) {
        this.id = id;
        this.progress_name = progress_name;
        this.start_time = start_time;
        this.start_day = start_day;
        this.end_time = end_time;
        this.end_day = end_day;
        this.duration = duration;
        this.practical_day = practical_day;
        this.practical_time = practical_time;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProgress_name() {
        return progress_name;
    }

    public void setProgress_name(String progress_name) {
        this.progress_name = progress_name;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getPractical_day() {
        return practical_day;
    }

    public void setPractical_day(int practical_day) {
        this.practical_day = practical_day;
    }

    public String getPractical_time() {
        return practical_time;
    }

    public void setPractical_time(String practical_time) {
        this.practical_time = practical_time;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getStart_day() {
        return start_day;
    }

    public void setStart_day(int start_day) {
        this.start_day = start_day;
    }

    public int getEnd_day() {
        return end_day;
    }

    public void setEnd_day(int end_day) {
        this.end_day = end_day;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", progress_name='" + progress_name + '\'' +
                ", start_time='" + start_time + '\'' +
                ", start_day=" + start_day +
                ", end_time='" + end_time + '\'' +
                ", end_day=" + end_day +
                ", duration=" + duration +
                ", practical_day=" + practical_day +
                ", practical_time='" + practical_time + '\'' +
                ", state=" + state +
                '}';
    }
}
