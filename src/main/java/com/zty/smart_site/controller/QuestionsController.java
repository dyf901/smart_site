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

import java.util.Arrays;
import java.util.Map;
import java.util.jar.JarEntry;

@Api(description = "题目接口")
@RestController
@RequestMapping("questions")
@CrossOrigin
public class QuestionsController {
    @Autowired
    private QuestionsService questionsService;

    @ApiOperation(value = "增加题目" , notes = "传参:`section_id`(标段id), `knowledge_id`(下拉框返回), `specialty_id`(下拉框返回), `questions_type`(题目类型), `questions_content`(题目内容), `select_A`(选择题选项), `select_B`, `select_C`, `select_D`, `select_answer`(选择题答案), `judge_answer`(判断题答案), `gap_answer1`(填空题答案), `short_answer`(简答题答案)")
    @PostMapping("/InsertQuestions")
    public boolean InsertQuestions(@RequestBody Map map) {
        System.out.println("map:" + map);
//        String gap_answer = (String) map.get("gap_answer1");
//        String short_answer = (String) map.get("short_answer1");
//        map.put("gap_answer",gap_answer);
//        map.put("short_answer",short_answer);
        String str = (String) map.get("gap_answer1");
        String[] arr = str.split(","); // 用,分割
        System.out.println("arr" + Arrays.toString(arr)); // [0, 1, 2, 3, 4, 5]
        map.put("gap_answer" , Arrays.toString(arr));

        String strs = (String) map.get("short_answer1");
        String[] arrs = strs.split(","); // 用,分割
        System.out.println("arrs" + Arrays.toString(arrs)); // [0, 1, 2, 3, 4, 5]
        map.put("short_answer" , Arrays.toString(arrs));
        return questionsService.InsertQuestions(map) == 1;
    }

    @ApiOperation(value = "删除题目" , notes = "传参:id(题目id)")
    @PostMapping("/DeleteQuestions")
    public boolean DeleteQuestions(@RequestBody Map map) {
        return questionsService.DeleteQuestions(map) == 1;
    }

    @ApiOperation(value = "修改题目" , notes = "测试数据:")
    @PostMapping("/UpdateQuestions")
    public boolean UpdateQuestions(@RequestBody Map map) {
        return questionsService.UpdateQuestions(map) == 1;
    }

    @ApiOperation(value = "分页模糊查询题目" , notes = "测试数据:{\"pageNo\":1,\"pageSize\":10,\"section_id\":2}")
    @PostMapping("/FindQuestions")
    public Page<Questions> FindQuestions(@RequestBody Map map) {
        Page<Questions> page = new Page<Questions>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(questionsService.Total(map));
        page.setItems(questionsService.FindQuestions(map));
        return page;
    }

    @ApiOperation(value = "根据id查询题目" , notes = "")
    @PostMapping("/FindQuestionsById")
    public JsonResult FindQuestionsById(@RequestBody Map map) {
        JsonResult jsonResult = new JsonResult();
        jsonResult.setData(questionsService.FindQuestionsById(map));
        return jsonResult;
    }
}
