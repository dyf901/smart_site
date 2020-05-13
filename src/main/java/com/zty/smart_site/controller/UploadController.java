package com.zty.smart_site.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import sun.misc.BASE64Decoder;
import org.apache.tomcat.util.codec.binary.Base64;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Map;
import java.util.UUID;

@Api(description = "图片接口")
@RestController
@RequestMapping("img")
@CrossOrigin
public class UploadController {
    @ApiOperation(value = "上传图片" , notes = "")
    @PostMapping("upload")
    public String picture(@RequestParam("file") MultipartFile file) {
        String oldFileName = file.getOriginalFilename();
        int lastDotIndex = oldFileName.lastIndexOf(".");
        String extName = oldFileName.substring(lastDotIndex);
        String newName = UUID.randomUUID() + extName;
        File excelFile =
                new File("/root/img/"//   /root/img/    E:/test/
                        + newName);
        try {
            file.transferTo(excelFile);
            return newName;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "false";
    }

    @ApiOperation(value = "下载图片" , notes = "测试数据:{\"img_url\":\"安全行为之星系统.pdf\"}")
    @GetMapping("/download_img")
    public void find_img(@RequestParam String img_url, HttpServletResponse response) {
        System.out.println(img_url);
        try {
            BufferedInputStream bis =
                    new BufferedInputStream(
                            new FileInputStream(
                                    new File("/root/img/" + img_url)));//   /root/img/    E:/test/
            int num;
            byte[] b = new byte[1024];

            while ((num = bis.read(b)) != -1) {
                response.getOutputStream().write(b, 0, num);
            }
            response.getOutputStream().flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @ApiOperation(value = "base64" , notes = "测试数据:")
    @PostMapping("/base64_img")
    public String GenerateImage(@RequestBody Map map) {// 对字节数组字符串进行Base64解码并生成图片
        System.out.println(map.get("imgStr"));
        String imgStr1 = (String) map.get("imgStr");
        String imgStr = imgStr1.replaceAll(" " , "+");
        System.out.println("asd:" + imgStr);
        String dataPrix = ""; //base64格式前头
        String data = "";//实体部分数据
        //String imgFilePath="D:\\wangyc.png";
        if (imgStr == null) {// 图像数据为空
            return "添加失败!";
        } else {
            String[] d = imgStr.split("base64,");//将字符串分成数组
            if (d != null && d.length == 2) {
                dataPrix = d[0];
                data = d[1];
            } else {
                return "添加失败!";
            }
        }
        String suffix = "";//图片后缀，用以识别哪种格式数据
        //data:image/jpeg;base64,base64编码的jpeg图片数据
        if ("data:image/jpeg;".equalsIgnoreCase(dataPrix)) {
            suffix = ".jpg";
        } else if ("data:image/x-icon;".equalsIgnoreCase(dataPrix)) {
            //data:image/x-icon;base64,base64编码的icon图片数据
            suffix = ".ico";
        } else if ("data:image/gif;".equalsIgnoreCase(dataPrix)) {
            //data:image/gif;base64,base64编码的gif图片数据
            suffix = ".gif";
        } else if ("data:image/png;".equalsIgnoreCase(dataPrix)) {
            //data:image/png;base64,base64编码的png图片数据
            suffix = ".png";
        } else {
            return "添加失败!";
        }
        String uuid = UUID.randomUUID().toString().replaceAll("-" , "");
        String tempFileName = uuid + suffix;
        String imgFilePath = "/root/img/" + tempFileName;//新生成的图片地址   //   /root/img/    E:/test/
        //String imgFilePath = "/img/wisdom_site/"+tempFileName;//新生成图片的服务器地址
        System.out.println(tempFileName);
        System.out.println(imgFilePath);
        //BASE64Decoder decoder = new BASE64Decoder();
        try {
            // Base64解码
            byte[] bytes = Base64.decodeBase64(imgStr.replace("data:image/png;base64," , ""));// decoder.decodeBuffer(imgStr);
            imgStr = imgStr.replace("base64," , "");
            for (int i = 0; i < bytes.length; ++i) {
                if (bytes[i] < 0) {// 调整异常数据
                    bytes[i] += 256;
                }
            }
            // 生成jpeg图片
            OutputStream out = new FileOutputStream(imgFilePath);
            out.write(bytes);
            out.flush();
            out.close();
            return tempFileName;
        } catch (Exception e) {
            return "添加失败!";
        }
    }


}
