package com.zty.smart_site.entity;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConstantProperties implements InitializingBean {

    @Value("${oss.file.endpoint}")
    private String oss_file_endpoint;

    @Value("${oss.file.keyid}")
    private String oss_file_keyid;

    @Value("${oss.file.keysecret}")
    private String oss_file_keysecret;

    @Value("${oss.file.filehost}")
    private String oss_file_filehost;

    @Value("${oss.file.bucketname}")
    private String oss_file_bucketname;

    public static String OSS_END_POINT;
    public static String OSS_ACCESS_KEY_ID;
    public static String OSS_ACCESS_KEY_SECRET;
    public static String OSS_BUCKET_NAME;
    public static String OSS_FILE_HOST;


    @Override
    public void afterPropertiesSet() throws Exception {

        OSS_END_POINT = oss_file_endpoint;
        OSS_ACCESS_KEY_ID = oss_file_keyid;
        OSS_ACCESS_KEY_SECRET = oss_file_keysecret;
        OSS_BUCKET_NAME = oss_file_bucketname;
        OSS_FILE_HOST = oss_file_filehost;

    }
}
