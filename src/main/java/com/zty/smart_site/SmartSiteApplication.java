package com.zty.smart_site;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages = "com.zty.smart_site")
@MapperScan("com.zty.smart_site.dao")
@EnableScheduling
public class SmartSiteApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmartSiteApplication.class, args);
    }

}
