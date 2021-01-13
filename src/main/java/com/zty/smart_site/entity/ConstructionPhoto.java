package com.zty.smart_site.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "ConstructionPhoto" , description = "施工相册对象")
public class ConstructionPhoto {
    @ApiModelProperty(value = "施工相册id" , name = "id")
    private int id;

    @ApiModelProperty(value = "图片地址" , name = "url")
    private String url;

    @ApiModelProperty(value = "备注" , name = "message")
    private String message;

    @ApiModelProperty(value = "标段id" , name = "section_id")
    private int section_id;

    public ConstructionPhoto(){
        super();
    }

    public ConstructionPhoto(int id, String url, String message, int section_id) {
        this.id = id;
        this.url = url;
        this.message = message;
        this.section_id = section_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
