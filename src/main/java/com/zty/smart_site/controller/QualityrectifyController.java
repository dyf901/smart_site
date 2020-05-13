package com.zty.smart_site.controller;

import com.zty.smart_site.entity.JsonResult;
import com.zty.smart_site.entity.Qualityrectify;
import com.zty.smart_site.entity.Riskrectify;
import com.zty.smart_site.page.Page;
import com.zty.smart_site.service.QualityrectifyService;
import com.zty.smart_site.service.RiskrectifyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Api(description = "质量整改通知单接口")
@RestController
@RequestMapping("qualityrectify")
@CrossOrigin
public class QualityrectifyController {
    @Autowired
    private QualityrectifyService qualityrectifyService;//整改通知单

    @ApiOperation(value = "删除整改通知单" , notes = "测试数据:")
    @PostMapping("/DeleteQualityrectify")
    public boolean DeleteQualityrectify(@RequestBody Map map) {
        return qualityrectifyService.DeleteQualityrectify(map) == 1;
    }

    @ApiOperation(value = "修改整改通知单" , notes = "测试数据:")
    @PostMapping("/UpdateQualityrectify")
    public boolean UpdateQualityrectify(@RequestBody Map map) {
        return qualityrectifyService.UpdateQualityrectify(map) == 1;
    }

    @ApiOperation(value = "分页模糊查询整改通知单信息" , notes = "测试数据:")
    @PostMapping("/FindQualityrectify")
    public Page<Qualityrectify> FindQualityrectify(@RequestBody Map map) {
        Page<Qualityrectify> page = new Page<Qualityrectify>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(qualityrectifyService.Total(map));
        page.setItems(qualityrectifyService.FindQualityrectify(map));
        return page;
    }

    @ApiOperation(value = "分页模糊查询整改通知单信息PC" , notes = "测试数据:")
    @PostMapping("/FindQualityrectifyPC")
    public Page<Qualityrectify> FindQualityrectifyPC(@RequestBody Map map) {
        Page<Qualityrectify> page = new Page<Qualityrectify>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(qualityrectifyService.TotalPC(map));
        page.setItems(qualityrectifyService.FindQualityrectifyPC(map));
        return page;
    }

    @ApiOperation(value = "根据riskshow_id查询整改通知单信息" , notes = "传参:qualityshow_id(安全隐患记录id)")
    @PostMapping("/FindQualityrectifyByqualityshowId")
    public JsonResult FindQualityrectifyByqualityshowId(@RequestBody Map map) {
        JsonResult jsonResult = new JsonResult();
        jsonResult.setCode(200);
        jsonResult.setData(qualityrectifyService.FindQualityrectifyByqualityshowId(map));
        return jsonResult;
    }
}
