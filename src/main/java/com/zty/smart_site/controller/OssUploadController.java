package com.zty.smart_site.controller;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.OSSException;
import com.aliyun.oss.model.*;
import com.zty.smart_site.util.AliyunOSSUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Api(description = "阿里云oss图片接口")
@RestController
@RequestMapping("Ossimg")
@CrossOrigin
public class OssUploadController {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(UploadController.class);

    @ApiOperation(value = "商品图片上传" , notes = "")
    @PostMapping("/CommodityUpload")
    public String CommodityUpload(MultipartFile file) {

        try {

            if (null != file) {
                String filename = file.getOriginalFilename();
                if (!"".equals(filename.trim())) {
                    File newFile = new File(filename);
                    FileOutputStream os = new FileOutputStream(newFile);
                    os.write(file.getBytes());
                    os.close();
                    file.transferTo(newFile);
                    String Host = "commodity";
                    //上传到OSS
                    String uploadUrl = AliyunOSSUtil.upload(newFile, Host);
                    newFile.delete();
                    return uploadUrl;
                }

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "upload";
    }

    @ApiOperation(value = "安全隐患图片上传" , notes = "")
    @PostMapping("/RiskshowUpload")
    public String RiskshowUpload(MultipartFile file) {

        try {

            if (null != file) {
                String filename = file.getOriginalFilename();
                if (!"".equals(filename.trim())) {
                    File newFile = new File(filename);
                    FileOutputStream os = new FileOutputStream(newFile);
                    os.write(file.getBytes());
                    os.close();
                    file.transferTo(newFile);
                    String Host = "report";
                    //上传到OSS
                    String uploadUrl = AliyunOSSUtil.upload(newFile, Host);
                    newFile.delete();
                    return uploadUrl;
                }

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "upload";
    }

    @ApiOperation(value = "质量隐患图片上传" , notes = "")
    @PostMapping("/QualityshowUpload")
    public String QualityshowUpload(MultipartFile file) {

        try {

            if (null != file) {
                String filename = file.getOriginalFilename();
                if (!"".equals(filename.trim())) {
                    File newFile = new File(filename);
                    FileOutputStream os = new FileOutputStream(newFile);
                    os.write(file.getBytes());
                    os.close();
                    file.transferTo(newFile);
                    String Host = "quality";
                    //上传到OSS
                    String uploadUrl = AliyunOSSUtil.upload(newFile, Host);
                    newFile.delete();
                    return uploadUrl;
                }

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "upload";
    }

    @ApiOperation(value = "培训视频上传" , notes = "")
    @PostMapping("/VideoUpload")
    public String VideoUpload(MultipartFile file) {

        try {

            if (null != file) {
                String filename = file.getOriginalFilename();
                if (!"".equals(filename.trim())) {
                    File newFile = new File(filename);
                    FileOutputStream os = new FileOutputStream(newFile);
                    os.write(file.getBytes());
                    os.close();
                    file.transferTo(newFile);
                    String Host = "video";
                    //上传到OSS
                    String uploadUrl = AliyunOSSUtil.upload(newFile, Host);
                    newFile.delete();
                    return uploadUrl;
                }

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "upload";
    }

    @ApiOperation(value = "PDF上传" , notes = "")
    @PostMapping("/PDFUpload")
    public String PDFUpload(MultipartFile file) {

        try {

            if (null != file) {
                String filename = file.getOriginalFilename();
                if (!"".equals(filename.trim())) {
                    File newFile = new File(filename);
                    FileOutputStream os = new FileOutputStream(newFile);
                    os.write(file.getBytes());
                    os.close();
                    file.transferTo(newFile);
                    String Host = "pdf";
                    //上传到OSS
                    String uploadUrl = AliyunOSSUtil.upload(newFile, Host);
                    newFile.delete();
                    return uploadUrl;
                }

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "upload";
    }
}