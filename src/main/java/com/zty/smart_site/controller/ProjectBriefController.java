package com.zty.smart_site.controller;

import com.zty.smart_site.entity.JsonResult;
import com.zty.smart_site.entity.ProjectBrief;
import com.zty.smart_site.page.Page;
import com.zty.smart_site.service.ProjectBriefService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Api(description = "大屏_项目简介")
@RestController
@RequestMapping("ProjectBrief")
@CrossOrigin
public class ProjectBriefController {
    @Autowired
    private ProjectBriefService projectBriefService;

    @ApiOperation(value = "增加大屏项目简介",notes = "")
    @PostMapping("/InsertProjectBrief")
    public JsonResult InsertProjectBrief(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        int i =projectBriefService.InsertProjectBrief(map);
        if (i==1){
            jsonResult.setCode(200);
            jsonResult.setMessage("增加成功!");
        }else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("增加失败!");
        }
        return jsonResult;
    }

    @ApiOperation(value = "删除大屏项目简介",notes = "")
    @PostMapping("/DeleteProjectBrief")
    public JsonResult DeleteProjectBrief(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        int i =projectBriefService.DeleteProjectBrief(map);
        if (i==1){
            jsonResult.setCode(200);
            jsonResult.setMessage("删除成功!");
        }else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("删除失败!");
        }
        return jsonResult;
    }


    @ApiOperation(value = "修改大屏项目简介",notes = "")
    @PostMapping("/UpdateProjectBrief")
    public JsonResult UpdateProjectBrief(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        int i =projectBriefService.UpdateProjectBrief(map);
        if (i==1){
            jsonResult.setCode(200);
            jsonResult.setMessage("修改成功!");
        }else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("修改失败!");
        }
        return jsonResult;
    }

    @ApiOperation(value = "分页查询大屏项目简介",notes = "")
    @PostMapping("/FindProjectBrief")
    public Page FindProjectBrief(@RequestBody Map map){
        Page page = new Page();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(projectBriefService.Total(map));
        page.setItems(projectBriefService.FindProjectBrief(map));
        return page;
    }

    @ApiOperation(value = "大屏-项目简介",notes = "")
    @PostMapping("/SelectProjectBrief")
    public ProjectBrief SelectProjectBrief(@RequestBody Map map){
        return projectBriefService.SelectProjectBrief(map);
    }
}
