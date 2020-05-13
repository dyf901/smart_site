package com.zty.smart_site.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "genre_type" , description = "培训类型")
public class TrainGenre {
    @ApiModelProperty(value = "ID" , name = "id")
    private int id;

    @ApiModelProperty(value = "类型名称" , name = "genre_name")
    private String genre_name;

    public TrainGenre() {
        super();
    }

    public TrainGenre(int id, String genre_name) {
        this.id = id;
        this.genre_name = genre_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGenre_name() {
        return genre_name;
    }

    public void setGenre_name(String genre_name) {
        this.genre_name = genre_name;
    }

    @Override
    public String toString() {
        return "TrainGenre{" +
                "id=" + id +
                ", genre_name='" + genre_name + '\'' +
                '}';
    }
}
