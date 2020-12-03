package com.zty.smart_site.controller;

import com.zty.smart_site.entity.JsonResult;
import com.zty.smart_site.entity.TrainContentRecord;
import com.zty.smart_site.page.Page;
import com.zty.smart_site.service.TrainContentRecordService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@Api(description = "展馆培训记录接口")
@RestController
@RequestMapping("TrainContentRecord")
@CrossOrigin
public class TrainContentRecordController {
    @Autowired
    private TrainContentRecordService trainContentRecordService;

    @ApiOperation(value = "增加展馆培训记录",notes = "")
    @PostMapping("/InsertTrainContentRecord")
    public JsonResult InsertTrainContentRecord(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        String time = format.format(now);
        map.put("uptime", time);
        int i = trainContentRecordService.InsertTrainContentRecord(map);
        if(i==1){
            jsonResult.setCode(200);
            jsonResult.setMessage("增加成功!");
        }else{
            jsonResult.setCode(20006);
            jsonResult.setMessage("增加失败!");
        }
        return jsonResult;
    }

    @ApiOperation(value = "删除展馆培训记录",notes = "")
    @PostMapping("/DeleteTrainContentRecord")
    public JsonResult DeleteTrainContentRecord(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        int i = trainContentRecordService.DeleteTrainContentRecord(map);
        if(i==1){
            jsonResult.setCode(200);
            jsonResult.setMessage("删除成功!");
        }else{
            jsonResult.setCode(20006);
            jsonResult.setMessage("删除失败!");
        }
        return jsonResult;
    }

    @ApiOperation(value = "修改展馆培训记录",notes = "")
    @PostMapping("/UpdateTrainContentRecord")
    public JsonResult UpdateTrainContentRecord(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        int i = trainContentRecordService.UpdateTrainContentRecord(map);
        if(i==1){
            jsonResult.setCode(200);
            jsonResult.setMessage("修改成功!");
        }else{
            jsonResult.setCode(20006);
            jsonResult.setMessage("修改失败!");
        }
        return jsonResult;
    }

    @ApiOperation(value = "分页模糊查询展馆培训记录",notes = "")
    @PostMapping("/FindTrainContentRecord")
    public Page<TrainContentRecord> FindTrainContentRecord(@RequestBody Map map){
        Page<TrainContentRecord> page = new Page<TrainContentRecord>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setItems(trainContentRecordService.FindTrainContentRecord(map));
        page.setTotal(trainContentRecordService.Total(map));
        return page;
    }
}
