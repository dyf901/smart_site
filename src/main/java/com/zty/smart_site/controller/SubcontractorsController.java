package com.zty.smart_site.controller;

import com.zty.smart_site.entity.Subcontractors;
import com.zty.smart_site.page.Page;
import com.zty.smart_site.service.SubcontractorsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Api(description = "分包单位接口")
@RestController
@RequestMapping("subcontractors")
@CrossOrigin
public class SubcontractorsController {
    @Autowired
    private SubcontractorsService subcontractorsService;//分包单位

    @ApiOperation(value = "增加分包单位信息" , notes = "测试数据:{\"subcontractors_name\":\"上海五保公司\",\"principal\":\"交捷交通\",\"section_id\":1,\"station_id\":1,\"principal_phone\":\"13000000000\",\"remark\":\"信用良好\"}")
    @PostMapping("/InsertSubcontractors")
    public boolean InsertSubcontractors(@RequestBody Map map) {
        return subcontractorsService.InsertSubcontractors(map) == 1;
    }

    @ApiOperation(value = "删除分包单位信息" , notes = "测试数据:{\"id\":1}")
    @PostMapping("/DeleteSubcontractors")
    public boolean DeleteSubcontractors(@RequestBody Map map) {
        return subcontractorsService.DeleteSubcontractors(map) == 1;
    }

    @ApiOperation(value = "修改分包单位信息" , notes = "测试数据:{\"subcontractors_name\":\"上海五保公司\",\"principal\":\"交捷交通\",\"principal_phone\":\"13000000000\",\"remark\":\"信用良好1\",\"id\":1}")
    @PostMapping("/UpdateSubcontractors")
    public boolean UpdateSubcontractors(@RequestBody Map map) {
        return subcontractorsService.UpdateSubcontractors(map) == 1;
    }

    @ApiOperation(value = "分页模糊查询分包单位信息" , notes = "测试数据:{\"pageNo\":1,\"pageSize\":10,\"section_id\":1}")
    @PostMapping("/FindSubcontractors")
    public Page<Subcontractors> FindSubcontractors(@RequestBody Map map) {
        Page<Subcontractors> page = new Page<Subcontractors>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(subcontractorsService.Total(map));
        page.setItems(subcontractorsService.FindSubcontractors(map));
        return page;
    }

    @ApiOperation(value = "下拉框查询分包单位信息" , notes = "测试数据:{\"section_id\":1}")
    @PostMapping("/SelectSubcontractors")
    public List<Subcontractors> SelectSubcontractors(@RequestBody Map map) {
        return subcontractorsService.SelectSubcontractors(map);
    }
}
