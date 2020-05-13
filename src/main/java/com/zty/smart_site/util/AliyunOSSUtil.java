package com.zty.smart_site.util;

import com.aliyun.oss.OSSClient;
import com.aliyun.oss.OSSException;
import com.aliyun.oss.model.CannedAccessControlList;
import com.aliyun.oss.model.CreateBucketRequest;
import com.aliyun.oss.model.PutObjectRequest;
import com.aliyun.oss.model.PutObjectResult;
import com.zty.smart_site.entity.ConstantProperties;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class AliyunOSSUtil {

    public static String upload(File file, String Host) {
        /*String endpoint = ConstantProperties.OSS_END_POINT;
        String accessKeyId = ConstantProperties.OSS_ACCESS_KEY_ID;
        String accessKeySecret = ConstantProperties.OSS_ACCESS_KEY_SECRET;
        String bucketName = ConstantProperties.OSS_BUCKET_NAME;
        String fileHost = ConstantProperties.OSS_FILE_HOST;*/

        String endpoint = "http://oss-cn-shanghai.aliyuncs.com";
        //String endpoint = "http://oss-cn-shanghai-internal.aliyuncs.com";
        String accessKeyId = "LTAI4Fjcn7J9c5aCVFTYabqE";
        String accessKeySecret = "EuufkpKHommuLDd6EawJQac8togdPn";
        String bucketName = "jjjt";

        String fileHost = Host;

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String dateStr = format.format(new Date());

        if (null == file) {
            return null;
        }

        OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
        try {
            //容器不存在，就创建
            if (!ossClient.doesBucketExist(bucketName)) {
                ossClient.createBucket(bucketName);
                CreateBucketRequest createBucketRequest = new CreateBucketRequest(bucketName);
                createBucketRequest.setCannedACL(CannedAccessControlList.PublicRead);
                ossClient.createBucket(createBucketRequest);
            }
            //创建文件路径
            //String fileUrl = file.getName();

            String fileUrl = fileHost + "/" + file.getName();
            //上传文件
            PutObjectResult result = ossClient.putObject(new PutObjectRequest(bucketName, fileUrl, file));
            //设置权限 这里是公开读
            ossClient.setBucketAcl(bucketName, CannedAccessControlList.PublicRead);
            if (null != result) {

                return fileUrl;
            }
        } catch (OSSException oe) {

        } finally {
            //关闭
            ossClient.shutdown();
        }
        return null;
    }
}
