package com.zty.smart_site.entity;

public class ResultCode {

    // 成功状态码
    public static final int SUCCESS_CODE = 200;

    //无数据
    public static final int NO_DATA_CODE = 20000;

    // 用户错误
    public static final int USER_NOT_EXIST = 20001; // 用户不存在
    public static final int USER_ACCOUNT_ERROR = 20003; // 用户名或密码错误
    public static final int USER_ACCOUNT_FORBIDDEN = 20004; // 用户账户已过期

    //短信验证码
    public static final int INTERFACE_OUTER_INVOKE_ERROR = 20005;// 错误


    public static final int ERROR_UNKNOWN_CODE = 70001;// 错误

    public static final int ERROR = 20006;//失败

}
