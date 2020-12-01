package com.zty.smart_site.controller;

import com.zty.smart_site.service.EnvironmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimedTask {
    @Autowired
    private EnvironmentService environmentService;

    //每分钟启动
    @Scheduled(cron = "0 0 2 * * ?")
    //cron = "0 0 0 */1 * ?"每天零时启动
    //0 0 6 * * ? 每天早上六点执行
    public void timerToNow() {
        environmentService.DeleteEnvironment();
    }
}
