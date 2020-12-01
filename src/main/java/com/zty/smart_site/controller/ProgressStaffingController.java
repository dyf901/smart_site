package com.zty.smart_site.controller;

import com.zty.smart_site.entity.JsonResult;
import com.zty.smart_site.service.ProgressStaffingService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Api(description = "个人积分明细接口")
@RestController
@RequestMapping("ProgressStaffing")
@CrossOrigin
public class ProgressStaffingController {
    @Autowired
    private ProgressStaffingService progressStaffingService;

    @ApiOperation(value = "增加进度计划",notes = "")
    @PostMapping("/InsertProgressStaffing")
    public JsonResult InsertProgressStaffing(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        int i = progressStaffingService.InsertProgressStaffing(map);
        int l = progressStaffingService.UpdateIsParent(map);
        if (i==1&&l==1){
            jsonResult.setCode(200);
            jsonResult.setMessage("增加成功!");
        }else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("增加失败!");
        }
        return jsonResult;
    }
}
