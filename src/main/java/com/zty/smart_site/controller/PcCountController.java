package com.zty.smart_site.controller;

import com.zty.smart_site.entity.Questions;
import com.zty.smart_site.entity.Riskshow;
import com.zty.smart_site.entity.Staff;
import com.zty.smart_site.service.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Api(description = "PC端统计图数据接口")
@RestController
@RequestMapping("count_PC")
@CrossOrigin
public class PcCountController {
    @Autowired
    private StaffService staffService;

    @Autowired
    private RiskshowService riskshowService;

    @Autowired
    private QuestionsService questionsService;

    @Autowired
    private ExaminationService examinationService;

    @Autowired
    private TrainService trainService;

    @Autowired
    private TrainCommonalityService trainCommonalityService;

    @Autowired
    private ExamRecordService examRecordService;

    @ApiOperation(value = "根据工种分布统计人数(选择站点)" , notes = "测试数据:{\"section_id\":1,\"station_id\":1}")
    @PostMapping("/CountByWorktype")
    public List<Staff> CountByWorktype(@RequestBody Map map) {
        return staffService.CountByWorktype(map);
    }

    @ApiOperation(value = "根据分包单位分布统计人数(选择站点)" , notes = "测试数据:{\"section_id\":1,\"station_id\":1}")
    @PostMapping("/CountBySub")
    public List<Staff> CountBySub(@RequestBody Map map) {
        return staffService.CountBySub(map);
    }

    @ApiOperation(value = "根据人员类型分组统计人数(选择站点)" , notes = "测试数据:{\"section_id\":1,\"station_id\":1}")
    @PostMapping("/CountByType")
    public List<Staff> CountByType(@RequestBody Map map) {
        return staffService.CountByType(map);
    }

    @ApiOperation(value = "根据地区分组统计人数(选择站点)" , notes = "测试数据:{\"section_id\":1,\"station_id\":1}")
    @PostMapping("/CountByStaffProvince")
    public List<Staff> CountByStaffProvince(@RequestBody Map map) {
        return staffService.CountByStaffProvince(map);
    }

    @ApiOperation(value = "根据民族分组统计人数(选择站点)" , notes = "测试数据:{\"section_id\":1,\"station_id\":1}")
    @PostMapping("/CountByStaffNation")
    public List<Staff> CountByStaffNation(@RequestBody Map map) {
        return staffService.CountByStaffNation(map);
    }

    @ApiOperation(value = "根据性别分组统计人数(选择站点)" , notes = "测试数据:{\"section_id\":1,\"station_id\":1}")
    @PostMapping("/CountByStaffSex")
    public List<Staff> CountByStaffSex(@RequestBody Map map) {
        return staffService.CountByStaffSex(map);
    }

    @ApiOperation(value = "按照年龄端分组查询(选择站点)" , notes = "测试数据:{\"section_id\":1,\"station_id\":1}")
    @PostMapping("/CountByStaffAge")
    public List<Staff> CountByStaffAge(@RequestBody Map map) {
        return staffService.CountByStaffAge(map);
    }

    @ApiOperation(value = "劳务人员总数" , notes = "测试数据:{\"section_id\":1}")
    @PostMapping("/CountByTypeLW")
    public List<Staff> CountByTypeLW(@RequestBody Map map) {
        return staffService.CountByTypeLW(map);
    }

    @ApiOperation(value = "管理人员总数" , notes = "测试数据:{\"section_id\":1}")
    @PostMapping("/CountByTypeGL")
    public List<Staff> CountByTypeGL(@RequestBody Map map) {
        return staffService.CountByTypeGL(map);
    }

    @ApiOperation(value = "统计安全隐患总数" , notes = "测试数据:section_id(标段id,登录返回),station_id(站点id,下拉框选择)")
    @PostMapping("/CountRiskShow")
    public int CountRiskShow(@RequestBody Map map) {
        return riskshowService.CountRiskShow(map);
    }

    @ApiOperation(value = "安全隐患整改率" , notes = "测试数据:section_id(标段id,登录返回),station_id(站点id,下拉框选择)")
    @PostMapping("/CountRiskShowByZGL")
    public double CountRiskShowByZGL(@RequestBody Map map) {
        double i = riskshowService.CountRiskShowByYZG(map);
        double l = riskshowService.CountRiskShow(map);

        double t = (i / l) * 100;
        return t;
    }

    @ApiOperation(value = "统计安全隐患数量_已整改" , notes = "测试数据:section_id(标段id,登录返回),station_id(站点id,下拉框选择)")
    @PostMapping("/CountRiskShowByYZG")
    public int CountRiskShowByYZG(@RequestBody Map map) {
        return riskshowService.CountRiskShowByYZG(map);
    }

    @ApiOperation(value = "统计安全隐患数量_未整改" , notes = "测试数据:section_id(标段id,登录返回),station_id(站点id,下拉框选择)")
    @PostMapping("/CountRiskShowByWZG")
    public int CountRiskShowByWZG(@RequestBody Map map) {
        return riskshowService.CountRiskShowByWZG(map);
    }

    @ApiOperation(value = "统计安全隐患数量_超期未整改" , notes = "测试数据:section_id(标段id,登录返回),station_id(站点id,下拉框选择)")
    @PostMapping("/CountRiskShowByCQWZG")
    public int CountRiskShowByCQWZG(@RequestBody Map map) {
        return riskshowService.CountRiskShowByCQWZG(map);
    }

    @ApiOperation(value = "积分前三" , notes = "测试数据:{\"section_id\":1}")
    @PostMapping("/find_riskshow_awarda")
    public List<Riskshow> find_riskshow_awarda(@RequestBody Map map) {
        return riskshowService.find_riskshow_awarda(map);
    }

    @ApiOperation(value = "试题总数" , notes = "测试数据:{\"section_id\":2}")
    @PostMapping("/CountST")
    public int CountST(@RequestBody Map map) {
        return questionsService.CountAll(map);
    }

    @ApiOperation(value = "试卷总数" , notes = "测试数据:{\"section_id\":2}")
    @PostMapping("/CountSJ")
    public int CountSJ(@RequestBody Map map) {
        return examinationService.CountAll(map);
    }

    @ApiOperation(value = "学员总数" , notes = "测试数据:{\"section_id\":2}")
    @PostMapping("/CountXY")
    public int CountXY(@RequestBody Map map) {
        return staffService.CountAll(map);
    }

    @ApiOperation(value = "培训课程总数" , notes = "测试数据:{\"section_id\":2}")
    @PostMapping("/CountPXKC")
    public int CountPXKC(@RequestBody Map map) {
        return trainService.CountAll(map);
    }

    @ApiOperation(value = "公共课程总数" , notes = "")
    @PostMapping("/CountGGKC")
    public int CountGGKC() {
        return trainCommonalityService.CountAll();
    }

    @ApiOperation(value = "考试合格率" , notes = "测试数据:{\"section_id\":2}")
    @PostMapping("/CountKSHGL")
    public Double CountKSHGL(@RequestBody Map map) {
        double i = examRecordService.CountT(map);
        double l = examRecordService.CountAll(map);
        double s = (i / l) * 100;
        return s;
    }

    @ApiOperation(value = "专业知识分布" , notes = "测试数据:{\"section_id\":2}")
    @PostMapping("/CountByKnowledge")
    public List<Questions> CountByKnowledge(@RequestBody Map map) {
        return questionsService.CountByKnowledge(map);
    }

    @ApiOperation(value = "专业知识分布" , notes = "测试数据:{\"section_id\":2}")
    @PostMapping("/CountBySpecialty")
    public List<Questions> CountBySpecialty(@RequestBody Map map) {
        return questionsService.CountBySpecialty(map);
    }
}
