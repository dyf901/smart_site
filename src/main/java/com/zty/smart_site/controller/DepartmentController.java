package com.zty.smart_site.controller;

import com.zty.smart_site.entity.Department;
import com.zty.smart_site.page.Page;
import com.zty.smart_site.service.DepartmentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Api(description = "部门接口")
@RestController
@RequestMapping("department")
@CrossOrigin
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @ApiOperation(value = "增加部门信息" , notes = "测试数据:{\"department_name\":\"管理部\",\"depthead\":\"交捷交通\",\"section_id\":1,\"headphone\":\"13000000000\",\"remark\":\"管理工地\"}")
    @PostMapping("/InsertDepartment")
    public boolean InsertDepartment(@RequestBody Map map) {
        return departmentService.InsertDepartment(map) == 1;
    }

    @ApiOperation(value = "删除部门信息" , notes = "测试数据:{\"id\":1}")
    @PostMapping("/DeleteDepartment")
    public boolean DeleteDepartment(@RequestBody Map map) {
        return departmentService.DeleteDepartment(map) == 1;
    }

    @ApiOperation(value = "修改部门信息" , notes = "测试数据:{\"department_name\":\"管理部\",\"depthead\":\"交捷交通1\",\"headphone\":\"13000000000\",\"remark\":\"管理工地\",\"id\":1}")
    @PostMapping("/UpdateDepartment")
    public boolean UpdateDepartment(@RequestBody Map map) {
        return departmentService.UpdateDepartment(map) == 1;
    }

    @ApiOperation(value = "分页模糊查询部门信息" , notes = "测试数据:{\"pageNo\":1,\"pageSize\":10,\"section_id\":1}")
    @PostMapping("/FindDepartment")
    public Page<Department> FindDepartment(@RequestBody Map map) {
        Page<Department> page = new Page<Department>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(departmentService.Total(map));
        page.setItems(departmentService.FindDepartment(map));
        return page;
    }

    @ApiOperation(value = "下拉框查询部门信息" , notes = "测试数据:{\"section_id\":1}")
    @PostMapping("/SelectDepartment")
    public List<Department> SelectDepartment(@RequestBody Map map) {
        return departmentService.SelectDepartment(map);
    }
}
