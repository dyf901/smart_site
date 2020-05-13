package com.zty.smart_site.controller;

import com.zty.smart_site.entity.JsonResult;
import com.zty.smart_site.service.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Api(description = "个人所有信息")
@RestController
@RequestMapping("CodeS")
@CrossOrigin
public class CodeSController {
    @Autowired
    private BehaviorRecordService behaviorRecordService;

    @Autowired
    private ConversionsService conversionsService;

    @Autowired
    private ExamRecordService examRecordService;

    @Autowired
    private QualityshowService qualityshowService;

    @Autowired
    private RiskshowService riskshowService;

    @Autowired
    private StaffService staffService;

    @ApiOperation(value = "查询个人所有信息" , notes = "")
    @PostMapping("/FindALL")
    public JsonResult FindALL(@RequestBody Map map) {
        JsonResult jsonResult = new JsonResult();
        jsonResult.setData(staffService.FindStaffByStaffIdAll(map));
        jsonResult.setData2(behaviorRecordService.FindBehaviorRecordByStaffIdALL(map));
        jsonResult.setData3(examRecordService.FindExamRecordByStaffIdALL(map));
        jsonResult.setData4(riskshowService.FindRiskshowByStaffIdALL(map));
        jsonResult.setData5(qualityshowService.FindQualityshowByStaffIdALL(map));
        return jsonResult;
    }
}
