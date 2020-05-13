package com.zty.smart_site.controller;

import com.zty.smart_site.entity.Knowledge;
import com.zty.smart_site.page.Page;
import com.zty.smart_site.service.KnowledgeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Api(description = "知识分类接口")
@RestController
@RequestMapping("knowledge")
@CrossOrigin
public class KnowledgeController {
    @Autowired
    private KnowledgeService knowledgeService;//知识分类

    @ApiOperation(value = "增加知识类型" , notes = "传参:")
    @PostMapping("/InsertKnowledge")
    public boolean InsertKnowledge(@RequestBody Map map) {
        return knowledgeService.InsertKnowledge(map) == 1;
    }

    @ApiOperation(value = "删除知识分类" , notes = "传参:")
    @PostMapping("/DeleteKnowledge")
    public boolean DeleteKnowledge(@RequestBody Map map) {
        return knowledgeService.DeleteKnowledge(map) == 1;
    }

    @ApiOperation(value = "修改知识分类" , notes = "传参:")
    @PostMapping("/UpdateKnowledge")
    public boolean UpdateKnowledge(@RequestBody Map map) {
        return knowledgeService.UpdateKnowledge(map) == 1;
    }

    @ApiOperation(value = "分页查询知识分类" , notes = "传参:")
    @PostMapping("/FindKnowledge")
    public Page<Knowledge> FindKnowledge(@RequestBody Map map) {
        Page<Knowledge> page = new Page<Knowledge>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(knowledgeService.Total(map));
        page.setItems(knowledgeService.FindKnowledge(map));
        return page;
    }

    @ApiOperation(value = "下拉框查询知识分类" , notes = "传参:section_id")
    @PostMapping("/SelectKnowledge")
    public List<Knowledge> SelectKnowledge(@RequestBody Map map) {
        return knowledgeService.SelectKnowledge(map);
    }
}
