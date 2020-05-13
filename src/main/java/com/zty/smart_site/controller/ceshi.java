package com.zty.smart_site.controller;

import com.alibaba.fastjson.JSONObject;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ceshi {
    public static void main(String args[]) {
        try {
            /*JSONObject json = new JSONObject();
            json.put("id", 1);
            json.put("type", "peixun");*/


            Map<String, Object> map = new HashMap<String, Object>();
            map.put("id" , 1);
            map.put("type" , "培训");

            JSONObject json = new JSONObject(map);

            String s = json.toJSONString();
            //二维码表示的内容
            String content = "http://www.baidu.com";

            //存放logo的文件夹
            String path = "D:/ceshi/";

            MultiFormatWriter
                    multiFormatWriter = new MultiFormatWriter();

            @SuppressWarnings("rawtypes")
            Map hints = new HashMap();

            //设置UTF-8， 防止中文乱码
            hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
            //设置二维码四周白色区域的大小
            hints.put(EncodeHintType.MARGIN, 0);
            //设置二维码的容错性
            hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);

            //width:图片完整的宽;height:图片完整的高
            //因为要在二维码下方附上文字，所以把图片设置为长方形（高大于宽）
            int width = 400;
            int height = 460;

            //画二维码，记得调用multiFormatWriter.encode()时最后要带上hints参数，不然上面设置无效
            BitMatrix bitMatrix = multiFormatWriter.encode(s, BarcodeFormat.QR_CODE, width, height, hints);

            String uuid = UUID.randomUUID().toString().replaceAll("-" , "");
            String tempFileName = uuid + ".jpg";
            //qrcFile用来存放生成的二维码图片（无logo，无文字）
            File qrcFile = new File(path, tempFileName);

            //logoFile准备放在二维码中的图片(path:图片路径,图片名称)
            File logoFile = new File(path, "shilinwei.jpg");

            //开始画二维码
            MatrixToImageWriter.writeToFile(bitMatrix, "jpg" , qrcFile);

            /*//在二维码中加入图片
            CreatrQrCode creatrQrCode = new CreatrQrCode(); //LogoConfig中设置Logo的属性
            addLogo_QRCode(qrcFile, logoFile, creatrQrCode);


            int font = 20; //字体大小
            int fontStyle = 4; //字体风格

            //用来存放的带有logo+文字的二维码图片
            String newImageWithText = "D:/ceshi/456.jpg";
            //带有logo二维码图片
            String targetImage = "D:/ceshi/789.png";
            //附加在图片上的文字信息
            String text = "my name is Shi Linwei";

            //在二维码下方添加文字（文字居中）
            pressText(text, newImageWithText, targetImage, fontStyle, Color.red, font,  width,  height) ;*/

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
