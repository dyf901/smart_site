package com.zty.smart_site.controller;

import com.zty.smart_site.entity.JsonResult;
import com.zty.smart_site.entity.Riskrectify;
import com.zty.smart_site.page.Page;
import com.zty.smart_site.service.RiskrectifyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Api(description = "安全整改通知单接口")
@RestController
@RequestMapping("riskrectify")
@CrossOrigin
public class RiskrectifyController {
    @Autowired
    private RiskrectifyService riskrectifyService;//整改通知单

    @ApiOperation(value = "增加整改通知单信息" , notes = "传参:`title`(上一级页面返回数据),`section_id`(上一级页面返回数据),`station_id`(上一级页面返回数据),`sub_id`(上一级页面返回数据),`up_name`(上一级页面返回数据),`responsible`")
    @PostMapping("/InsertRiskrectify")
    public JsonResult InsertRiskrectify(@RequestBody Map map) {
        JsonResult jsonResult = new JsonResult();
        int i = riskrectifyService.InsertRiskrectify(map);
        if (i == 1) {
            jsonResult.setCode(200);
            jsonResult.setMessage("增加成功!");
            return jsonResult;
        } else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("增加失败!");
            return jsonResult;
        }
    }

    @ApiOperation(value = "删除整改通知单" , notes = "测试数据:")
    @PostMapping("/DeleteRiskrectify")
    public boolean DeleteRiskrectify(@RequestBody Map map) {
        return riskrectifyService.DeleteRiskrectify(map) == 1;
    }

    @ApiOperation(value = "修改整改通知单" , notes = "测试数据:")
    @PostMapping("/UpdateRiskrectify")
    public boolean UpdateRiskrectify(@RequestBody Map map) {
        return riskrectifyService.UpdateRiskrectify(map) == 1;
    }

    @ApiOperation(value = "分页模糊查询整改通知单信息" , notes = "测试数据:")
    @PostMapping("/FindRiskrectify")
    public Page<Riskrectify> FindRiskrectify(@RequestBody Map map) {
        Page<Riskrectify> page = new Page<Riskrectify>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(riskrectifyService.Total(map));
        page.setItems(riskrectifyService.FindRiskrectify(map));
        return page;
    }

    @ApiOperation(value = "分页模糊查询整改通知单信息PC" , notes = "测试数据:")
    @PostMapping("/FindRiskrectifyPC")
    public Page<Riskrectify> FindRiskrectifyPC(@RequestBody Map map) {
        Page<Riskrectify> page = new Page<Riskrectify>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(riskrectifyService.TotalPC(map));
        page.setItems(riskrectifyService.FindRiskrectifyPC(map));
        return page;
    }

    @ApiOperation(value = "根据riskshow_id查询整改通知单信息" , notes = "传参:riskshow_id(安全隐患记录id)")
    @PostMapping("/FindRiskrectifyByriskshowId")
    public JsonResult FindRiskrectifyByriskshowId(@RequestBody Map map) {
        JsonResult jsonResult = new JsonResult();
        jsonResult.setCode(200);
        jsonResult.setData(riskrectifyService.FindRiskrectifyByriskshowId(map));
        return jsonResult;
    }
}
