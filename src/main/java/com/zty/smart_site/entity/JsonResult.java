package com.zty.smart_site.entity;

public class JsonResult {
    private String message;//中文信息
    private Object data;//实体
    private Object statistics;
    private Integer code;

    public JsonResult(int userNotExist){
        super();
    }

    public JsonResult() {
        super();
        this.code = code;
        this.message = message;
    }

    public JsonResult(String message, Object data, Object statistics, Integer code) {
        this.message = message;
        this.data = data;
        this.statistics = statistics;
        this.code = code;
    }

    public JsonResult(int successCode, String successMsg, Object object) {
    }

    public static JsonResult build(Object object) {
        if (object != null) {
            return new JsonResult(ResultCode.SUCCESS_CODE);
        } else {
            return new JsonResult(ResultCode.NO_DATA_CODE);
        }
    }

    public static JsonResult build(Integer integer) {
        if (integer == 200 || integer == 1) {
            return new JsonResult(ResultCode.SUCCESS_CODE);
        } else if (integer == 201) {
            return new JsonResult(ResultCode.NO_DATA_CODE);
        } else if (integer == 20001) {
            return new JsonResult(ResultCode.USER_NOT_EXIST);
        } else if (integer == 20003) {
            return new JsonResult(ResultCode.USER_ACCOUNT_ERROR);
        } else if (integer == 20004) {
            return new JsonResult(ResultCode.USER_ACCOUNT_FORBIDDEN);
        } else if (integer == 20005) {
            return new JsonResult(ResultCode.INTERFACE_OUTER_INVOKE_ERROR);
        } else {
            return new JsonResult(ResultCode.ERROR_UNKNOWN_CODE);
        }
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

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "JsonResult{" +
                "message='" + message + '\'' +
                ", data=" + data +
                ", statistics=" + statistics +
                ", code=" + code +
                '}';
    }
}
