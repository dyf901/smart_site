package com.zty.smart_site.controller;

import com.zty.smart_site.service.WorktypeService;
import com.zty.smart_site.util.ProvinceUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Api(description = "工种接口")
@RestController
@RequestMapping("worktype")
@CrossOrigin
public class WorktypeController {
    @Autowired
    private WorktypeService worktypeService;



    @ApiOperation(value = "ceshi",notes = "")
    @PostMapping("/test")
    public String Test(@RequestBody Map map){
        String address= (String) map.get("address");
        String asd= (String) ProvinceUtil.Province(address);
        return asd;
    }
}
