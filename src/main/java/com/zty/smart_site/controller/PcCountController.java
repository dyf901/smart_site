package com.zty.smart_site.controller;

import com.zty.smart_site.entity.*;
import com.zty.smart_site.service.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
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

    @Autowired
    private PlanService planService;

    @Autowired
    private ValueZService valueZService;

    @Autowired
    private ValueRecordService valueRecordService;

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

    @ApiOperation(value = "人员趋势分布" , notes = "测试数据:{\"section_id\":2}")
    @PostMapping("/StaffQs")
    public List<Value> StaffQs(@RequestBody Map map) {
        return staffService.StaffQs(map);
    }

    @ApiOperation(value = "本月综合隐患分析" , notes = "测试数据:{\"section_id\":2}")
    @PostMapping("/RiskshowByMonth")
    public List<MonthValue> RiskshowByMonth(@RequestBody Map map) {
        return riskshowService.RiskshowByMonth(map);
    }

    @ApiOperation(value = "进度对比",notes = "")
    @PostMapping("/Comparison")
    public List Comparison(@RequestBody Map map){
        List<Plan> plans= planService.Comparison(map);
        List list = new ArrayList();
        for (int i=0;i<plans.size();i++){
            PlanTree planTree = new PlanTree();
            String s=null;
            s="["+plans.get(i).getStart_day()+","+plans.get(i).getEnd_day()+"]";

            String z=null;
            z="["+plans.get(i).getStart_day()+","+(plans.get(i).getStart_day()+plans.get(i).getPractical_day())+"]";

            char[] z1=z.toCharArray();
            char[] s1=s.toCharArray();
            //System.out.println(z1);
            //System.out.println(s1);
            planTree.setId(plans.get(i).getId());
            planTree.setProgress_name(plans.get(i).getProgress_name());
            planTree.setStart_time(plans.get(i).getStart_time());
            planTree.setStart_day(plans.get(i).getStart_day());
            planTree.setEnd_time(plans.get(i).getEnd_time());
            planTree.setEnd_day(plans.get(i).getEnd_day());
            planTree.setDuration(plans.get(i).getDuration());
            planTree.setPractical_day(plans.get(i).getPractical_day());
            planTree.setPractical_time(plans.get(i).getPractical_time());
            planTree.setState(plans.get(i).getState());
            planTree.setJihua(s1);
            planTree.setShiji(z1);
            list.add(planTree);
        }

        return list ;
    }

    @ApiOperation(value = "进度分析", notes = "")
    @PostMapping("/Analyse")
    public List<Plan> Analyse(@RequestBody Map map){
        return planService.Analyse(map);
    }

    @ApiOperation(value = "总产值",notes = "")
    @PostMapping("/FindValue")
    public Double FindValue(@RequestBody Map map){
        ValueZ valueZ = valueZService.FindValue1(map);
        Double d = valueZ.getAltogether();
        return d;
    }

    @ApiOperation(value = "累计产值",notes = "")
    @PostMapping("/SumValue")
    public BigDecimal SumValue(@RequestBody Map map){
        ValueRecord valueRecord =valueRecordService.SumValue(map);
        Double d=valueRecord.getCount();
        BigDecimal a =new BigDecimal(d.toString());
        return a;
    }

    @ApiOperation(value = "产值分析",notes = "")
    @PostMapping("/CountValue")
    public List<ValueRecord> CountValue(@RequestBody Map map){
        return valueRecordService.CountValue(map);
    }

    @ApiOperation(value = "考试人数汇总",notes = "")
    @PostMapping("/CountExamStaff")
    public List<Value> CountExamStaff(@RequestBody Map map){
        return examRecordService.CountExamStaff(map);
    }
}
