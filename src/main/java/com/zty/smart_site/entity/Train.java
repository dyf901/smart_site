package com.zty.smart_site.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "train" , description = "培训对象")
public class Train {
    @ApiModelProperty(value = "ID" , name = "id")
    private int id;

    @ApiModelProperty(value = "培训类型id" , name = "type_id")
    private int type_id;

    @ApiModelProperty(value = "标段id" , name = "section_id")
    private int section_id;

    @ApiModelProperty(value = "培训名称" , name = "train_name")
    private String train_name;

    @ApiModelProperty(value = "培训类型名称" , name = "type_name")
    private String type_name;

    @ApiModelProperty(value = "内容" , name = "content")
    private String content;

    @ApiModelProperty(value = "视频地址" , name = "video_url")
    private String video_url;

    public Train() {
        super();
    }

    public Train(int id, int type_id, int section_id, String train_name, String type_name, String content, String video_url) {
        this.id = id;
        this.type_id = type_id;
        this.section_id = section_id;
        this.train_name = train_name;
        this.type_name = type_name;
        this.content = content;
        this.video_url = video_url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType_id(Long l) {
        return type_id;
    }

    public void setType_id(int type_id) {
        this.type_id = type_id;
    }

    public int getSection_id() {
        return section_id;
    }

    public void setSection_id(int section_id) {
        this.section_id = section_id;
    }

    public String getTrain_name() {
        return train_name;
    }

    public void setTrain_name(String train_name) {
        this.train_name = train_name;
    }

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getType_id() {
        return type_id;
    }

    public String getVideo_url() {
        return video_url;
    }

    public void setVideo_url(String video_url) {
        this.video_url = video_url;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", type_id=" + type_id +
                ", section_id=" + section_id +
                ", train_name='" + train_name + '\'' +
                ", type_name='" + type_name + '\'' +
                ", content='" + content + '\'' +
                ", video_url='" + video_url + '\'' +
                '}';
    }
}
