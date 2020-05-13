package com.zty.smart_site.controller;

import com.zty.smart_site.entity.Quality;
import com.zty.smart_site.page.Page;
import com.zty.smart_site.service.QualityService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Api(description = "质量隐患类型接口")
@RestController
@RequestMapping("quality")
@CrossOrigin
public class QualityController {
    @Autowired
    private QualityService qualityService;//质量隐患

    @ApiOperation(value = "增加质量隐患类型" , notes = "测试数据:{\"section_id\":1,\"quality_category\":\"材料质量\",\"quality_description\":\"材料质量不合格\",\"quality_grade\":\"Ⅰ\",\"quality_duration\":\"2019:10:11~2019:11:10\",\"construction\":\"及时检查\",\"construction_person\":\"晋铁智能科技\",\"construction_phone\":\"13000000000\",\"supervisor\":\"按时上报整改\",\"supervisor_person\":\"晋铁智能科技\",\"supervisor_phone\":\"13000000000\"}")
    @PostMapping("/InsertQuality")
    public boolean InsertQuality(@RequestBody Map map) {
        return qualityService.InsertQuality(map) == 1;
    }

    @ApiOperation(value = "删除质量隐患类型" , notes = "测试数据:{\"id\":1}")
    @PostMapping("/DeleteQuality")
    public boolean DeleteQuality(@RequestBody Map map) {
        return qualityService.DeleteQuality(map) == 1;
    }

    @ApiOperation(value = "修改质量隐患类型" , notes = "测试数据:{\"quality_category\":\"材料质量\",\"quality_description\":\"材料质量不合格\",\"quality_grade\":\"Ⅰ\",\"quality_duration\":\"2019:10:11~2019:11:10\",\"construction\":\"及时检查\",\"construction_person\":\"晋铁智能科技1\",\"construction_phone\":\"13000000000\",\"supervisor\":\"按时上报整改\",\"supervisor_person\":\"晋铁智能科技\",\"supervisor_phone\":\"13000000000\",\"id\":1}")
    @PostMapping("/UpdateQuality")
    public boolean UpdateQuality(@RequestBody Map map) {
        return qualityService.UpdateQuality(map) == 1;
    }

    @ApiOperation(value = "分页模糊查询安全隐患类型" , notes = "测试数据:{\"pageNo\":1,\"pageSize\":10,\"section_id\":1}")
    @PostMapping("/FindQuality")
    public Page<Quality> FindQuality(@RequestBody Map map) {
        Page<Quality> page = new Page<Quality>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(qualityService.Total(map));
        page.setItems(qualityService.FindQuality(map));
        return page;
    }

    @ApiOperation(value = "下拉框查询安全隐患类型" , notes = "测试数据:{\"section_id\":1}")
    @PostMapping("/SelectQuality")
    public List<Quality> SelectQuality(@RequestBody Map map) {
        return qualityService.SelectQuality(map);
    }

}
