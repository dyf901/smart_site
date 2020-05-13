/*
package com.zty.smart_site.controller;


import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;
import com.zty.smart_site.util.LogoConfig;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.ResourceBundle;

public class Demo {
    */
/**
 * 根据自定义的内容和图片名称生成二维码图片
 * 参考：https://blog.csdn.net/amberwangfeng/article/details/78657889
 * <p>
 * 给二维码添加logo
 * <p>
 * 给二维码下方附加说明文字
 *
 * @param pressText 文字
 * @param newImg    带文字的图片
 * @param image     需要添加文字的图片
 * @为图片添加文字
 *//*

    public static void main(String[] args ){
        String content = "http://api.sd-che.com:8080/ssm/fxck.html?"+"userId="+423+"&userType="+1;
        String qRCodeName = "code/qRCode"+"PassengerId"+423+".png";
        boolean flag = false;
        int width = 300;
        int height = 400;
        String format = "png";
        String text="分享时代分享经济";
        int font = 10; //字体大小
        int fontStyle = 1; //字体风格

        //定义二维码的参数
        HashMap hashMap = new HashMap();
        hashMap.put(EncodeHintType.CHARACTER_SET, "utf-8");
        hashMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);
        hashMap.put(EncodeHintType.MARGIN, 4);
        try {
            BitMatrix bitMatrix = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, width, height, hashMap);
            //存放二维码图片的文件夹
            String rootPath = ResourceBundle.getBundle("server-config").getString("image_host")+"/";

            Path path = new File(rootPath+qRCodeName).toPath();
            //二维码图片的全路径
            rootPath=rootPath+qRCodeName;

            File logoFile = new File("d:/test/jianshun.png");//logo图片
            //开始画二维码
            BufferedImage barCodeImage = MatrixToImageWriter.writeToFile(bitMatrix, format);

            //在二维码中加入图片
            LogoConfig logoConfig = new LogoConfig(); //LogoConfig中设置Logo的属性
            BufferedImage image = addLogo_QRCode(barCodeImage, logoFile, logoConfig);

            //向图片中添加文字
            pressText(text, rootPath, image, fontStyle, Color.black, font, width, height);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
    */
/**
 * 给二维码添加logo
 *//*

    public static BufferedImage addLogo_QRCode(BufferedImage barCodeImage, File logoPic, LogoConfig logoConfig) {
        try {
            if (!logoPic.isFile()) {
                System.out.print("file not find !");
                throw new IOException("file not find !");
            }

            // 读取二维码图片，并构建绘图对象
            Graphics2D g = barCodeImage.createGraphics();

            //读取Logo图片
            BufferedImage logo = ImageIO.read(logoPic);

            int widthLogo = barCodeImage.getWidth() / logoConfig.getLogoPart();
            int heightLogo = barCodeImage.getWidth() / logoConfig.getLogoPart(); //保持二维码是正方形的

            // 计算图片放置位置
            int x = (barCodeImage.getWidth() - widthLogo) / 2;
            int y = (barCodeImage.getHeight() - heightLogo) / 2 - 50;

            //开始绘制图片
            g.drawImage(logo, x, y, widthLogo, heightLogo, null);
            g.drawRoundRect(x, y, widthLogo, heightLogo, 10, 10);
            g.setStroke(new BasicStroke(logoConfig.getBorder()));
            g.setColor(logoConfig.getBorderColor());
            g.drawRect(x, y, widthLogo, heightLogo);
            g.dispose();
            return barCodeImage;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    */
/**
 * 给二维码下方附加说明文字
 * @param pressText 文字
 * @param newImg    带文字的图片
 * @param image     需要添加文字的图片
 * @为图片添加文字
 *//*

    public static void pressText(String pressText, String newImg, BufferedImage image, int fontStyle, Color color, int fontSize, int width, int height) {

        //计算文字开始的位置
        //x开始的位置：（图片宽度-字体大小*字的个数）/2
        int startX = (width - (fontSize * pressText.length()))/3 - 28;
        //y开始的位置：图片高度-（图片高度-图片宽度）/2
        int startY = height - (height - width) / 2 - 30;

        System.out.println("startX: " + startX);
        System.out.println("startY: " + startY);
        System.out.println("height: " + height);
        System.out.println("width: " + width);
        System.out.println("fontSize: " + fontSize);
        System.out.println("pressText.length(): " + pressText.length());

        try {
            int imageW = image.getWidth();
            int imageH = image.getHeight();
            Graphics g = image.createGraphics();
            g.drawImage(image, 0, 0, imageW, imageH, null);
            g.setColor(color);
            g.setFont(new Font("粗体", Font.BOLD, 25));
            g.drawString(pressText, startX, startY);
            g.drawString("", startX-5, startY + 30);
            g.dispose();

            FileOutputStream out = new FileOutputStream(newImg);
            ImageIO.write(image, "png", out);
            JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
            encoder.encode(image);
            out.close();
            System.out.println("image press success");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }
}
*/
