package com.zty.smart_site.controller;

import com.zty.smart_site.entity.ProgressStaffing;
import com.zty.smart_site.service.ProgressStaffingService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Api(description = "编制进度接口")
@RestController
@RequestMapping("ProgressStaffing")
@CrossOrigin
public class ProgressStaffingController {
    @Autowired
    private ProgressStaffingService progressStaffingService;

    @ApiOperation(value = "增加编制进度",notes = "")
    @PostMapping("/InsertProgressStaffing")
    public boolean InsertProgressStaffing(@RequestBody Map map){

            progressStaffingService.UpdateIsParent(map);


        return progressStaffingService.InsertProgressStaffing(map)==1;
    }

    @ApiOperation(value = "根据标段id查询编制进度",notes = "")
    @PostMapping("/FindProgressStaffingBySectionId")
    public List<ProgressStaffing> FindProgressStaffingBySectionId(@RequestBody Map map){
        return progressStaffingService.FindProgressStaffingBySectionId(map);
    }
}
