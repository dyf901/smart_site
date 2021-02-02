package com.zty.smart_site.controller;

import com.zty.smart_site.entity.AiMonitoring;
import com.zty.smart_site.service.AiMonitoringService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Api(description = "Ai监控接口")
@RestController
@RequestMapping("AiMonitoring")
@CrossOrigin
public class AiMonitoringController {
    @Autowired
    private AiMonitoringService aiMonitoringService;

    @ApiOperation(value = "增加Ai监控信息" , notes = "测试数据:")
    @PostMapping("/InsertAiMonitoring")
    public void InsertAiMonitoring(@RequestBody Map map) {
        System.out.println("map:"+map);
        String imgStr1 = (String) map.get("file");
        String imgStr = imgStr1.replaceAll(" " , "+");
        System.out.println("asd:" + imgStr);
        String dataPrix = ""; //base64格式前头
        String data = "";//实体部分数据
        //String imgFilePath="D:\\wangyc.png";
        if (imgStr == null) {// 图像数据为空

        } else {
            String[] d = imgStr.split("base64,");//将字符串分成数组
            if (d != null && d.length == 2) {
                dataPrix = d[0];
                data = d[1];
            } else {

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
        } else if ("data:image/jpg;".equalsIgnoreCase(dataPrix)) {
            //data:image/png;base64,base64编码的png图片数据
            suffix = ".jpg";
        }else {

        }
        String dataPrixX=dataPrix+"base64,";
        String uuid = UUID.randomUUID().toString().replaceAll("-" , "");
        String tempFileName = uuid + suffix;
        String imgFilePath = "/root/ai/" + tempFileName;//新生成的图片地址   //   /root/img/    E:/test/
        //String imgFilePath = "/img/wisdom_site/"+tempFileName;//新生成图片的服务器地址
        System.out.println(tempFileName);
        System.out.println(imgFilePath);
        //BASE64Decoder decoder = new BASE64Decoder();
        try {
            // Base64解码
            byte[] bytes = Base64.decodeBase64(imgStr.replace(dataPrixX , ""));// decoder.decodeBuffer(imgStr);
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
        } catch (Exception e) {

        }
        map.put("img",tempFileName);
        aiMonitoringService.InsertAiMonitoring(map);
    }

    @ApiOperation(value = "查询Ai监控信息" , notes = "测试数据:")
    @PostMapping("/FindAiMonitoring")
    public List<AiMonitoring> FindAiMonitoring(@RequestBody Map map){
        return aiMonitoringService.FindAiMonitoring(map);
    }

    @ApiOperation(value = "下拉框状态" , notes = "测试数据:")
    @PostMapping("/SelectOption")
    public List<AiMonitoring> SelectOption(@RequestBody Map map){
        return aiMonitoringService.SelectOption();
    }
}
