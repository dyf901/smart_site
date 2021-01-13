package com.zty.smart_site.controller;

import com.zty.smart_site.dao.DwDao;
import com.zty.smart_site.entity.Dw;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Api(description = "定位接口")
@RestController
@RequestMapping("Dw")
@CrossOrigin
public class DwController {
    @Autowired
    private DwDao dwService;

    @ApiOperation(value = "增加" , notes = "测试数据:")
    @PostMapping("/InsertDw")
    public void FindAnintegral(@RequestBody Map map) {
       Dw dw = dwService.FindDwBycarId(map);
       if (dw==null){
           dwService.InsertDw(map);
       }else {
           dwService.UpdateDw(map);
       }
    }

    @ApiOperation(value = "查询" , notes = "测试数据:")
    @PostMapping("/FindDw")
    public List<Dw> ndAnintegral1(@RequestBody Map map) {


       return dwService.FindDw();
    }
}
