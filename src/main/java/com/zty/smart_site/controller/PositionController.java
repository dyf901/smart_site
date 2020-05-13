package com.zty.smart_site.controller;

import com.zty.smart_site.entity.Position;
import com.zty.smart_site.page.Page;
import com.zty.smart_site.service.PositionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Api(description = "职务接口")
@RestController
@RequestMapping("position")
@CrossOrigin
public class PositionController {
    @Autowired
    private PositionService positionService;//职务接口

    @ApiOperation(value = "增加职位信息" , notes = "{\"position_name\":\"项目经理\",\"remark\":\"整个标段的负责人\"}")
    @PostMapping("/InsertPosition")
    public boolean InsertPosition(@RequestBody Map map) {
        return positionService.InsertPosition(map) == 1;
    }

    @ApiOperation(value = "删除职位信息" , notes = "{\"id\":1}")
    @PostMapping("/DeletePosition")
    public boolean DeletePosition(@RequestBody Map map) {
        return positionService.DeletePosition(map) == 1;
    }

    @ApiOperation(value = "修改职位信息" , notes = "{\"position_name\":\"项目经理\",\"id\":1,\"remark\":\"1\"}")
    @PostMapping("/UpdatePosition")
    public boolean UpdatePosition(@RequestBody Map map) {
        return positionService.UpdatePosition(map) == 1;
    }

    @ApiOperation(value = "分页模糊查询职务接口" , notes = "{\"pageNo\":1,\"pageSize\":10}")
    @PostMapping("/FindPosition")
    public Page<Position> FindPosition(@RequestBody Map map) {
        Page<Position> page = new Page<Position>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(positionService.Total(map));
        page.setItems(positionService.FindPosition(map));
        return page;
    }

    @ApiOperation(value = "下拉框查询职务信息" , notes = "{\"pageNo\":1,\"pageSize\":10}")
    @PostMapping("/SelectPosition")
    public List<Position> SelectPosition(@RequestBody Map map) {
        return positionService.SelectPosition(map);
    }
}
