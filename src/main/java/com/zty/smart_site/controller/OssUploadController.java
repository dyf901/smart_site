package com.zty.smart_site.controller;
import com.zty.smart_site.util.AliyunOSSUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;

@Api(description = "阿里云oss图片接口")
@RestController
@RequestMapping("Ossimg")
@CrossOrigin
public class OssUploadController {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(UploadController.class);

    @ApiOperation(value = "阿里云oss上传图片",notes = "")
    @PostMapping("/OssUpload")
    public String uploadBlog(MultipartFile file) {

        try {

            if (null != file) {
                String filename = file.getOriginalFilename();
                if (!"".equals(filename.trim())) {
                    File newFile = new File(filename);
                    FileOutputStream os = new FileOutputStream(newFile);
                    os.write(file.getBytes());
                    os.close();
                    file.transferTo(newFile);
                    //上传到OSS
                    String uploadUrl = "https://jjjt.oss-cn-shanghai.aliyuncs.com/"+AliyunOSSUtil.upload(newFile);
                    return uploadUrl;
                }

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "upload";
    }

}
