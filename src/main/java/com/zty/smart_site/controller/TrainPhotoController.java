package com.zty.smart_site.controller;

import com.zty.smart_site.entity.JsonResult;
import com.zty.smart_site.entity.TrainPhoto;
import com.zty.smart_site.page.Page;
import com.zty.smart_site.service.TrainPhotoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Api(description = "培训相册接口")
@RestController
@RequestMapping("TrainPhoto")
@CrossOrigin
public class TrainPhotoController {
    @Autowired
    private TrainPhotoService trainPhotoService;

    @ApiOperation(value = "增加培训相册",notes = "")
    @PostMapping("/InsertTrainPhoto")
    public JsonResult InsertTrainPhoto(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();

        int i =trainPhotoService.InsertTrainPhoto(map);
        if (i==1){
            jsonResult.setCode(200);
            jsonResult.setMessage("增加成功!");
        }else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("增加失败!");
        }
        return jsonResult;
    }

    @ApiOperation(value = "删除培训相册",notes = "")
    @PostMapping("/DeleteTrainPhoto")
    public JsonResult DeleteTrainPhoto(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        int i =trainPhotoService.DeleteTrainPhoto(map);
        if (i==1){
            jsonResult.setCode(200);
            jsonResult.setMessage("删除成功!");
        }else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("删除失败!");
        }
        return jsonResult;
    }


    @ApiOperation(value = "修改培训相册",notes = "")
    @PostMapping("/UpdateTrainPhoto")
    public JsonResult UpdateTrainPhoto(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        System.out.println("map:"+map);
        int i =trainPhotoService.UpdateTrainPhoto(map);
        if (i==1){
            jsonResult.setCode(200);
            jsonResult.setMessage("修改成功!");
        }else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("修改失败!");
        }
        return jsonResult;
    }

    @ApiOperation(value = "分页查询培训相册",notes = "")
    @PostMapping("/FindTrainPhoto")
    public Page FindTrainPhoto(@RequestBody Map map){
        Page page = new Page();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(trainPhotoService.Total(map));
        page.setItems(trainPhotoService.FindTrainPhoto(map));
        return page;
    }

    @ApiOperation(value = "大屏_培训相册",notes = "")
    @PostMapping("/SelectTrainPhoto")
    public List<TrainPhoto> SelectTrainPhoto(@RequestBody Map map){
        return trainPhotoService.SelectTrainPhoto(map);
    }

    @ApiOperation(value = "根据id查询培训相册信息",notes = "")
    @PostMapping("/FindTrainPhotoById")
    public TrainPhoto FindTrainPhotoById(@RequestBody Map map){
        return trainPhotoService.FindTrainPhotoById(map);
    }
}
