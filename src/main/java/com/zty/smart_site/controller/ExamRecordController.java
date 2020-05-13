package com.zty.smart_site.controller;

import com.zty.smart_site.entity.ExamRecord;
import com.zty.smart_site.entity.JsonResult;
import com.zty.smart_site.service.ExamRecordService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Api(description = "考试记录接口")
@RestController
@RequestMapping("examRecord")
@CrossOrigin
public class ExamRecordController {
    @Autowired
    private ExamRecordService examRecordService;

    @ApiOperation(value = "增加考试记录" , notes = "传参:exam_id,staff_id,section_id")
    @PostMapping("/InsertExamRecord")
    public JsonResult InsertExamRecord(@RequestBody Map map) throws ParseException {
        JsonResult jsonResult = new JsonResult();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date now = new Date();
        String time = format.format(now);
        Date date = format.parse(time);
        //日期转时间戳（毫秒）
        long times = date.getTime();
        System.out.print("Format To times:" + times);
        map.put("exam_time" , time);
        map.put("exam_timeC" , times);
        int f = (int) map.get("exam_count");
        if (f >= 60) {
            map.put("exam_result" , "合格");
        } else {
            map.put("exam_result" , "不合格");
        }
        int i = examRecordService.InsertExamRecord(map);
        if (i == 1) {
            jsonResult.setCode(200);
            jsonResult.setData(map);
            jsonResult.setMessage("增加成功!");
            return jsonResult;
        } else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("增加失败!");
            return jsonResult;
        }
    }

    @ApiOperation(value = "查询个人隐患记录" , notes = "传参:staff_id(员工id)")
    @PostMapping("/FindExamRecordByStaffId")
    public JsonResult FindExamRecordByStaffId(@RequestBody Map map) {
        JsonResult jsonResult = new JsonResult();
        jsonResult.setData(examRecordService.FindExamRecordByStaffId(map));
        return jsonResult;
    }
}
