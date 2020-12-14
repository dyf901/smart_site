package com.zty.smart_site.controller;

import com.zty.smart_site.entity.JsonResult;
import com.zty.smart_site.entity.Section;
import com.zty.smart_site.page.Page;
import com.zty.smart_site.service.PlanService;
import com.zty.smart_site.service.SectionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@Api(description = "大屏进度接口")
@RestController
@RequestMapping("Plan")
@CrossOrigin
public class PlanController {
    @Autowired
    private PlanService planService;

    @Autowired
    private SectionService sectionService;

    @ApiOperation(value = "增加项目进度信息", notes = "")
    @PostMapping("/InsertPlan")
    public JsonResult InsertPlan(@RequestBody Map map){
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

        int k= planService.InsertPlan(map);
        if (k==1){
            jsonResult.setCode(200);
            jsonResult.setMessage("增加成功!");
        }else{
            jsonResult.setCode(20006);
            jsonResult.setMessage("增加失败!");
        }
        return jsonResult;
    }

    @ApiOperation(value = "删除项目进度信息",notes = "")
    @PostMapping("/DeletePlan")
    public JsonResult DeletePlan(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        int i = planService.DeletePlan(map);
        if (i==1){
            jsonResult.setCode(200);
            jsonResult.setMessage("删除成功!");
        }else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("删除失败!");
        }
        return jsonResult;
    }

    @ApiOperation(value = "修改项目进度信息",notes = "")
    @PostMapping("/UpdatePlan")
    public JsonResult UpdatePlan(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        Section section=sectionService.FindSectionById(map);
        int Days = 0;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            long time = sdf.parse((String) map.get("start_time")).getTime();
            long time1 = sdf.parse((String) map.get("end_time")).getTime();
            Days = (int) ((time1 -time) /(24 * 60 * 60 * 1000));//计算计划天数
            map.put("plan_day",Days+1);

            long time2 = sdf.parse(section.getStart_time()).getTime();//总进度的开工时间
            int start_day=(int) ((time -time2) /(24 * 60 * 60 * 1000));
            int end_day=(int) ((time1 -time2) /(24 * 60 * 60 * 1000));
            map.put("end_day",end_day+1);
            map.put("start_day",start_day+1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        int i = planService.UpdatePlan(map);
        if (i==1){
            jsonResult.setCode(200);
            jsonResult.setMessage("修改成功!");
        }else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("修改失败!");
        }
        return jsonResult;
    }

    @ApiOperation(value = "分页查询项目进度信息",notes = "")
    @PostMapping("/FindPlan")
    public Page FindPlan(@RequestBody Map map){
        Page page = new Page();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(planService.Total(map));
        page.setItems(planService.FindPlan(map));
        return page;
    }

    @ApiOperation(value = "项目完成",notes = "")
    @PostMapping("/UpdateState2")
    public JsonResult UpdateState2(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date now = new Date();
        String time2 = format.format(now);
        map.put("practical_time",time2);
        int i = planService.UpdateState2(map);
        if (i==1){
            jsonResult.setCode(200);
            jsonResult.setMessage("修改成功!");
        }else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("修改失败!");
        }
        return jsonResult;
    }
}
