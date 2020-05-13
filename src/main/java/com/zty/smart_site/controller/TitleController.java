package com.zty.smart_site.controller;

import com.zty.smart_site.entity.JsonResult;
import com.zty.smart_site.entity.Title;
import com.zty.smart_site.service.PositionTitleService;
import com.zty.smart_site.service.TitleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Api(description = "图标接口")
@RestController
@RequestMapping("title")
@CrossOrigin
public class TitleController {
    @Autowired
    private PositionTitleService positionTitleService;//菜单图标

    @Autowired
    private TitleService titleService;//图标

    @ApiOperation(value = "对应图标" , notes = "测试数据:{\"position_id\":1}")
    @PostMapping("/FindById")
    public JsonResult FindByPositionId(@RequestBody Map map) {
        JsonResult jsonResult = new JsonResult();
        List<Long> longs = positionTitleService.FindByPositionId(map);
        List list = new ArrayList();
        for (Long l : longs) {
            Title title = titleService.FindById(l);
            list.add(title);
            System.out.println(title);
        }
        System.out.println(list);
        jsonResult.setData(list);
        jsonResult.setCode(200);
        return jsonResult;

    }
}
