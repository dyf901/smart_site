package com.zty.smart_site.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "examination" , description = "试卷表对象")
public class Examination {
    @ApiModelProperty(value = "试卷id" , name = "id")
    private int id;

    @ApiModelProperty(value = "标段id" , name = "section_id")
    private int section_id;

    @ApiModelProperty(value = "试卷类型id" , name = "specialty_id")
    private int specialty_id;

    @ApiModelProperty(value = "试卷类型名称" , name = "specialty_name")
    private String specialty_name;

    @ApiModelProperty(value = "试卷名称" , name = "examination_name")
    private String examination_name;

    @ApiModelProperty(value = "题目(数组)" , name = "questions")
    private String questions;

    @ApiModelProperty(value = "选择题分数(每道题)" , name = "select_count")
    private int select_count;

    @ApiModelProperty(value = "判断题分数" , name = "judge_count")
    private int judge_count;

    @ApiModelProperty(value = "填空题分数" , name = "gap_count")
    private int gap_count;

    @ApiModelProperty(value = "简答题答案" , name = "short_count")
    private int short_count;

    @ApiModelProperty(value = "考试时间" , name = "exam_time")
    private int exam_time;

    public Examination() {
        super();
    }

    public Examination(int id, int section_id, int specialty_id, String specialty_name, String examination_name, String questions, int select_count, int judge_count, int gap_count, int short_count, int exam_time) {
        this.id = id;
        this.section_id = section_id;
        this.specialty_id = specialty_id;
        this.specialty_name = specialty_name;
        this.examination_name = examination_name;
        this.questions = questions;
        this.select_count = select_count;
        this.judge_count = judge_count;
        this.gap_count = gap_count;
        this.short_count = short_count;
        this.exam_time = exam_time;
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

    public String getExamination_name() {
        return examination_name;
    }

    public void setExamination_name(String examination_name) {
        this.examination_name = examination_name;
    }

    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    public int getSelect_count() {
        return select_count;
    }

    public void setSelect_count(int select_count) {
        this.select_count = select_count;
    }

    public int getJudge_count() {
        return judge_count;
    }

    public void setJudge_count(int judge_count) {
        this.judge_count = judge_count;
    }

    public int getGap_count() {
        return gap_count;
    }

    public void setGap_count(int gap_count) {
        this.gap_count = gap_count;
    }

    public int getShort_count() {
        return short_count;
    }

    public void setShort_count(int short_count) {
        this.short_count = short_count;
    }

    public int getExam_time() {
        return exam_time;
    }

    public void setExam_time(int exam_time) {
        this.exam_time = exam_time;
    }

    public String getSpecialty_name() {
        return specialty_name;
    }

    public void setSpecialty_name(String specialty_name) {
        this.specialty_name = specialty_name;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", section_id=" + section_id +
                ", examinationtype_id=" + specialty_id +
                ", specialty_name=" + specialty_name +
                ", examination_name='" + examination_name + '\'' +
                ", questions='" + questions + '\'' +
                ", select_count=" + select_count +
                ", judge_count=" + judge_count +
                ", gap_count=" + gap_count +
                ", short_count=" + short_count +
                ", exam_time=" + exam_time +
                '}';
    }
}
