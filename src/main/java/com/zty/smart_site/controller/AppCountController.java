package com.zty.smart_site.controller;

import com.zty.smart_site.entity.JsonResult;
import com.zty.smart_site.service.AdminStaffService;
import com.zty.smart_site.service.RiskshowService;
import com.zty.smart_site.service.StaffService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Api(description = "App端统计图数据接口")
@RestController
@RequestMapping("count_App")
@CrossOrigin
public class AppCountController {
    @Autowired
    private StaffService staffService;//劳务人员

    @Autowired
    private AdminStaffService adminStaffService;//管理人员

    @Autowired
    private RiskshowService riskshowService;

    @ApiOperation(value = "人员管理",notes = "测试数据:{\"section_id\":1,\"station_id\":1}")
    @PostMapping("/PersonCount")
    private JsonResult PersonCount(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        jsonResult.setData(staffService.CountByWorktype(map));
        jsonResult.setData2(staffService.CountBySub(map));
        jsonResult.setData3(staffService.CountByType(map));
        jsonResult.setData4(staffService.CountAll(map));
        jsonResult.setData5(adminStaffService.CountAllAdmin(map));
        return jsonResult;
    }

    @ApiOperation(value = "统计安全隐患总数",notes = "测试数据:section_id(标段id,登录返回),station_id(站点id,下拉框选择)")
    @PostMapping("/CountRiskShow")
    public int CountRiskShow(@RequestBody Map map){
        return riskshowService.CountRiskShow(map);
    }

    @ApiOperation(value = "安全隐患整改率",notes = "测试数据:section_id(标段id,登录返回),station_id(站点id,下拉框选择)")
    @PostMapping("/CountRiskShowByZGL")
    public double CountRiskShowByZGL(@RequestBody Map map){
        double i=riskshowService.CountRiskShowByYZG(map);
        double l=riskshowService.CountRiskShow(map);

        double t=(i/l)*100;
        return t;
    }

    @ApiOperation(value = "统计安全隐患数量_已整改",notes = "测试数据:section_id(标段id,登录返回),station_id(站点id,下拉框选择)")
    @PostMapping("/CountRiskShowByYZG")
    public int CountRiskShowByYZG(@RequestBody Map map){
        return riskshowService.CountRiskShowByYZG(map);
    }

    @ApiOperation(value = "统计安全隐患数量_未整改",notes = "测试数据:section_id(标段id,登录返回),station_id(站点id,下拉框选择)")
    @PostMapping("/CountRiskShowByWZG")
    public int CountRiskShowByWZG(@RequestBody Map map){
        return riskshowService.CountRiskShowByWZG(map);
    }

    @ApiOperation(value = "统计安全隐患数量_超期未整改",notes = "测试数据:section_id(标段id,登录返回),station_id(站点id,下拉框选择)")
    @PostMapping("/CountRiskShowByCQWZG")
    public int CountRiskShowByCQWZG(@RequestBody Map map){
        return riskshowService.CountRiskShowByCQWZG(map);
    }
}
