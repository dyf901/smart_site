package com.zty.smart_site.controller;

import com.zty.smart_site.entity.JsonResult;
import com.zty.smart_site.service.StaffService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Api(description = "App端统计图数据接口")
@RestController
@RequestMapping("count_App")
@CrossOrigin
public class AppCountController {
    @Autowired
    private StaffService staffService;//人员

    @ApiOperation(value = "人员管理",notes = "测试数据:{\"section_id\":1,\"station_id\":1}")
    @PostMapping("/PersonCount")
    private JsonResult PersonCount(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        jsonResult.setData(staffService.CountByWorktype(map));
        jsonResult.setData2(staffService.CountBySub(map));
        jsonResult.setData3(staffService.CountByType(map));
        jsonResult.setData4(staffService.CountAll(map));
        return jsonResult;
    }
}
