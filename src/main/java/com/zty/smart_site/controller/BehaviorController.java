package com.zty.smart_site.controller;

import com.zty.smart_site.entity.Behavior;
import com.zty.smart_site.page.Page;
import com.zty.smart_site.service.BehaviorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Api(description = "行为类型接口")
@RestController
@RequestMapping("behavior")
@CrossOrigin
public class BehaviorController {
    @Autowired
    private BehaviorService behaviorService;//行为类型

    @ApiOperation(value = "增加行为类型",notes = "")
    @PostMapping("/InsertBehavior")
    public boolean InsertBehavior(@RequestBody Map map){
        return behaviorService.InsertBehavior(map)==1;
    }

    @ApiOperation(value = "删除行为类型",notes = "")
    @PostMapping("/DeleteBehavior")
    public boolean DeleteBehavior(@RequestBody Map map){
        return behaviorService.DeleteBehavior(map)==1;
    }

    @ApiOperation(value = "修改行为类型",notes = "")
    @PostMapping("/UpdateBehavior")
    public boolean UpdateBehavior(@RequestBody Map map){
        return behaviorService.UpdateBehavior(map)==1;
    }

    @ApiOperation(value = "分页模糊查询行为类型",notes = "")
    @PostMapping("/FindBehavior")
    public Page<Behavior> FindBehavior(@RequestBody Map map){
        Page<Behavior> page = new Page<Behavior>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(behaviorService.Total(map));
        page.setItems(behaviorService.FindBehavior(map));
        return page;
    }

    @ApiOperation(value = "行为类型下拉框",notes = "")
    @GetMapping("/SelectBehavior")
    public List<Behavior> SelectBehavior(){
        return behaviorService.SelectBehavior();
    }
}
