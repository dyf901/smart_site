package com.zty.smart_site.controller;

import com.zty.smart_site.entity.Anintegral;
import com.zty.smart_site.entity.JsonResult;
import com.zty.smart_site.page.Page;
import com.zty.smart_site.service.ProcessService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Api(description = "工序接口")
@RestController
@RequestMapping("process")
@CrossOrigin
public class ProcessController {
    @Autowired
    private ProcessService processService;

    @ApiOperation(value = "增加工序" , notes = "")
    @PostMapping("/InsertProcess")
    public Boolean InsertProcess(@RequestBody Map map) {
        return processService.InsertProcess(map) == 1;
    }

    @ApiOperation(value = "删除工序" , notes = "")
    @PostMapping("/DeleteProcess")
    public Boolean DeleteProcess(@RequestBody Map map) {
        return processService.DeleteProcess(map) == 1;
    }

    @ApiOperation(value = "修改工序" , notes = "")
    @PostMapping("/UpdateProcess")
    public Boolean UpdateProcess(@RequestBody Map map) {
        return processService.UpdateProcess(map) == 1;
    }

    @ApiOperation(value = "分页模糊查询工序" , notes = "测试数据:{\"pageNo\":1,\"pageSize\":10,\"section_id\":2}")
    @PostMapping("/FindProcess")
    public Page<Process> FindProcess(@RequestBody Map map) {
        Page<Process> page = new Page<Process>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(processService.Total(map));
        page.setItems(processService.FindProcess(map));
        return page;
    }

    @ApiOperation(value = "下拉框查询工序" , notes = "")
    @PostMapping("/SelectProcess")
    public JsonResult SelectProcess(@RequestBody Map map) {
        JsonResult jsonResult = new JsonResult();
        jsonResult.setData(processService.SelectProcess(map));
        return jsonResult;
    }
}
