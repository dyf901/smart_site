package com.zty.smart_site.controller;

import com.zty.smart_site.entity.Commodity;
import com.zty.smart_site.entity.Conversions;
import com.zty.smart_site.entity.JsonResult;
import com.zty.smart_site.entity.Staff;
import com.zty.smart_site.page.Page;
import com.zty.smart_site.service.CommodityService;
import com.zty.smart_site.service.ConversionsService;
import com.zty.smart_site.service.StaffService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Api(description = "兑换记录接口")
@RestController
@RequestMapping("conversion")
@CrossOrigin
public class ConversionsController {
    @Autowired
    private ConversionsService conversionsService;//兑换记录
    @Autowired
    private StaffService staffService;//劳务人员

    @ApiOperation(value = "增加兑换记录" , notes = "测试数据:{\"id\":3,\"commodity_id\":1,\"section_id\":1,\"station_id\":1,\"sub_id\":1,\"commodity_price\":10}")
    @PostMapping("/InsertConversions")
    public JsonResult InsertConversions(@RequestBody Map map) {
        JsonResult jsonResult = new JsonResult();
        System.out.println(map);
        Staff staff = staffService.FindStaffById(map);
        int t = (int) map.get("commodity_price");
        map.put("staff_id" , staff.getId());
        if (staff.getEnd_integral() > t) {
            int i = conversionsService.InsertConversions(map);
            if (i == 1) {
                staffService.UpdateStaffEnd_integral(map);
                jsonResult.setMessage("兑换成功!");
                jsonResult.setCode(200);
                return jsonResult;
            } else {
                jsonResult.setMessage("信息有误兑换失败!");
                jsonResult.setCode(20006);
                return jsonResult;
            }
        } else {
            jsonResult.setMessage("积分不足兑换失败!");
            jsonResult.setCode(20006);
            return jsonResult;
        }
    }

    @ApiOperation(value = "删除兑换记录" , notes = "测试数据:{\"id\":3}")
    @PostMapping("/DeleteConversions")
    public boolean DeleteConversions(@RequestBody Map map) {
        return conversionsService.DeleteConversions(map) == 1;
    }

    @ApiOperation(value = "分页模糊查询兑换记录" , notes = "测试数据:{\"pageNo\":1,\"pageSize\":10,\"section_id\":1}")
    @PostMapping("/FindConversions")
    public Page<Conversions> FindConversions(@RequestBody Map map) {
        Page<Conversions> page = new Page<Conversions>();

        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(conversionsService.Total(map));
        page.setItems(conversionsService.FindConversions(map));
        return page;
    }

    @ApiOperation(value = "分页模糊查询个人兑换记录" , notes = "测试数据:{\"pageNo\":1,\"pageSize\":10,\"section_id\":1,\"staff_id\":3}")
    @PostMapping("/FindConversionsByStaffId")
    public Page<Conversions> FindConversionsByStaffId(@RequestBody Map map) {
        Page<Conversions> page = new Page<Conversions>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(conversionsService.TotalByStaff(map));
        page.setItems(conversionsService.FindConversionsByStaffId(map));
        return page;
    }
}
