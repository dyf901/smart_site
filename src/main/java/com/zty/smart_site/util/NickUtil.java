package com.zty.smart_site.util;

import java.util.Random;

public class NickUtil {
    private static String nickname;

    public static String getNickname() {
        return nickname;
    }

    public static void setNickname() {
        Random random = new Random();

        StringBuffer valSb = new StringBuffer();

        String charStr = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        int charLength = charStr.length();


        for (int i = 0; i < 16; i++) {

            int index = random.nextInt(charLength);

            valSb.append(charStr.charAt(index));

        }


        nickname = valSb.toString();
    }
}
