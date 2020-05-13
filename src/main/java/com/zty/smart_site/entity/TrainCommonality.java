package com.zty.smart_site.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "train_commonality" , description = "培训对象")
public class TrainCommonality {

    @ApiModelProperty(value = "ID" , name = "id")
    private int id;

    @ApiModelProperty(value = "培训类型id" , name = "type_id")
    private int type_id;

    @ApiModelProperty(value = "建造类型id" , name = "genre_id")
    private int genre_id;

    @ApiModelProperty(value = "培训名称" , name = "commonality_name")
    private String commonality_name;

    @ApiModelProperty(value = "培训类型名称" , name = "type_name")
    private String type_name;

    @ApiModelProperty(value = "建造类型名称" , name = "genre_name")
    private String genre_name;

    @ApiModelProperty(value = "内容" , name = "content")
    private String content;

    @ApiModelProperty(value = "视频地址" , name = "video_url")
    private String video_url;

    public TrainCommonality() {
        super();
    }

    public TrainCommonality(int id, int type_id, int genre_id, String commonality_name, String type_name, String genre_name, String content, String video_url) {
        this.id = id;
        this.type_id = type_id;
        this.genre_id = genre_id;
        this.commonality_name = commonality_name;
        this.type_name = type_name;
        this.genre_name = genre_name;
        this.content = content;
        this.video_url = video_url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType_id() {
        return type_id;
    }

    public void setType_id(int type_id) {
        this.type_id = type_id;
    }

    public int getGenre_id() {
        return genre_id;
    }

    public void setGenre_id(int genre_id) {
        this.genre_id = genre_id;
    }

    public String getCommonality_name() {
        return commonality_name;
    }

    public void setCommonality_name(String commonality_name) {
        this.commonality_name = commonality_name;
    }

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }

    public String getGenre_name() {
        return genre_name;
    }

    public void setGenre_name(String genre_name) {
        this.genre_name = genre_name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getVideo_url() {
        return video_url;
    }

    public void setVideo_url(String video_url) {
        this.video_url = video_url;
    }

    @Override
    public String toString() {
        return "TrainCommonality{" +
                "id=" + id +
                ", type_id=" + type_id +
                ", genre_id=" + genre_id +
                ", commonality_name='" + commonality_name + '\'' +
                ", type_name='" + type_name + '\'' +
                ", genre_name='" + genre_name + '\'' +
                ", content='" + content + '\'' +
                ", video_url='" + video_url + '\'' +
                '}';
    }
}
