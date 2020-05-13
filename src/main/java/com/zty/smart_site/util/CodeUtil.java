package com.zty.smart_site.util;

public class CodeUtil {

    private static int newcode;

    public static int getNewcode() {
        return newcode;
    }

    public static void setNewcode() {
        newcode = (int) (Math.random() * (999999 - 100000) + 100000);  //每次调用生成一位四位数的随机数
    }
}
