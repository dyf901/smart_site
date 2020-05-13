package com.zty.smart_site.controller;

import com.zty.smart_site.entity.TrainType;
import com.zty.smart_site.page.Page;
import com.zty.smart_site.service.TrainTypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Api(description = "培训类型接口")
@RestController
@RequestMapping("traintype")
@CrossOrigin
public class TrainTypeController {
    @Autowired
    private TrainTypeService trainTypeService;

    @ApiOperation(value = "增加培训类型" , notes = "传参:")
    @PostMapping("/InsertTrainType")
    public boolean InsertTrainType(@RequestBody Map map) {
        return trainTypeService.InsertTrainType(map) == 1;
    }

    @ApiOperation(value = "删除培训类型" , notes = "传参:")
    @PostMapping("/DeleteTrainType")
    public boolean DeleteTrainType(@RequestBody Map map) {
        return trainTypeService.DeleteTrainType(map) == 1;
    }

    @ApiOperation(value = "修改培训类型" , notes = "传参:")
    @PostMapping("/UpdateTrainType")
    public boolean UpdateTrainType(@RequestBody Map map) {
        return trainTypeService.UpdateTrainType(map) == 1;
    }

    @ApiOperation(value = "分页模糊查询培训类型" , notes = "")
    @PostMapping("/FindTrainType")
    public Page<TrainType> FindTrainType(@RequestBody Map map) {
        Page<TrainType> page = new Page<TrainType>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(trainTypeService.Total(map));
        page.setItems(trainTypeService.FindTrainType(map));
        return page;
    }

    @ApiOperation(value = "下拉框查询培训类型" , notes = "")
    @PostMapping("/SelectTrainType")
    public List<TrainType> SelectTrainType(@RequestBody Map map) {
        return trainTypeService.SelectTrainType(map);
    }
}
