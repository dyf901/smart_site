package com.zty.smart_site.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@Api(description = "测试")
@RestController
@RequestMapping("test")
@CrossOrigin
public class Test {
    @ApiOperation(value = "测试",notes = "")
    @GetMapping("/test")
    public String Test(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        System.out.println("当前时间：" + sdf.format(now));
        Date afterDate = new Date(now .getTime() + 300000);
        System.out.println(sdf.format(afterDate ));
        return "aaa";
    }
}
