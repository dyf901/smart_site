package com.zty.smart_site.controller;

import com.zty.smart_site.entity.Station;
import com.zty.smart_site.page.Page;
import com.zty.smart_site.service.StationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Api(description = "站点接口")
@RestController
@RequestMapping("station")
@CrossOrigin
public class StationController {
    @Autowired
    private StationService stationService;

    @ApiOperation(value = "增加站点信息",notes = "")
    @PostMapping("/InsertStation")
    public boolean InsertStation(@RequestBody Map map){
        return stationService.InsertStation(map)==1;
    }

    @ApiOperation(value = "删除站点信息",notes = "")
    @PostMapping("/DeleteStation")
    public boolean DeleteStation(@RequestBody Map map){
        return stationService.DeleteStation(map)==1;
    }

    @ApiOperation(value = "修改站点信息",notes = "")
    @PostMapping("/UpdateStation")
    public boolean UpdateStation(@RequestBody Map map){
        return stationService.UpdateStation(map)==1;
    }

    @ApiOperation(value = "分页模糊查询站点信息",notes = "")
    @PostMapping("/FindStation")
    public Page<Station> FindStation(@RequestBody Map map){
        Page<Station> page = new Page<Station>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(stationService.Total(map));
        page.setItems(stationService.FindStation(map));
        return page;
    }
}
