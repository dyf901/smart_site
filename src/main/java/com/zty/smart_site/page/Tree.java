package com.zty.smart_site.page;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "tree" , description = "树形图对象")
public class Tree {
    @ApiModelProperty(value = "进度编制id" , name = "id")
    private int id;

    @ApiModelProperty(value = "标段id" , name = "section_id")
    private int section_id;

    @ApiModelProperty(value = "进度名称" , name = "label")
    private String label;

    @ApiModelProperty(value = "工期" , name = "duration")
    private int duration;

    @ApiModelProperty(value = "开始时间" , name = "start_time")
    private String start_time;

    @ApiModelProperty(value = "结束时间" , name = "end_time")
    private String end_time;

    @ApiModelProperty(value = "实际开始时间" , name = "practical_start")
    private String practical_start;

    @ApiModelProperty(value = "实际结束时间" , name = "practical_end")
    private String practical_end;

    @ApiModelProperty(value = "备注" , name = "remark")
    private String remark;

    @ApiModelProperty(value = "父节点" , name = "fatherid")
    private int fatherid;

    @ApiModelProperty(value = "是否是父节点" , name = "isparent")
    private String isparent;

    public Tree() {
        super();
    }

    public Tree(int id, int section_id, String label, int duration, String start_time, String end_time, String practical_start, String practical_end, String remark, int fatherid, String isparent) {
        this.id = id;
        this.section_id = section_id;
        this.label = label;
        this.duration = duration;
        this.start_time = start_time;
        this.end_time = end_time;
        this.practical_start = practical_start;
        this.practical_end = practical_end;
        this.remark = remark;
        this.fatherid = fatherid;
        this.isparent = isparent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSection_id() {
        return section_id;
    }

    public void setSection_id(int section_id) {
        this.section_id = section_id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getFatherid() {
        return fatherid;
    }

    public void setFatherid(int fatherid) {
        this.fatherid = fatherid;
    }

    public String getIsparent() {
        return isparent;
    }

    public void setIsparent(String isparent) {
        this.isparent = isparent;
    }

    public String getPractical_start() {
        return practical_start;
    }

    public void setPractical_start(String practical_start) {
        this.practical_start = practical_start;
    }

    public String getPractical_end() {
        return practical_end;
    }

    public void setPractical_end(String practical_end) {
        this.practical_end = practical_end;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", section_id=" + section_id +
                ", label='" + label + '\'' +
                ", duration=" + duration +
                ", start_time='" + start_time + '\'' +
                ", end_time='" + end_time + '\'' +
                ", practical_start='" + practical_start + '\'' +
                ", practical_end='" + practical_end + '\'' +
                ", remark='" + remark + '\'' +
                ", fatherid=" + fatherid +
                ", isparent='" + isparent + '\'' +
                '}';
    }
}
