package com.zty.smart_site.controller;

import com.zty.smart_site.entity.Risk;
import com.zty.smart_site.page.Page;
import com.zty.smart_site.service.RiskService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Api(description = "安全隐患类型接口")
@RestController
@RequestMapping("risk")
@CrossOrigin
public class RiskController {
    @Autowired
    private RiskService riskService;//安全隐患类型

    @ApiOperation(value = "增加安全隐患类型" , notes = "测试数据:{\"section_id\":1,\"risk_category\":\"施工设备隐患\",\"risk_description\":\"施工设备的磨损,老化等问题\",\"risk_grade\":\"Ⅰ\",\"risk_duration\":\"2019:10:11~2019:11:10\",\"construction\":\"及时检查维修更换\",\"construction_person\":\"晋铁智能科技\",\"construction_phone\":\"13000000000\",\"supervisor\":\"按时上报整改\",\"supervisor_person\":\"晋铁智能科技\",\"supervisor_phone\":\"13000000000\"}")
    @PostMapping("/InsertRisk")
    public boolean InsertRisk(@RequestBody Map map) {
        System.out.println(map);
        return riskService.InsertRisk(map) == 1;
    }

    @ApiOperation(value = "删除安全隐患类型" , notes = "测试数据:{\"id\":1}")
    @PostMapping("/DeleteRisk")
    public boolean DeleteRisk(@RequestBody Map map) {
        return riskService.DeleteRisk(map) == 1;
    }

    @ApiOperation(value = "修改安全隐患类型" , notes = "测试数据:{\"risk_category\":\"施工设备隐患\",\"risk_description\":\"施工设备的磨损,老化等问题\",\"risk_grade\":\"Ⅰ\",\"risk_duration\":\"2019:10:11~2019:11:10\",\"construction\":\"及时检查维修更换\",\"construction_person\":\"晋铁智能科技1\",\"construction_phone\":\"13000000000\",\"supervisor\":\"按时上报整改\",\"supervisor_person\":\"晋铁智能科技\",\"supervisor_phone\":\"13000000000\",\"id\":1}")
    @PostMapping("/UpdateRisk")
    public boolean UpdateRisk(@RequestBody Map map) {
        return riskService.UpdateRisk(map) == 1;
    }

    @ApiOperation(value = "分页模糊查询安全隐患类型" , notes = "测试数据:{\"pageNo\":1,\"pageSize\":10,\"section_id\":1}")
    @PostMapping("/FindRisk")
    public Page<Risk> FindRisk(@RequestBody Map map) {
        Page<Risk> page = new Page<Risk>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(riskService.Total(map));
        page.setItems(riskService.FindRisk(map));
        return page;
    }

    @ApiOperation(value = "下拉框查询安全隐患类型" , notes = "测试数据:{\"section_id\":1}      (section_id标段id登录时返回)")
    @PostMapping("/SelectRisk")
    public List<Risk> SelectRisk(@RequestBody Map map) {
        return riskService.SelectRisk(map);
    }
}
