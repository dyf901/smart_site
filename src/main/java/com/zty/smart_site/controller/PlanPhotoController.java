package com.zty.smart_site.controller;

import com.zty.smart_site.entity.JsonResult;
import com.zty.smart_site.entity.PartyNews;
import com.zty.smart_site.entity.PlanPhoto;
import com.zty.smart_site.page.Page;
import com.zty.smart_site.service.PartyNewsService;
import com.zty.smart_site.service.PlanPhotoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Api(description = "智筹管度图片接口")
@RestController
@RequestMapping("PlanPhoto")
@CrossOrigin
public class PlanPhotoController {
    @Autowired
    private PlanPhotoService planPhotoService;

    @ApiOperation(value = "增加智筹管度图片",notes = "")
    @PostMapping("/InsertPlanPhoto")
    public JsonResult InsertPlanPhoto(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        int i =planPhotoService.InsertPlanPhoto(map);
        if (i==1){
            jsonResult.setCode(200);
            jsonResult.setMessage("增加成功!");
        }else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("增加失败!");
        }
        return jsonResult;
    }

    @ApiOperation(value = "删除智筹管度图片",notes = "")
    @PostMapping("/DeletePlanPhoto")
    public JsonResult DeletePlanPhoto(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        int i =planPhotoService.DeletePlanPhoto(map);
        if (i==1){
            jsonResult.setCode(200);
            jsonResult.setMessage("删除成功!");
        }else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("删除失败!");
        }
        return jsonResult;
    }


    @ApiOperation(value = "修改智筹管度图片",notes = "")
    @PostMapping("/UpdatePlanPhoto")
    public JsonResult UpdatePlanPhoto(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        int i =planPhotoService.UpdatePlanPhoto(map);
        if (i==1){
            jsonResult.setCode(200);
            jsonResult.setMessage("修改成功!");
        }else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("修改失败!");
        }
        return jsonResult;
    }

    @ApiOperation(value = "分页查询智筹管度图片",notes = "")
    @PostMapping("/FindPlanPhoto")
    public Page FindPlanPhoto(@RequestBody Map map){
        Page page = new Page();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(planPhotoService.Total(map));
        page.setItems(planPhotoService.FindPlanPhoto(map));
        return page;
    }

    @ApiOperation(value = "大屏_智筹管度",notes = "")
    @PostMapping("/SelectPlanPhoto")
    public PlanPhoto SelectPlanPhoto(@RequestBody Map map){
        return planPhotoService.SelectPlanPhoto(map);
    }
}
