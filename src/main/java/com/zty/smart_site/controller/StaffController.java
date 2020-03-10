package com.zty.smart_site.controller;

import com.zty.smart_site.entity.Staff;
import com.zty.smart_site.page.Page;
import com.zty.smart_site.service.StaffService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Api(description = "员工接口")
@RestController
@RequestMapping("staff")
@CrossOrigin
public class StaffController {
    @Autowired
    private StaffService staffService;

    @ApiOperation(value = "增加员工信息",notes = "")
    @PostMapping("/InsertStaff")
    public boolean InsertStaff(@RequestBody Map map){
        return true;
    }

    @ApiOperation(value = "删除员工信息",notes = "")
    @PostMapping("/DeleteStaff")
    public boolean DeleteStaff(@RequestBody Map map){
        return staffService.DeleteStaff(map)==1;
    }

    @ApiOperation(value = "修改员工信息",notes = "")
    @PostMapping("/UpdateStaff")
    public boolean UpdateStaff(@RequestBody Map map){
        return staffService.UpdateStaff(map)==1;
    }

    @ApiOperation(value = "修改App头像",notes = "")
    @PostMapping("/UpdateStaffPicture")
    public boolean UpdateStaffPicture(@RequestBody Map map){
        return staffService.UpdateStaffPicture(map)==1;
    }

    @ApiOperation(value = "修改App登录密码",notes = "")
    @PostMapping("/UpdateStaffPassword")
    public boolean UpdateStaffPassword(@RequestBody Map map){
        return staffService.UpdateStaffPassword(map)==1;
    }

    @ApiOperation(value = "修改员工在职/离职状态",notes = "")
    @PostMapping("/UpdateStaffState")
    public boolean UpdateStaffState(@RequestBody Map map){
        return staffService.UpdateStaffState(map)==1;
    }

    @ApiOperation(value = "修改员工培训状态",notes = "")
    @PostMapping("/UpdateStaffTrain")
    public boolean UpdateStaffTrain(@RequestBody Map map){
        return staffService.UpdateStaffTrain(map)==1;
    }

    @ApiOperation(value = "分页模糊查询员工信息",notes = "")
    @PostMapping("/FindStaff")
    public Page<Staff> FindStaff(@RequestBody Map map){
        Page<Staff> page = new Page<Staff>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(staffService.Total(map));
        page.setItems(staffService.FindStaff(map));
        return page;
    }


}
