package com.zty.smart_site.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "TrainPhoto" , description = "培训相册对象")
public class TrainPhoto {
    @ApiModelProperty(value = "培训相册id" , name = "id")
    private int id;

    @ApiModelProperty(value = "图片地址" , name = "url")
    private String url;

    @ApiModelProperty(value = "标段id" , name = "section_id")
    private int section_id;

    public TrainPhoto(){
        super();
    }

    public TrainPhoto(int id, String url, int section_id) {
        this.id = id;
        this.url = url;
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
}
