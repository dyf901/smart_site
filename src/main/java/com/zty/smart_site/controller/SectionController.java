package com.zty.smart_site.controller;

import com.zty.smart_site.entity.Section;
import com.zty.smart_site.page.Page;
import com.zty.smart_site.service.SectionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Api(description = "标段接口")
@RestController
@RequestMapping("section")
@CrossOrigin
public class SectionController {
    @Autowired
    private SectionService sectionService;//标段接口

    @ApiOperation(value = "增加标段信息" , notes = "测试数据:{\"section_name\":\"苏州轨道交通S1线TG06标\",\"section_time\":400,\"start_time\":\"2019-07-25\",\"end_time\":\"2021-05-25\", \"section_principal\":\"交捷交通\"}")
    @PostMapping("/InsertSection")
    public boolean InsertSection(@RequestBody Map map) {
        return sectionService.InsertSection(map) == 1;
    }

    @ApiOperation(value = "删除标段信息" , notes = "测试数据:{\"id\":1}")
    @PostMapping("/DeleteSection")
    public boolean DeleteSection(@RequestBody Map map) {
        return sectionService.DeleteSection(map) == 1;
    }

    @ApiOperation(value = "修改标段信息" , notes = "测试数据:{\"section_name\":\"苏州轨道交通S1线TG06标\",\"section_time\":400,\"start_time\":\"2019-07-25\",\"end_time\":\"2021-05-25\", \"section_principal\":\"交捷交通\",\"id\":1}")
    @PostMapping("/UpdateSection")
    public boolean UpdateSection(@RequestBody Map map) {
        return sectionService.UpdateSection(map) == 1;
    }

    @ApiOperation(value = "分页模糊查询标段信息" , notes = "测试数据:{\"pageNo\":1,\"pageSize\":10}")
    @PostMapping("/FindSectioon")
    public Page<Section> FindSectioon(@RequestBody Map map) {
        Page<Section> page = new Page<Section>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(sectionService.Total(map));
        page.setItems(sectionService.FindSectioon(map));
        return page;
    }
}
