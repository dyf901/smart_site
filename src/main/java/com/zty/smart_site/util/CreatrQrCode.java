/*
package com.zty.smart_site.util;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;

public class CreatrQrCode {
    // logo默认边框颜色
    public static final Color DEFAULT_BORDERCOLOR = Color.WHITE;
    // logo默认边框宽度
    public static final int DEFAULT_BORDER = 1;
    // logo大小默认为照片的1/6
    public static final int DEFAULT_LOGOPART = 6;

    private final int border = DEFAULT_BORDER;
    private final Color borderColor;
    private final int logoPart;

    */
/**
 * Creates a default config with on color {@link #BLACK} and off color
 * {@link #WHITE}, generating normal black-on-white barcodes.
 * <p>
 * 给二维码图片添加Logo
 *
 * @param qrPic
 * @param logoPic
 * <p>
 * 读取二维码图片，并构建绘图对象
 * <p>
 * 读取Logo图片
 * @param pressText 文字
 * @param newImg    带文字的图片
 * @param targetImg 需要添加文字的图片
 * @param fontStyle
 * @param color
 * @param fontSize
 * @param width
 * @param height
 * @为图片添加文字 Creates a default config with on color {@link #BLACK} and off color
 * {@link #WHITE}, generating normal black-on-white barcodes.
 * 在颜色{@ link #黑}和颜色上创建一个默认配置
 * {@link # WHITE}，生成正常的黑白条码。
 * <p>
 * 给二维码图片添加Logo
 * @param qrPic
 * @param logoPic
 * <p>
 * 读取二维码图片，并构建绘图对象
 * <p>
 * 读取Logo图片
 * @param pressText 文字
 * @param newImg    带文字的图片
 * @param targetImg 需要添加文字的图片
 * @param fontStyle
 * @param color
 * @param fontSize
 * @param width
 * @param height
 * @为图片添加文字 给二维码图片添加Logo
 * @param qrPic
 * @param logoPic
 * <p>
 * 读取二维码图片，并构建绘图对象
 * <p>
 * 读取Logo图片
 * @param pressText 文字
 * @param newImg    带文字的图片
 * @param targetImg 需要添加文字的图片
 * @param fontStyle
 * @param color
 * @param fontSize
 * @param width
 * @param height
 * @为图片添加文字 Creates a default config with on color {@link #BLACK} and off color
 * {@link #WHITE}, generating normal black-on-white barcodes.
 * 在颜色{@ link #黑}和颜色上创建一个默认配置
 * {@link # WHITE}，生成正常的黑白条码。
 * <p>
 * 给二维码图片添加Logo
 * @param qrPic
 * @param logoPic
 * <p>
 * 读取二维码图片，并构建绘图对象
 * <p>
 * 读取Logo图片
 * @param pressText 文字
 * @param newImg    带文字的图片
 * @param targetImg 需要添加文字的图片
 * @param fontStyle
 * @param color
 * @param fontSize
 * @param width
 * @param height
 * @为图片添加文字
 *//*

    public CreatrQrCode() {
        this(DEFAULT_BORDERCOLOR, DEFAULT_LOGOPART);
    }

    public CreatrQrCode(Color borderColor, int logoPart) {
        this.borderColor = borderColor;
        this.logoPart = logoPart;
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public int getBorder() {
        return border;
    }

    public int getLogoPart() {
        return logoPart;
    }

    */
/**
 * 给二维码图片添加Logo
 *
 * @param qrPic
 * @param logoPic
 *//*

    public static void addLogo_QRCode(File qrPic, File logoPic, CreatrQrCode logoConfig) {
        try {
            if (!qrPic.isFile() || !logoPic.isFile()) {
                System.out.print("file not find !");
                System.exit(0);
            }

            */
/**
 * 读取二维码图片，并构建绘图对象
 *//*

            BufferedImage image = ImageIO.read(qrPic);
            Graphics2D g = image.createGraphics();

            */
/**
 * 读取Logo图片
 *//*

            BufferedImage logo = ImageIO.read(logoPic);

            int widthLogo = image.getWidth() / logoConfig.getLogoPart();
            //    int    heightLogo = image.getHeight()/logoConfig.getLogoPart();
            int heightLogo = image.getWidth() / logoConfig.getLogoPart(); //保持二维码是正方形的

            // 计算图片放置位置
            int x = (image.getWidth() - widthLogo) / 2;
            int y = (image.getHeight() - heightLogo) / 2;


            //开始绘制图片
            g.drawImage(logo, x, y, widthLogo, heightLogo, null);
            g.drawRoundRect(x, y, widthLogo, heightLogo, 10, 10);
            g.setStroke(new BasicStroke(logoConfig.getBorder()));
            g.setColor(logoConfig.getBorderColor());
            g.drawRect(x, y, widthLogo, heightLogo);

            g.dispose();

            ImageIO.write(image, "jpeg", new File("D:/ceshi/789.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    */
/**
 * @param pressText 文字
 * @param newImg    带文字的图片
 * @param targetImg 需要添加文字的图片
 * @param fontStyle
 * @param color
 * @param fontSize
 * @param width
 * @param height
 * @为图片添加文字
 *//*

    public static void pressText(String pressText, String newImg, String targetImg, int fontStyle, Color color, int fontSize, int width, int height) {

        //计算文字开始的位置
        //x开始的位置：（图片宽度-字体大小*字的个数）/2
        int startX = (width - (fontSize * pressText.length())) / 2;
        //y开始的位置：图片高度-（图片高度-图片宽度）/2
        int startY = height - (height - width) / 2;

        try {
            public class CreatrQrCode {
                // logo默认边框颜色
                //public static final Color DEFAULT_BORDERCOLOR = Color.WHITE;
                // logo默认边框宽度
                public static final int DEFAULT_BORDER = 1;
                // logo大小默认为照片的1/6
                public static final int DEFAULT_LOGOPART = 6;

                private final int border = DEFAULT_BORDER;
                private final Color borderColor;
                private final int logoPart;

                */
/**
 * Creates a default config with on color {@link #BLACK} and off color
 * {@link #WHITE}, generating normal black-on-white barcodes.
 * 在颜色{@ link #黑}和颜色上创建一个默认配置
     *  {@link # WHITE}，生成正常的黑白条码。
 *//*

                public CreatrQrCode() {
                    this(DEFAULT_BORDERCOLOR, DEFAULT_LOGOPART);
                }

                public CreatrQrCode(Color borderColor, int logoPart) {
                    this.borderColor = borderColor;
                    this.logoPart = logoPart;
                }

                public Color getBorderColor() {
                    return borderColor;
                }

                public int getBorder() {
                    return border;
                }

                public int getLogoPart() {
                    return logoPart;
                }

                */
/**
 * 给二维码图片添加Logo
 *
 * @param qrPic
 * @param logoPic
 *//*

                public void addLogo_QRCode(File qrPic, File logoPic, CreatrQrCode creatrQrCode) {
                    try {
                        if (!qrPic.isFile() || !logoPic.isFile()) {
                            System.out.print("file not find !");
                            System.exit(0);
                        }

                        */
/**
 * 读取二维码图片，并构建绘图对象
 *//*

                        BufferedImage image = ImageIO.read(qrPic);
                        Graphics2D g = image.createGraphics();

                        */
/**
 * 读取Logo图片
 *//*

                        BufferedImage logo = ImageIO.read(logoPic);

                        int widthLogo = image.getWidth() / creatrQrCode.getLogoPart();
                        //    int    heightLogo = image.getHeight()/logoConfig.getLogoPart();
                        int heightLogo = image.getWidth() / creatrQrCode.getLogoPart(); //保持二维码是正方形的

                        // 计算图片放置位置
                        int x = (image.getWidth() - widthLogo) / 2;
                        int y = (image.getHeight() - heightLogo) / 2;


                        //开始绘制图片
                        g.drawImage(logo, x, y, widthLogo, heightLogo, null);
                        g.drawRoundRect(x, y, widthLogo, heightLogo, 10, 10);
                        g.setStroke(new BasicStroke(creatrQrCode.getBorder()));
                        g.setColor(creatrQrCode.getBorderColor());
                        g.drawRect(x, y, widthLogo, heightLogo);

                        g.dispose();

                        ImageIO.write(image, "jpeg", new File("D:/ceshi/789.png"));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                */
/**
 * @param pressText 文字
 * @param newImg    带文字的图片
 * @param targetImg 需要添加文字的图片
 * @param fontStyle
 * @param color
 * @param fontSize
 * @param width
 * @param height
 * @为图片添加文字
 *//*

                public void pressText(String pressText, String newImg, String targetImg, int fontStyle, Color color, int fontSize, int width, int height) {

                    //计算文字开始的位置
                    //x开始的位置：（图片宽度-字体大小*字的个数）/2
                    int startX = (width - (fontSize * pressText.length())) / 300;
                    //y开始的位置：图片高度-（图片高度-图片宽度）/2
                    int startY = height - (height - width) / 3;

                    try {
                        File file = new File(targetImg);
                        Image src = ImageIO.read(file);
                        int imageW = src.getWidth(null);
                        int imageH = src.getHeight(null);
                        BufferedImage image = new BufferedImage(imageW, imageH, BufferedImage.TYPE_INT_RGB);
                        Graphics g = image.createGraphics();
                        g.drawImage(src, 0, 0, imageW, imageH, null);
                        g.setColor(color);
                        g.setFont(new Font(null, fontStyle, fontSize));
                        g.drawString(pressText, startX, startY);
                        g.dispose();

                        FileOutputStream out = new FileOutputStream(newImg);
                        ImageIO.write(image, "JPEG", out);
                        JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
                        encoder.encode(image);
                        out.close();
                        System.out.println("image press success");
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
*/
