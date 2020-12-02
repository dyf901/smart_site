package com.zty.smart_site.controller;

import com.zty.smart_site.entity.Environment;
import com.zty.smart_site.entity.JsonResult;
import com.zty.smart_site.page.Page;
import com.zty.smart_site.service.EnvironmentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Api(description = "扬尘检测仪接口")
@RestController
@RequestMapping("Environment")
@CrossOrigin
public class EnvironmentController {
    @Autowired
    private EnvironmentService environmentService;

    @ApiOperation(value = "增加扬尘检测仪数据" , notes = "")
    @PostMapping("/InsertEnvironment")
    public void InsertEnvironment(@RequestBody Map map){
        System.out.println("数据过来了:"+map);
        int wd = (Integer) map.get("wd");
        if(wd==0){
            map.put("wd","北");
        }else if (wd==1){
            map.put("wd","东北");
        }else if (wd==2){
            map.put("wd","东");
        }else if (wd==3){
            map.put("wd","东南");
        }else if (wd==4){
            map.put("wd","南");
        }else if (wd==5){
            map.put("wd","西南");
        }else if (wd==6){
            map.put("wd","西");
        }else if (wd==7){
            map.put("wd","西北");
        }
        environmentService.InsertEnvironment(map);
    }

    @ApiOperation(value = "查询最近一条扬尘检测仪数据" , notes = "")
    @PostMapping("/FindEnvironment")
    public JsonResult FindEnvironment(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        Environment environment = environmentService.FindEnvironment(map);
        if(environment!=null){
            jsonResult.setData(environment);
            jsonResult.setCode(200);
        }else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("未找到数据");
        }
        return jsonResult;
    }

    @ApiOperation(value = "历史数据" , notes = "")
    @PostMapping("/FindEnvironmentList")
    public Page FindEnvironmentList(@RequestBody Map map){
        Page page = new Page();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(environmentService.Total());
        page.setItems(environmentService.FindEnvironmentList(map));
        return page;
    }

    @ApiOperation(value = "环境因子分析" , notes = "")
    @PostMapping("/HJFX")
    public List<Environment> HJFX(){
        return environmentService.HJFX();
    }
}
