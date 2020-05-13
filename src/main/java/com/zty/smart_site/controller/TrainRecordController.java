package com.zty.smart_site.controller;

import com.zty.smart_site.entity.JsonResult;
import com.zty.smart_site.entity.TrainRecord;
import com.zty.smart_site.page.Page;
import com.zty.smart_site.service.TrainRecordService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Api(description = "展馆培训接口")
@RestController
@RequestMapping("TrainRecord")
@CrossOrigin
public class TrainRecordController {
    @Autowired
    private TrainRecordService trainRecordService;

    @ApiOperation(value = "增加展馆培训内容" , notes = "")
    @PostMapping("/InsertTrainRecord")
    public JsonResult InsertTrainRecord(@RequestBody Map map) {
        JsonResult jsonResult = new JsonResult();
        int i = trainRecordService.InsertTrainRecord(map);
        if (i == 1) {
            jsonResult.setCode(200);
            jsonResult.setMessage("增加成功!");
            return jsonResult;
        } else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("增加失败!");
            return jsonResult;
        }
    }

    @ApiOperation(value = "分页查询展馆培训记录" , notes = "")
    @PostMapping("/FindTrainRecord")
    public Page<TrainRecord> FindTrainRecord(@RequestBody Map map) {
        Page<TrainRecord> page = new Page<TrainRecord>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(trainRecordService.Total(map));
        page.setItems(trainRecordService.FindTrainRecord(map));
        return page;
    }

    @ApiOperation(value = "根据培训名称查询全部培训记录" , notes = "")
    @PostMapping("/FindTrainRecordByTrainName")
    public List<TrainRecord> FindTrainRecordByTrainName(@RequestBody Map map) {
        return trainRecordService.FindTrainRecordByTrainName(map);
    }
}
