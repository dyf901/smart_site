package com.zty.smart_site.controller;

import com.zty.smart_site.entity.JsonResult;
import com.zty.smart_site.entity.Questions;
import com.zty.smart_site.page.Page;
import com.zty.smart_site.service.QualityshowService;
import com.zty.smart_site.service.QuestionsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.jar.JarEntry;

@Api(description = "试卷题目接口")
@RestController
@RequestMapping("questions")
@CrossOrigin
public class QuestionsController {
    @Autowired
    private QuestionsService questionsService;

    @ApiOperation(value = "增加题目",notes = "测试数据:")
    @PostMapping("/InsertQuestions")
    public boolean InsertQuestions(@RequestBody Map map){
        return questionsService.InsertQuestions(map)==1;
    }

    @ApiOperation(value = "删除题目",notes = "测试数据:")
    @PostMapping("/DeleteQuestions")
    public boolean DeleteQuestions(@RequestBody Map map){
        return questionsService.DeleteQuestions(map)==1;
    }

    @ApiOperation(value = "修改题目",notes = "测试数据:")
    @PostMapping("/UpdateQuestions")
    public boolean UpdateQuestions(@RequestBody Map map){
        return questionsService.UpdateQuestions(map)==1;
    }

    @ApiOperation(value = "分页模糊查询题目",notes = "测试数据:{\"pageNo\":1,\"pageSize\":10,\"section_id\":2}")
    @PostMapping("/FindQuestions")
    public Page<Questions> FindQuestions(@RequestBody Map map){
        Page<Questions> page = new Page<Questions>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(questionsService.Total(map));
        page.setItems(questionsService.FindQuestions(map));
        return page;
    }

    @ApiOperation(value = "根据id查询题目",notes = "")
    @PostMapping("/FindQuestionsById")
    public JsonResult FindQuestionsById(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        jsonResult.setData(questionsService.FindQuestionsById(map));
        return jsonResult;
    }
}
