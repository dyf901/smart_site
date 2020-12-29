package com.zty.smart_site.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "TrainPhoto" , description = "培训相册对象")
public class TrainPhoto {
    @ApiModelProperty(value = "培训相册id" , name = "id")
    private int id;

    @ApiModelProperty(value = "图片地址" , name = "img_url")
    private String img_url;

    @ApiModelProperty(value = "标段id" , name = "section_id")
    private int section_id;

    @ApiModelProperty(value = "备注" , name = "message")
    private String message;

    public TrainPhoto(){
        super();
    }

    public TrainPhoto(int id, String img_url, int section_id, String message) {
        this.id = id;
        this.img_url = img_url;
        this.section_id = section_id;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public int getSection_id() {
        return section_id;
    }

    public void setSection_id(int section_id) {
        this.section_id = section_id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
