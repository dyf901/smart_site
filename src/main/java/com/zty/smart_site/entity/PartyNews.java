package com.zty.smart_site.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "PartyNews" , description = "党建新闻对象")
public class PartyNews {
    @ApiModelProperty(value = "党建新闻id" , name = "id")
    private int id;

    @ApiModelProperty(value = "党建新闻标题" , name = "url")
    private String title;

    @ApiModelProperty(value = "图片地址" , name = "url")
    private String url;

    @ApiModelProperty(value = "日期" , name = "url")
    private String date_time;

    @ApiModelProperty(value = "标段id" , name = "section_id")
    private int section_id;

    public PartyNews(){
        super();
    }

    public PartyNews(int id, String title, String url, String date_time, int section_id) {
        this.id = id;
        this.title = title;
        this.url = url;
        this.date_time = date_time;
        this.section_id = section_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDate_time() {
        return date_time;
    }

    public void setDate_time(String date_time) {
        this.date_time = date_time;
    }

    public int getSection_id() {
        return section_id;
    }

    public void setSection_id(int section_id) {
        this.section_id = section_id;
    }
}
