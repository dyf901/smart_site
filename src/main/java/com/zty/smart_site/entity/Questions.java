package com.zty.smart_site.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "questions" , description = "题目表对象")
public class Questions {
    @ApiModelProperty(value = "题目id" , name = "id")
    private int id;

    @ApiModelProperty(value = "标段id" , name = "section_id")
    private int section_id;

    @ApiModelProperty(value = "知识id" , name = "knowledge_id")
    private int knowledge_id;

    @ApiModelProperty(value = "专业id" , name = "specialty_id")
    private int specialty_id;

    @ApiModelProperty(value = "专业id" , name = "count")
    private int count;

    @ApiModelProperty(value = "题目类型(选择,填空,判断,简答)" , name = "questions_type")
    private String questions_type;

    @ApiModelProperty(value = "知识名称" , name = "knowledge_name")
    private String knowledge_name;

    @ApiModelProperty(value = "专业名称" , name = "specialty_name")
    private String specialty_name;

    @ApiModelProperty(value = "题目内容" , name = "questions_content")
    private String questions_content;

    @ApiModelProperty(value = "选择题A选项" , name = "select_A")
    private String select_A;

    @ApiModelProperty(value = "选择题A选项" , name = "select_B")
    private String select_B;

    @ApiModelProperty(value = "选择题A选项" , name = "select_C")
    private String select_C;

    @ApiModelProperty(value = "选择题A选项" , name = "select_D")
    private String select_D;

    @ApiModelProperty(value = "选择题答案" , name = "select_answer")
    private String select_answer;

    @ApiModelProperty(value = "填空题答案" , name = "gap_answer")
    private String gap_answer;

    @ApiModelProperty(value = "简答题答案" , name = "short_answer")
    private String short_answer;

    @ApiModelProperty(value = "判断题答案" , name = "judge_answer")
    private Boolean judge_answer;

    public Questions() {
        super();
    }

    public Questions(int id, int section_id, int knowledge_id, int specialty_id, int count, String questions_type, String knowledge_name, String specialty_name, String questions_content, String select_A, String select_B, String select_C, String select_D, String select_answer, String gap_answer, String short_answer, Boolean judge_answer) {
        this.id = id;
        this.section_id = section_id;
        this.knowledge_id = knowledge_id;
        this.specialty_id = specialty_id;
        this.count = count;
        this.questions_type = questions_type;
        this.knowledge_name = knowledge_name;
        this.specialty_name = specialty_name;
        this.questions_content = questions_content;
        this.select_A = select_A;
        this.select_B = select_B;
        this.select_C = select_C;
        this.select_D = select_D;
        this.select_answer = select_answer;
        this.gap_answer = gap_answer;
        this.short_answer = short_answer;
        this.judge_answer = judge_answer;
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

    public int getKnowledge_id() {
        return knowledge_id;
    }

    public void setKnowledge_id(int knowledge_id) {
        this.knowledge_id = knowledge_id;
    }

    public int getSpecialty_id() {
        return specialty_id;
    }

    public void setSpecialty_id(int specialty_id) {
        this.specialty_id = specialty_id;
    }

    public String getQuestions_type() {
        return questions_type;
    }

    public void setQuestions_type(String questions_type) {
        this.questions_type = questions_type;
    }

    public String getQuestions_content() {
        return questions_content;
    }

    public void setQuestions_content(String questions_content) {
        this.questions_content = questions_content;
    }

    public String getSelect_A() {
        return select_A;
    }

    public void setSelect_A(String select_A) {
        this.select_A = select_A;
    }

    public String getSelect_B() {
        return select_B;
    }

    public void setSelect_B(String select_B) {
        this.select_B = select_B;
    }

    public String getSelect_C() {
        return select_C;
    }

    public void setSelect_C(String select_C) {
        this.select_C = select_C;
    }

    public String getSelect_D() {
        return select_D;
    }

    public void setSelect_D(String select_D) {
        this.select_D = select_D;
    }

    public String getSelect_answer() {
        return select_answer;
    }

    public void setSelect_answer(String select_answer) {
        this.select_answer = select_answer;
    }

    public String getGap_answer() {
        return gap_answer;
    }

    public void setGap_answer(String gap_answer) {
        this.gap_answer = gap_answer;
    }

    public String getShort_answer() {
        return short_answer;
    }

    public void setShort_answer(String short_answer) {
        this.short_answer = short_answer;
    }

    public Boolean getJudge_answer() {
        return judge_answer;
    }

    public void setJudge_answer(Boolean judge_answer) {
        this.judge_answer = judge_answer;
    }

    public String getKnowledge_name() {
        return knowledge_name;
    }

    public void setKnowledge_name(String knowledge_name) {
        this.knowledge_name = knowledge_name;
    }

    public String getSpecialty_name() {
        return specialty_name;
    }

    public void setSpecialty_name(String specialty_name) {
        this.specialty_name = specialty_name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Questions{" +
                "id=" + id +
                ", section_id=" + section_id +
                ", knowledge_id=" + knowledge_id +
                ", specialty_id=" + specialty_id +
                ", count=" + count +
                ", questions_type='" + questions_type + '\'' +
                ", knowledge_name='" + knowledge_name + '\'' +
                ", specialty_name='" + specialty_name + '\'' +
                ", questions_content='" + questions_content + '\'' +
                ", select_A='" + select_A + '\'' +
                ", select_B='" + select_B + '\'' +
                ", select_C='" + select_C + '\'' +
                ", select_D='" + select_D + '\'' +
                ", select_answer='" + select_answer + '\'' +
                ", gap_answer='" + gap_answer + '\'' +
                ", short_answer='" + short_answer + '\'' +
                ", judge_answer=" + judge_answer +
                '}';
    }
}
