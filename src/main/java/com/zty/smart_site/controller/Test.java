package com.zty.smart_site.controller;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.zty.smart_site.entity.JsonResult;
import com.zty.smart_site.entity.Title;
import com.zty.smart_site.service.PositionService;
import com.zty.smart_site.service.PositionTitleService;
import com.zty.smart_site.service.TitleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Api(description = "测试")
@RestController
@RequestMapping("test")
@CrossOrigin
public class Test {
    @Autowired
    private PositionTitleService positionTitleService;

    @Autowired
    private TitleService titleService;

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

    @ApiOperation(value = "测试",notes = "")
    @PostMapping("/test1")
    public String FindByPositionId(@RequestBody Map map){
        List<Long> longs= positionTitleService.FindByPositionId(map);
        List list =new ArrayList();
        for (Long l:longs){
            Title title = titleService.FindById(l);
            list.add(title);
            System.out.println(title);
            }
            System.out.println(list);
            return "asd";
        }

}
