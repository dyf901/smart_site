package com.zty.smart_site.controller;

import com.zty.smart_site.entity.JsonResult;
import com.zty.smart_site.entity.Riskshow;
import com.zty.smart_site.page.Page;
import com.zty.smart_site.service.RiskshowService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Api(description = "安全隐患记录")
@RestController
@RequestMapping("riskshow")
@CrossOrigin
public class RiskshowController {
    @Autowired
    private RiskshowService riskshowService;//安全隐患

    @ApiOperation(value = "增加安全隐患记录",notes = "传参:`title`(标题),`risk_id`(安全隐患类id,安全隐患类型下拉框), `staff_name`(员工姓名,登录时返回), `section_id`(标段id), `station_id`(站点id,下拉框查询),`sub_id`(分包单位id) `description`(详细说明), `list`(图片地址数组)")
    @PostMapping("/InsertRiskshow")
    public JsonResult InsertRiskshow(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        System.out.println(map);
        List list = (List) map.get("list");
        System.out.println(list.toString());
        map.put("url",list.toString());
        int i=riskshowService.InsertRiskshow(map);
        if (i==1){
            jsonResult.setMessage("增加成功!");
            jsonResult.setCode(200);
            return jsonResult;
        }else {
            jsonResult.setMessage("添加失败!");
            jsonResult.setCode(20006);
            return jsonResult;
        }
    }

    @ApiOperation(value = "删除安全隐患记录",notes = "测试数据:{\"id\":1}")
    @PostMapping("/DeleteRiskshow")
    public boolean DeleteRiskshow(@RequestBody Map map){
        return riskshowService.DeleteRiskshow(map)==1;
    }

    @ApiOperation(value = "分页模糊查询安全隐患记录",notes = "测试数据:{\"pageNo\":1,\"pageSize\":10,\"section_id\":1}")
    @PostMapping("/FindRiskshow")
    public Page<Riskshow> FindRiskshow(@RequestBody Map map){
        Page<Riskshow> page = new Page<Riskshow>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(riskshowService.Total(map));
        page.setItems(riskshowService.FindRiskshow(map));
        return page;
    }
}
