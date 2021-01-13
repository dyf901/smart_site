package com.zty.smart_site.controller;

import com.zty.smart_site.entity.JsonResult;
import com.zty.smart_site.entity.Milestone;
import com.zty.smart_site.page.Page;
import com.zty.smart_site.service.MilestoneService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Api(description = "里程碑接口")
@RestController
@RequestMapping("Milestone")
@CrossOrigin
public class MilestoneController {
    @Autowired
    private MilestoneService milestoneService;

    @ApiOperation(value = "增加里程碑信息",notes = "")
    @PostMapping("/InsertMilestone")
    public JsonResult InsertMilestone(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        int i =milestoneService.InsertMilestone(map);
        if (i==1){
            jsonResult.setCode(200);
            jsonResult.setMessage("增加成功!");
        }else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("增加失败!");
        }
        return jsonResult;
    }

    @ApiOperation(value = "删除里程碑信息",notes = "")
    @PostMapping("/DeleteMilestone")
    public JsonResult DeleteMilestone(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        int i =milestoneService.DeleteMilestone(map);
        if (i==1){
            jsonResult.setCode(200);
            jsonResult.setMessage("删除成功!");
        }else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("删除失败!");
        }
        return jsonResult;
    }


    @ApiOperation(value = "修改里程碑信息",notes = "")
    @PostMapping("/UpdateMilestone")
    public JsonResult UpdateMilestone(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        int i =milestoneService.UpdateMilestone(map);
        if (i==1){
            jsonResult.setCode(200);
            jsonResult.setMessage("修改成功!");
        }else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("修改失败!");
        }
        return jsonResult;
    }

    @ApiOperation(value = "分页查询里程碑信息",notes = "")
    @PostMapping("/FindMilestone")
    public Page FindMilestone(@RequestBody Map map){
        Page page = new Page();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(milestoneService.Total(map));
        page.setItems(milestoneService.FindMilestone(map));
        return page;
    }

    @ApiOperation(value = "大屏_里程碑信息",notes = "")
    @PostMapping("/SelectMilestone")
    public List<Milestone> SelectMilestone(@RequestBody Map map){
        return milestoneService.SelectMilestone(map);
    }

    @ApiOperation(value = "根据id查询里程碑信息",notes = "")
    @PostMapping("/FindMilestoneById")
    public Milestone FindMilestoneById(@RequestBody Map map){
        return milestoneService.FindMilestoneById(map);
    }
}
