package com.zty.smart_site.entity;

public class JsonResult {
    private String message;//中文信息
    private Object data;//实体
    private Object data2;
    private Object data3;
    private Object data4;
    private Object data5;
    private Integer code;

    public JsonResult(int userNotExist) {
        super();
    }

    public JsonResult() {
        super();
        this.code = code;
        this.message = message;
    }

    public JsonResult(String message, Object data, Integer code) {
        this.message = message;
        this.data = data;
        this.code = code;
    }

    public JsonResult(String message, Object data, Object data2, Integer code) {
        this.message = message;
        this.data = data;
        this.data = data2;
        this.code = code;
    }

    public JsonResult(String message, Object data, Object data2, Object data3, Integer code) {
        this.message = message;
        this.data = data;
        this.data = data2;
        this.data = data3;
        this.code = code;
    }

    public JsonResult(String message, Object data, Object data2, Object data3, Object data4, Integer code) {
        this.message = message;
        this.data = data;
        this.data = data2;
        this.data = data3;
        this.data = data4;
        this.code = code;
    }

    public JsonResult(String message, Object data, Object data2, Object data3, Object data4, Object data5, Integer code) {
        this.message = message;
        this.data = data;
        this.data2 = data2;
        this.data3 = data3;
        this.data4 = data4;
        this.data5 = data5;
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
        } else if (integer == 20006) {
            return new JsonResult(ResultCode.ERROR);
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

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getData2() {
        return data2;
    }

    public void setData2(Object data2) {
        this.data2 = data2;
    }

    public Object getData3() {
        return data3;
    }

    public void setData3(Object data3) {
        this.data3 = data3;
    }

    public Object getData4() {
        return data4;
    }

    public void setData4(Object data4) {
        this.data4 = data4;
    }

    public Object getData5() {
        return data5;
    }

    public void setData5(Object data5) {
        this.data5 = data5;
    }

    @Override
    public String toString() {
        return "JsonResult{" +
                "message='" + message + '\'' +
                ", data=" + data +
                ", data2=" + data2 +
                ", data3=" + data3 +
                ", data4=" + data4 +
                ", data5=" + data5 +
                ", code=" + code +
                '}';
    }
}
