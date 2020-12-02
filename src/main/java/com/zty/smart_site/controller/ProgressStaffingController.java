package com.zty.smart_site.controller;

import com.zty.smart_site.entity.JsonResult;
import com.zty.smart_site.entity.Section;
import com.zty.smart_site.service.PlanService;
import com.zty.smart_site.service.ProgressStaffingService;
import com.zty.smart_site.service.SectionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;

@Api(description = "个人积分明细接口")
@RestController
@RequestMapping("ProgressStaffing")
@CrossOrigin
public class ProgressStaffingController {
    @Autowired
    private ProgressStaffingService progressStaffingService;

    @Autowired
    private SectionService sectionService;

    @Autowired
    private PlanService planService;

    @ApiOperation(value = "增加进度计划",notes = "")
    @PostMapping("/InsertProgressStaffing")
    public JsonResult InsertProgressStaffing(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        Section section=sectionService.FindSectionById(map);
        int Days = 0;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            long time = sdf.parse((String) map.get("start_time")).getTime();
            long time1 = sdf.parse((String) map.get("end_time")).getTime();
            Days = (int) ((time1 -time) /(24 * 60 * 60 * 1000));//计算计划天数
            map.put("duration",Days+1);

            long time2 = sdf.parse(section.getStart_time()).getTime();//总进度的开工时间
            int start_day=(int) ((time -time2) /(24 * 60 * 60 * 1000));
            int end_day=(int) ((time1 -time2) /(24 * 60 * 60 * 1000));
            map.put("end_day",end_day);
            map.put("start_day",start_day);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        int i = progressStaffingService.InsertProgressStaffing(map);
        int l = progressStaffingService.UpdateIsParent(map);
        if (i==1&&l==1){
            int k= planService.InsertPlan(map);
            jsonResult.setCode(200);
            jsonResult.setMessage("增加成功!");
        }else{
            jsonResult.setCode(20006);
            jsonResult.setMessage("增加失败!");
        }
        return jsonResult;
    }
}
