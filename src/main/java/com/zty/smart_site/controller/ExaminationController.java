package com.zty.smart_site.controller;

import com.zty.smart_site.entity.Examination;
import com.zty.smart_site.entity.JsonResult;
import com.zty.smart_site.page.Page;
import com.zty.smart_site.service.ExaminationService;
import com.zty.smart_site.service.QuestionsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static com.google.common.primitives.Ints.concat;

@Api(description = "试卷接口")
@RestController
@RequestMapping("examination")
@CrossOrigin
public class ExaminationController {
    @Autowired
    private ExaminationService examinationService;

    @Autowired
    private QuestionsService questionsService;

    @ApiOperation(value = "增加试卷" , notes = "测试数据:{\"countX\":5,\"countP\":5,\"countT\":5,\"countJ\":2,\"section_id\":2,\"specialty_id\":1,\"examination_name\":\"考核\",\"select_count\":6,\"judge_count\":5,\"gap_count\":5,\"short_count\":10,\"exam_time\":45}")
    @PostMapping("/InsertExamination")
    public boolean InsertExamination(@RequestBody Map map) {
        System.out.println("map" + map);//控制台输出传参

        int[] select = questionsService.FindQuestionByQuestionTypeX(map);//拿到选择题数组
        System.out.println("select:" + Arrays.toString(select));

        int[] judge = questionsService.FindQuestionByQuestionTypeP(map);//判断题数组
        System.out.println("judge:" + Arrays.toString(judge));

        int[] gap = questionsService.FindQuestionByQuestionTypeT(map);//填空题数组
        System.out.println("gap:" + Arrays.toString(gap));

        int[] sh = questionsService.FindQuestionByQuestionTypeJ(map);//简答题数组
        System.out.println("sh:" + Arrays.toString(sh));

        int[] all = concat(select, judge, gap, sh);
        System.out.println("all:" + Arrays.toString(all));
        String questions = Arrays.toString(all);

        map.put("questions" , questions);

        return examinationService.InsertExamination(map) == 1;
        //return true;
    }

    @ApiOperation(value = "删除试卷" , notes = "测试数据:")
    @PostMapping("/DeleteExamination")
    public boolean DeleteExamination(@RequestBody Map map) {
        return examinationService.DeleteExamination(map) == 1;
    }

    @ApiOperation(value = "分页查询试卷" , notes = "测试数据:")
    @PostMapping("/FindExamination")
    public Page<Examination> FindExamination(@RequestBody Map map) {
        System.out.println("传参:" + map);
        System.out.println("查找到的数据:" + examinationService.FindExamination(map));
        System.out.println("总条数:" + examinationService.Total(map));
        Page<Examination> page = new Page<>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(examinationService.Total(map));
        page.setItems(examinationService.FindExamination(map));
        return page;
    }

    @ApiOperation(value = "根据id查询试卷" , notes = "传参:examination_id")
    @PostMapping("/FindExaminationById")
    public JsonResult FindExaminationById(@RequestBody Map map) {
        JsonResult jsonResult = new JsonResult();
        jsonResult.setData(examinationService.FindExaminationById(map));
        return jsonResult;
    }

    @ApiOperation(value = "下拉框查询试卷" , notes = "传参:标段id")
    @PostMapping("/SelectExamination")
    public List<Examination> SelectExamination(@RequestBody Map map) {
        return examinationService.SelectExamination(map);
    }
}
