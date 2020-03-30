package com.zty.smart_site.controller;

import com.zty.smart_site.entity.AdminStaff;
import com.zty.smart_site.entity.Staff;
import com.zty.smart_site.service.AdminStaffService;
import com.zty.smart_site.service.StaffService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    private AdminStaffService adminStaffService;

    @ApiOperation(value = "根据工种分布统计人数(选择站点)",notes = "测试数据:{\"section_id\":1,\"station_id\":1}")
    @PostMapping("/CountByWorktype")
    public List<Staff> CountByWorktype(@RequestBody Map map){
        return staffService.CountByWorktype(map);
    }

    @ApiOperation(value = "根据分包单位分布统计人数(选择站点)",notes = "测试数据:{\"section_id\":1,\"station_id\":1}")
    @PostMapping("/CountBySub")
    public List<Staff> CountBySub(@RequestBody Map map){
        return staffService.CountBySub(map);
    }

    @ApiOperation(value = "根据人员类型分组统计人数(选择站点)",notes = "测试数据:{\"section_id\":1,\"station_id\":1}")
    @PostMapping("/CountByType")
    public List<Staff> CountByType(@RequestBody Map map){
        return staffService.CountByType(map);
    }

    @ApiOperation(value = "根据地区分组统计人数(选择站点)",notes = "测试数据:{\"section_id\":1,\"station_id\":1}")
    @PostMapping("/CountByStaffProvince")
    public List<Staff> CountByStaffProvince(@RequestBody Map map){
        return staffService.CountByStaffProvince(map);
    }

    @ApiOperation(value = "根据民族分组统计人数(选择站点)",notes = "测试数据:{\"section_id\":1,\"station_id\":1}")
    @PostMapping("/CountByStaffNation")
    public List<Staff> CountByStaffNation(@RequestBody Map map){
        return staffService.CountByStaffNation(map);
    }

    @ApiOperation(value = "根据性别分组统计人数(选择站点)",notes = "测试数据:{\"section_id\":1,\"station_id\":1}")
    @PostMapping("/CountByStaffSex")
    public List<Staff> CountByStaffSex(@RequestBody Map map){
        return staffService.CountByStaffSex(map);
    }

    @ApiOperation(value = "按照年龄端分组查询(选择站点)",notes = "测试数据:{\"section_id\":1,\"station_id\":1}")
    @PostMapping("/CountByStaffAge")
    public List<Staff> CountByStaffAge(@RequestBody Map map){
        return staffService.CountByStaffAge(map);
    }

    @ApiOperation(value = "劳务人员总数",notes = "测试数据:{\"section_id\":1}")
    @PostMapping("/CountAll")
    public List<Staff> CountAll(@RequestBody Map map){
        return staffService.CountAll(map);
    }

    @ApiOperation(value = "管理人员总数",notes = "测试数据:{\"section_id\":1}")
    @PostMapping("/CountAllAdmin")
    public List<AdminStaff> CountAllAdmin(@RequestBody Map map){
        return adminStaffService.CountAllAdmin(map);
    }
}