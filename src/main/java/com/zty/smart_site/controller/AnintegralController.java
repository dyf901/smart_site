package com.zty.smart_site.controller;

import com.zty.smart_site.entity.Anintegral;
import com.zty.smart_site.page.Page;
import com.zty.smart_site.service.AnintegralService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Api(description = "个人积分明细接口")
@RestController
@RequestMapping("anintegral")
@CrossOrigin
public class AnintegralController {
    @Autowired
    private AnintegralService anintegralService;

    @ApiOperation(value = "分页查询积分明细",notes = "测试数据:")
    @PostMapping("/FindAnintegral")
    public Page<Anintegral> FindAnintegral(@RequestBody Map map){
        Page<Anintegral> page = new Page<Anintegral>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(anintegralService.Total(map));
        page.setItems(anintegralService.FindAnintegral(map));
        return page;
    }
}
