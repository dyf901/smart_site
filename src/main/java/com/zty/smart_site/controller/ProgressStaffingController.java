package com.zty.smart_site.controller;

import com.zty.smart_site.entity.JsonResult;
import com.zty.smart_site.entity.ProgressStaffing;
import com.zty.smart_site.service.ProgressStaffingService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Api(description = "编制进度接口")
@RestController
@RequestMapping("ProgressStaffing")
@CrossOrigin
public class ProgressStaffingController {
    @Autowired
    private ProgressStaffingService progressStaffingService;

    @ApiOperation(value = "增加编制进度" , notes = "")
    @PostMapping("/InsertProgressStaffing")
    public boolean InsertProgressStaffing(@RequestBody Map map) {

        progressStaffingService.UpdateIsParent(map);
        return progressStaffingService.InsertProgressStaffing(map) == 1;
    }

    @ApiOperation(value = "根据标段id查询编制进度" , notes = "")
    @PostMapping("/FindProgressStaffingBySectionId")
    public List<ProgressStaffing> FindProgressStaffingBySectionId(@RequestBody Map map) {
        return progressStaffingService.FindProgressStaffingBySectionId(map);
    }

    @ApiOperation(value = "进度跟踪",notes = "")
    @PostMapping("/ProgressTracking")
    public JsonResult ProgressTracking(@RequestBody Map map){
        System.out.println(map);
        System.out.println(map.get("list"));
        List list = (List) map.get("list");

        for(int i=0;i<list.size();i++){
            int o= (int) list.get(i);
            ProgressStaffing progressStaffing = progressStaffingService.FindById(o);
            System.out.println(progressStaffing);
            System.out.println(progressStaffing.getPractical_start());
            if(progressStaffing.getPractical_start().equals("0000-00-00")){
                System.out.println("1");
                progressStaffingService.UpdatePracticalStart(o);
                System.out.println("2");
                progressStaffingService.UpdatePracticalEnd(o);
                System.out.println("3");
            }else {
                System.out.println("asd");
                progressStaffingService.UpdatePracticalEnd(o);
            }
            menuChild(progressStaffing.getFatherid());


        }
        JsonResult jsonResult = new JsonResult();
        return jsonResult;
    }

    public void menuChild(int id) { //子集查找遍历
        ProgressStaffing progressStaffing = progressStaffingService.FindById(id);

            if (progressStaffing!=null) {
                if (progressStaffing.getPractical_start().equals("0000-00-00")){
                    System.out.println("4");
                    progressStaffingService.UpdatePracticalStart(id);
                    System.out.println("5");
                    progressStaffingService.UpdatePracticalEnd(id);
                    System.out.println("6");
                }else {
                    System.out.println("zxc");
                    progressStaffingService.UpdatePracticalEnd(id);
                }
                 menuChild(progressStaffing.getFatherid());
            }

    }
}
