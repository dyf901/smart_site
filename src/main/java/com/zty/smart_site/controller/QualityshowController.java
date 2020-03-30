package com.zty.smart_site.controller;

import com.zty.smart_site.entity.JsonResult;
import com.zty.smart_site.entity.Qualityshow;
import com.zty.smart_site.page.Page;
import com.zty.smart_site.service.QualityshowService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Api(description = "质量隐患记录")
@RestController
@RequestMapping("qualityshow")
@CrossOrigin
public class QualityshowController {
    @Autowired
    private QualityshowService qualityshowService;//质量隐患记录

    @ApiOperation(value = "增加质量隐患记录",notes = "传参:`quality_id`(质量隐患类id,安全隐患类型下拉框), `staff_name`(员工姓名,登录时返回), `section_id`(标段id), `station_id`(站点id,下拉框查询), `description`(详细说明), `list`(图片地址数组)")
    @PostMapping("/InsertQualityShow")
    public JsonResult InsertQualityShow(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        List list = (List) map.get("list");
        map.put("url",list.toString());
        int i=qualityshowService.InsertQualityShow(map);
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

    @ApiOperation(value = "删除质量隐患记录",notes = "测试数据:{\"id\":1}")
    @PostMapping("/DeleteQualityShow")
    public boolean DeleteQualityShow(@RequestBody Map map){
        return qualityshowService.DeleteQualityShow(map)==1;
    }

    @ApiOperation(value = "分页模糊查询质量隐患记录",notes = "测试数据:{\"pageNo\":1,\"pageSize\":10,\"section_id\":1}")
    @PostMapping("/FindQualityShow")
    public Page<Qualityshow> FindQualityShow(@RequestBody Map map){
        Page<Qualityshow> page = new Page<Qualityshow>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(qualityshowService.Total(map));
        page.setItems(qualityshowService.FindQualityShow(map));
        return page;
    }
}
