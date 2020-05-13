package com.zty.smart_site.util;

public class ProvinceUtil {
    private static String province;

    //河北省、山西省、辽宁省、吉林省、黑龙江省、江苏省、浙江省、安徽省、福建省、江西省、山东省、河南省、湖北省、湖南省、广东省、海南省、四川省、贵州省、云南省、陕西省、甘肃省、青海省、台湾省
    //内蒙古自治区、广西壮族自治区、西藏自治区、宁夏回族自治区、新疆维吾尔自治区
    //北京市、天津市、上海市、重庆市
    //香港特别行政区、澳门特别行政区
    public static String Province(String address) {
        String asd = address.substring(0, 2);
        if (asd.equals("河北")) {
            province = asd + "省";
            return province;

        } else if (asd.equals("山西")) {
            province = asd + "省";
            return province;

        } else if (asd.equals("辽宁")) {
            province = asd + "省";
            return province;

        } else if (asd.equals("吉林")) {
            province = asd + "省";
            return province;

        } else if (asd.equals("黑龙")) {
            province = asd + "省";
            return province;

        } else if (asd.equals("江苏")) {
            province = asd + "省";
            return province;

        } else if (asd.equals("浙江")) {
            province = asd + "省";
            return province;

        } else if (asd.equals("安徽")) {
            province = asd + "省";
            return province;

        } else if (asd.equals("福建")) {
            province = asd + "省";
            return province;

        } else if (asd.equals("江西")) {
            province = asd + "省";
            return province;

        } else if (asd.equals("山东")) {
            province = asd + "省";
            return province;

        } else if (asd.equals("河南")) {
            province = asd + "省";
            return province;

        } else if (asd.equals("湖北")) {
            province = asd + "省";
            return province;

        } else if (asd.equals("湖南")) {
            province = asd + "省";
            return province;

        } else if (asd.equals("广东")) {
            province = asd + "省";
            return province;

        } else if (asd.equals("海南")) {
            province = asd + "省";
            return province;

        } else if (asd.equals("四川")) {
            province = asd + "省";
            return province;

        } else if (asd.equals("贵州")) {
            province = asd + "省";
            return province;

        } else if (asd.equals("云南")) {
            province = asd + "省";
            return province;

        } else if (asd.equals("陕西")) {
            province = asd + "省";
            return province;

        } else if (asd.equals("甘肃")) {
            province = asd + "省";
            return province;

        } else if (asd.equals("青海")) {
            province = asd + "省";
            return province;

        } else if (asd.equals("台湾")) {
            province = asd + "省";
            return province;

        } else if (asd.equals("内蒙")) {
            province = asd + "省";
            return province;

        } else if (asd.equals("广西")) {
            province = asd + "省";
            return province;

        } else if (asd.equals("西藏")) {
            province = asd + "省";
            return province;

        } else if (asd.equals("宁夏")) {
            province = asd + "省";
            return province;

        } else if (asd.equals("新疆")) {
            province = asd + "省";
            return province;

        } else if (asd.equals("北京")) {
            province = asd + "市";

        } else if (asd.equals("天津")) {
            province = asd + "市";

        } else if (asd.equals("上海")) {
            province = asd + "市";

        } else if (asd.equals("重庆")) {
            province = asd + "市";

        } else if (asd.equals("香港")) {
            province = asd + "省";
            return province;

        } else if (asd.equals("澳门")) {
            province = asd + "省";
            return province;

        } else {
            return "null";
        }
        return "asd";
    }
}
