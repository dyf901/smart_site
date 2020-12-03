package com.zty.smart_site.controller;

import com.zty.smart_site.service.EnvironmentService;
import com.zty.smart_site.service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TimedTask {
    @Autowired
    private EnvironmentService environmentService;

    @Autowired
    private PlanService planService;

    //每分钟启动
    @Scheduled(cron = "0 0 2 * * ?")
    //cron = "0 0 0 */1 * ?"每天零时启动
    //0 0 6 * * ? 每天早上六点执行
    public void timerToNow() {
        environmentService.DeleteEnvironment();
    }

    //每天早上一点执行,修改当前日期大于计划开工日期的项目状态
    @Scheduled(cron = "0 0 1 * * ?")
    //cron = "0 0 0 */1 * ?"每天零时启动
    //0 0 6 * * ? 每天早上六点执行
    public void timerToNow1() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        String time = format.format(now);
        Map map = new HashMap();
        map.put("time",time);
        planService.UpdateState(map);
        System.out.println("now time:" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        System.out.println("每天早上一点执行,修改当前日期大于计划开工日期的项目状态已经执行了!");
    }

    //每天早上2点执行,修改状态为1的项目实际天数
    @Scheduled(cron = "0 0 2 * * ?")
    //cron = "0 0 0 */1 * ?"每天零时启动
    //0 0 6 * * ? 每天早上六点执行
    public void timerToNow2() {
        planService.UpdatePracticalDay();
        System.out.println("now time:" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        System.out.println("每天早上2点执行,修改状态为1的项目实际天数已经执行了!");
    }
}
