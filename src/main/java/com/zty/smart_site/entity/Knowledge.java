package com.zty.smart_site.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "knowledge" , description = "知识表对象")
public class Knowledge {
    @ApiModelProperty(value = "题目id" , name = "id")
    private int id;

    @ApiModelProperty(value = "知识名称" , name = "knowledge_name")
    private String knowledge_name;

    @ApiModelProperty(value = "标段id" , notes = "section_id")
    private int section_id;

    public Knowledge() {
        super();
    }

    public Knowledge(int id, String knowledge_name, int section_id) {
        this.id = id;
        this.knowledge_name = knowledge_name;
        this.section_id = section_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKnowledge_name() {
        return knowledge_name;
    }

    public void setKnowledge_name(String knowledge_name) {
        this.knowledge_name = knowledge_name;
    }

    public int getSection_id() {
        return section_id;
    }

    public void setSection_id(int section_id) {
        this.section_id = section_id;
    }

    @Override
    public String toString() {
        return "Knowledge{" +
                "id=" + id +
                ", knowledge_name='" + knowledge_name + '\'' +
                ", section_id=" + section_id +
                '}';
    }
}
