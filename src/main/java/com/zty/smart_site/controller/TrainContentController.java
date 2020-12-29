package com.zty.smart_site.controller;

import com.zty.smart_site.entity.JsonResult;
import com.zty.smart_site.entity.TrainContent;
import com.zty.smart_site.service.TrainContentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Api(description = "展馆体验接口")
@RestController
@RequestMapping("traincontent")
@CrossOrigin
public class TrainContentController {
    @Autowired
    private TrainContentService trainContentService;

    @ApiOperation(value = "根据id查询培训内容" , notes = "")
    @PostMapping("/FindTrainContent")
    public TrainContent FindTrainContent(@RequestBody Map map) {
        return trainContentService.FindTrainContent(map);
    }

    @ApiOperation(value = "查询全部展馆体验" , notes = "")
    @PostMapping("/FindTrainContentAll")
    public List<TrainContent> FindTrainContentAll(@RequestBody Map map) {
        System.out.println(map);
        return trainContentService.FindTrainContentAll(map);
    }

    @ApiOperation(value = "增加我的展馆培训信息" , notes = "")
    @PostMapping("/InsertTrainContent")
    public JsonResult InsertTrainContent(@RequestBody Map map) {
        JsonResult jsonResult = new JsonResult();
        int i = trainContentService.InsertTrainContent(map);
        if (i==1){
            jsonResult.setCode(200);
            jsonResult.setMessage("增加成功!");
        }else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("增加失败!");
        }
        return jsonResult;
    }

    @ApiOperation(value = "删除我的展馆培训信息" , notes = "")
    @PostMapping("/DeleteTrainContent")
    public JsonResult DeleteTrainContent(@RequestBody Map map) {
        JsonResult jsonResult = new JsonResult();
        int i = trainContentService.DeleteTrainContent(map);
        if (i==1){
            jsonResult.setCode(200);
            jsonResult.setMessage("增加成功!");
        }else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("增加失败!");
        }
        return jsonResult;
    }

    @ApiOperation(value = "修改我的展馆培训信息" , notes = "")
    @PostMapping("/UpdateTrainContent")
    public JsonResult UpdateTrainContent(@RequestBody Map map) {
        JsonResult jsonResult = new JsonResult();
        int i = trainContentService.UpdateTrainContent(map);
        if (i==1){
            jsonResult.setCode(200);
            jsonResult.setMessage("增加成功!");
        }else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("增加失败!");
        }
        return jsonResult;
    }

}
