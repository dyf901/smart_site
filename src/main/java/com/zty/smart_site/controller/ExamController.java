package com.zty.smart_site.controller;

import com.zty.smart_site.entity.Exam;
import com.zty.smart_site.entity.JsonResult;
import com.zty.smart_site.page.Page;
import com.zty.smart_site.service.ExamService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Api(description = "考试接口")
@RestController
@RequestMapping("exam")
@CrossOrigin
public class ExamController {
    @Autowired
    private ExamService examService;

    @ApiOperation(value = "增加考试",notes = "测试数据:")
    @PostMapping("/InsertExam")
    public boolean InsertExam(@RequestBody Map map){
        return examService.InsertExam(map)==1;
    }

    @ApiOperation(value = "删除考试",notes = "测试数据:")
    @PostMapping("/DeleteExam")
    public boolean DeleteExam(@RequestBody Map map){
        return examService.DeleteExam(map)==1;
    }

    @ApiOperation(value = "修改考试",notes = "测试数据:")
    @PostMapping("/UpdateExam")
    public boolean UpdateExam(@RequestBody Map map){
        return examService.UpdateExam(map)==1;
    }

    @ApiOperation(value = "分页查询考试",notes = "传参:pageNo,pageSize,section_id")
    @PostMapping("/FindExam")
    public Page<Exam> FindExam(@RequestBody Map map){
        Page<Exam> page = new Page<Exam>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(examService.Total(map));
        page.setItems(examService.FindExam(map));
        return page;
    }

    @ApiOperation(value = "查询最新考试App",notes = "传参:section_id")
    @PostMapping("/FindExamNew")
    public JsonResult FindExamNew(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        jsonResult.setData(examService.FindExamNew(map));
        return jsonResult;
    }

    @ApiOperation(value = "查询最新考试_公众号",notes = "传参:section_id,worktype_id")
    @PostMapping("/FindExamNewG")
    public Exam FindExamNewG(@RequestBody Map map){
        return examService.FindExamNewG(map);
    }
}
