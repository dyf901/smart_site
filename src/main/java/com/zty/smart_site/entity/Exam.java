package com.zty.smart_site.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "exam" , description = "考试表对象")
public class Exam {
    @ApiModelProperty(value = "考试id" , name = "id")
    private int id;

    @ApiModelProperty(value = "发布时间" , name = "exam_name")
    private String exam_name;

    @ApiModelProperty(value = "标段id" , name = "section_id")
    private int section_id;

    @ApiModelProperty(value = "试卷类型id" , name = "specialty_id")
    private int specialty_id;

    @ApiModelProperty(value = "试卷类型名称" , name = "specialty_name")
    private String specialty_name;

    @ApiModelProperty(value = "试卷id" , name = "examination_id")
    private int examination_id;

    @ApiModelProperty(value = "试卷名称" , name = "examination_name")
    private String examination_name;

    @ApiModelProperty(value = "工种id" , name = "worktype_id")
    private int worktype_id;

    @ApiModelProperty(value = "工种名称" , name = "worktype_name")
    private String worktype_name;

    @ApiModelProperty(value = "考试时间" , name = "exam_time")
    private int exam_time;

    @ApiModelProperty(value = "开始时间" , name = "worktype_name")
    private String start_time;

    @ApiModelProperty(value = "结束时间" , name = "worktype_name")
    private String end_time;

    @ApiModelProperty(value = "发布时间" , name = "worktype_name")
    private String up_time;

    @ApiModelProperty(value = "开始时间戳" , name = "start_timeC")
    private Long start_timeC;

    @ApiModelProperty(value = "结束时间戳" , name = "end_timeC")
    private Long end_timeC;

    public Exam() {
        super();
    }

    public Exam(int id, String exam_name, int section_id, int specialty_id, String specialty_name, int examination_id, String examination_name, int worktype_id, String worktype_name, int exam_time, String start_time, String end_time, String up_time, Long start_timeC, Long end_timeC) {
        this.id = id;
        this.exam_name = exam_name;
        this.section_id = section_id;
        this.specialty_id = specialty_id;
        this.specialty_name = specialty_name;
        this.examination_id = examination_id;
        this.examination_name = examination_name;
        this.worktype_id = worktype_id;
        this.worktype_name = worktype_name;
        this.exam_time = exam_time;
        this.start_time = start_time;
        this.end_time = end_time;
        this.up_time = up_time;
        this.start_timeC = start_timeC;
        this.end_timeC = end_timeC;
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

    public int getSpecialty_id() {
        return specialty_id;
    }

    public void setSpecialty_id(int specialty_id) {
        this.specialty_id = specialty_id;
    }

    public String getSpecialty_name() {
        return specialty_name;
    }

    public void setSpecialty_name(String specialty_name) {
        this.specialty_name = specialty_name;
    }

    public int getExamination_id() {
        return examination_id;
    }

    public void setExamination_id(int examination_id) {
        this.examination_id = examination_id;
    }

    public String getExamination_name() {
        return examination_name;
    }

    public void setExamination_name(String examination_name) {
        this.examination_name = examination_name;
    }

    public int getWorktype_id() {
        return worktype_id;
    }

    public void setWorktype_id(int worktype_id) {
        this.worktype_id = worktype_id;
    }

    public String getWorktype_name() {
        return worktype_name;
    }

    public void setWorktype_name(String worktype_name) {
        this.worktype_name = worktype_name;
    }

    public int getExam_time() {
        return exam_time;
    }

    public void setExam_time(int exam_time) {
        this.exam_time = exam_time;
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

    public String getUp_time() {
        return up_time;
    }

    public void setUp_time(String up_time) {
        this.up_time = up_time;
    }

    public Long getStart_timeC() {
        return start_timeC;
    }

    public void setStart_timeC(Long start_timeC) {
        this.start_timeC = start_timeC;
    }

    public Long getEnd_timeC() {
        return end_timeC;
    }

    public void setEnd_timeC(Long end_timeC) {
        this.end_timeC = end_timeC;
    }

    public String getExam_name() {
        return exam_name;
    }

    public void setExam_name(String exam_name) {
        this.exam_name = exam_name;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "id=" + id +
                ", exam_name='" + exam_name + '\'' +
                ", section_id=" + section_id +
                ", specialty_id=" + specialty_id +
                ", specialty_name='" + specialty_name + '\'' +
                ", examination_id=" + examination_id +
                ", examination_name='" + examination_name + '\'' +
                ", worktype_id=" + worktype_id +
                ", worktype_name='" + worktype_name + '\'' +
                ", exam_time=" + exam_time +
                ", start_time='" + start_time + '\'' +
                ", end_time='" + end_time + '\'' +
                ", up_time='" + up_time + '\'' +
                ", start_timeC=" + start_timeC +
                ", end_timeC=" + end_timeC +
                '}';
    }
}
