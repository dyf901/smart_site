package com.zty.smart_site.controller;

import com.zty.smart_site.entity.Exam;
import com.zty.smart_site.entity.JsonResult;
import com.zty.smart_site.page.Page;
import com.zty.smart_site.service.ExamService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@Api(description = "考试接口")
@RestController
@RequestMapping("exam")
@CrossOrigin
public class ExamController {
    @Autowired
    private ExamService examService;

    @ApiOperation(value = "增加考试" , notes = "测试数据:{\"exam_name\":\"基础考试\",\"section_id\":2,\"specialty_id\":1,\"examination_id\":3,\"worktype_id\":2,\"exam_time\":45,\"start_time\":\"2020-04-01\",\"end_time\":\"2020-05-01\"}")
    @PostMapping("/InsertExam")
    public boolean InsertExam(@RequestBody Map map) throws ParseException {
        //`exam_name`, `section_id`, `specialty_id`, `examination_id`, `worktype_id`, `exam_time`,
        // `start_time`, `end_time`, `up_time` ,`start_timeC` ,`end_timeC`
        String start_time = (String) map.get("start_time");
        String end_time = (String) map.get("end_time");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date now = new Date();
        Date date = format.parse(start_time);
        Date date1 = format.parse(end_time);
        //日期转时间戳（毫秒）
        long times = date.getTime();
        long times1 = date1.getTime();
        map.put("start_timeC" , times);
        map.put("end_timeC" , times1);
        return examService.InsertExam(map) == 1;
    }

    @ApiOperation(value = "删除考试" , notes = "测试数据:")
    @PostMapping("/DeleteExam")
    public boolean DeleteExam(@RequestBody Map map) {
        return examService.DeleteExam(map) == 1;
    }

    @ApiOperation(value = "修改考试" , notes = "测试数据:")
    @PostMapping("/UpdateExam")
    public boolean UpdateExam(@RequestBody Map map) {
        return examService.UpdateExam(map) == 1;
    }

    @ApiOperation(value = "分页查询考试" , notes = "传参:pageNo,pageSize,section_id")
    @PostMapping("/FindExam")
    public Page<Exam> FindExam(@RequestBody Map map) {
        Page<Exam> page = new Page<Exam>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(examService.Total(map));
        page.setItems(examService.FindExam(map));
        return page;
    }

    @ApiOperation(value = "查询最新考试App" , notes = "传参:section_id")
    @PostMapping("/FindExamNew")
    public JsonResult FindExamNew(@RequestBody Map map) {
        JsonResult jsonResult = new JsonResult();
        jsonResult.setData(examService.FindExamNew(map));
        return jsonResult;
    }

    @ApiOperation(value = "查询最新考试_公众号" , notes = "传参:section_id,worktype_id")
    @PostMapping("/FindExamNewG")
    public Exam FindExamNewG(@RequestBody Map map) {
        return examService.FindExamNewG(map);
    }
}
