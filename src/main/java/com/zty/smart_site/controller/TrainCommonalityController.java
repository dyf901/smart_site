package com.zty.smart_site.controller;

import com.zty.smart_site.entity.TrainCommonality;
import com.zty.smart_site.page.Page;
import com.zty.smart_site.service.TrainCommonalityService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Api(description = "公共课程接口")
@RestController
@RequestMapping("traincommonality")
@CrossOrigin
public class TrainCommonalityController {
    @Autowired
    private TrainCommonalityService trainCommonalityService;//公共课程

    @ApiOperation(value = "增加工程课程" , notes = "")
    @PostMapping("/InsertTrainCommonality")
    public boolean InsertTrainCommonality(@RequestBody Map map) {
        return trainCommonalityService.InsertTrainCommonality(map) == 1;
    }

    @ApiOperation(value = "删除公共课程" , notes = "")
    @PostMapping("/DeleteTrainCommonality")
    public boolean DeleteTrainCommonality(@RequestBody Map map) {
        return trainCommonalityService.DeleteTrainCommonality(map) == 1;
    }

    @ApiOperation(value = "修改公共课程" , notes = "")
    @PostMapping("/UpdateTrainCommonality")
    public boolean UpdateTrainCommonality(@RequestBody Map map) {
        return trainCommonalityService.DeleteTrainCommonality(map) == 1;
    }

    @ApiOperation(value = "分页模糊查询公共课程" , notes = "")
    @PostMapping("/FindTrainCommonality")
    public Page<TrainCommonality> FindTrainCommonality(@RequestBody Map map) {
        Page<TrainCommonality> page = new Page<TrainCommonality>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(trainCommonalityService.Total(map));
        page.setItems(trainCommonalityService.FindTrainCommonality(map));
        return page;
    }
}
