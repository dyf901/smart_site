package com.zty.smart_site.controller;

import com.zty.smart_site.entity.BehaviorRecord;
import com.zty.smart_site.entity.Staff;
import com.zty.smart_site.page.Page;
import com.zty.smart_site.service.BehaviorRecordService;
import com.zty.smart_site.service.StaffService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Api(description = "行为记录接口")
@RestController
@RequestMapping("behaviorRecord")
@CrossOrigin
public class BehaviorRecordController {
    @Autowired
    private BehaviorRecordService behaviorRecordService;//行为记录

    @Autowired
    private StaffService staffService;//员工

    @ApiOperation(value = "增加行为记录",notes = "")
    @PostMapping("/InsertBehaviorRecord")
    public boolean InsertBehaviorRecord(@RequestBody Map map){
        Staff staff = staffService.FindStaffByStaff_card(map);
        map.put("staff_id",staff.getId());
        return behaviorRecordService.InsertBehaviorRecord(map)==1;
    }

    @ApiOperation(value = "删除行为记录",notes = "")
    @PostMapping("/DeleteBehaviorRecord")
    public boolean DeleteBehaviorRecord(@RequestBody Map map){
        return behaviorRecordService.DeleteBehaviorRecord(map)==1;
    }

    @ApiOperation(value = "修改行为记录",notes = "")
    @PostMapping("/UpdateBehaviorRecord")
    public boolean UpdateBehaviorRecord(@RequestBody Map map){
        return behaviorRecordService.UpdateBehaviorRecord(map)==1;
    }

    @ApiOperation(value = "分页模糊查询行为记录",notes = "")
    @PostMapping("/FindBehaviorRecord")
    public Page<BehaviorRecord> FindBehaviorRecord(@RequestBody Map map){
        Page<BehaviorRecord> page = new Page<BehaviorRecord>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(behaviorRecordService.Total(map));
        page.setItems(behaviorRecordService.FindBehaviorRecord(map));
        return page;
    }

    @ApiOperation(value = "分页查询个人行为记录",notes = "")
    @PostMapping("/FindBehaviorRecordByStaff_id")
    public Page<BehaviorRecord> FindBehaviorRecordByStaff_id(@RequestBody Map map){
        Page<BehaviorRecord> page = new Page<BehaviorRecord>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(behaviorRecordService.TotalByStaff_id(map));
        page.setItems(behaviorRecordService.FindBehaviorRecordByStaff_id(map));
        return page;
    }
}
