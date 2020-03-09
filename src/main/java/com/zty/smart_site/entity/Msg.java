package com.zty.smart_site.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Msg {
    private String message;//中文信息
    private Object data;//实体
    private Object statistics;
    private String code;

    public Msg(){
        super();
    }

    public Msg(String message, Object data, Object statistics, String code) {
        this.message = message;
        this.data = data;
        this.statistics = statistics;
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Object getStatistics() {
        return statistics;
    }

    public void setStatistics(Object statistics) {
        this.statistics = statistics;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "message='" + message + '\'' +
                ", data=" + data +
                ", statistics=" + statistics +
                '}';
    }
}
