package com.zty.smart_site.controller;

import com.zty.smart_site.entity.Examination;
import com.zty.smart_site.entity.JsonResult;
import com.zty.smart_site.page.Page;
import com.zty.smart_site.service.ExaminationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Api(description = "试卷接口")
@RestController
@RequestMapping("examination")
@CrossOrigin
public class ExaminationController {
    @Autowired
    private ExaminationService examinationService;

    @ApiOperation(value = "增加试卷",notes = "测试数据:")
    @PostMapping("/InsertExamination")
    public boolean InsertExamination(@RequestBody Map map){
        return examinationService.InsertExamination(map)==1;
    }

    @ApiOperation(value = "删除试卷",notes = "测试数据:")
    @PostMapping("/DeleteExamination")
    public boolean DeleteExamination(@RequestBody Map map){
        return examinationService.DeleteExamination(map)==1;
    }

    @ApiOperation(value = "分页查询试卷",notes = "测试数据:")
    @PostMapping("/FindExamination")
    public Page<Examination> FindExamination(@RequestBody Map map){
        System.out.println(map);
        System.out.println(examinationService.FindExamination(map));
        System.out.println(examinationService.Total(map));
        Page<Examination> page = new Page<>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(examinationService.Total(map));
        page.setItems(examinationService.FindExamination(map));
        return page;
    }

    @ApiOperation(value = "根据id查询试卷",notes = "传参:examination_id")
    @PostMapping("/FindExaminationById")
    public JsonResult FindExaminationById(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        jsonResult.setData(examinationService.FindExaminationById(map));
        return jsonResult;
    }
}
