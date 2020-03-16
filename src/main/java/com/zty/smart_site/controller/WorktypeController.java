package com.zty.smart_site.controller;

import com.zty.smart_site.entity.Worktype;
import com.zty.smart_site.page.Page;
import com.zty.smart_site.service.WorktypeService;
import com.zty.smart_site.util.ProvinceUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Api(description = "工种接口")
@RestController
@RequestMapping("worktype")
@CrossOrigin
public class WorktypeController {
    @Autowired
    private WorktypeService worktypeService;

    @ApiOperation(value = "增加工种",notes = "测试数据:")
    @PostMapping("/InsertWorktype")
    public boolean InsertWorktype(@RequestBody Map map){
        return worktypeService.InsertWorktype(map)==1;
    }

    @ApiOperation(value = "删除工种",notes = "测试数据:")
    @PostMapping("/DeleteWorktype")
    public boolean DeleteWorktype(@RequestBody Map map){
        return worktypeService.DeleteWorktype(map)==1;
    }

    @ApiOperation(value = "修改工种",notes = "测试数据:")
    @PostMapping("/UpdateWorktype")
    public boolean UpdateWorktype(@RequestBody Map map){
        return worktypeService.UpdateWorktype(map)==1;
    }

    @ApiOperation(value = "分页模糊查询工种信息",notes = "测试数据:")
    @PostMapping("/FindWorktype")
    public Page<Worktype> FindWorktype(@RequestBody Map map){
        Page<Worktype> page = new Page<Worktype>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(worktypeService.Total(map));
        page.setItems(worktypeService.FindWorktype(map));
        return page;
    }

    @ApiOperation(value = "下拉框查询站点信息",notes = "测试数据:")
    @PostMapping("/SelectWorktype")
    public List<Worktype> SelectWorktype(@RequestBody Map map){
        return worktypeService.SelectWorktype(map);
    }
}
