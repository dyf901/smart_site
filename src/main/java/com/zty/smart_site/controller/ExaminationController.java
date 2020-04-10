package com.zty.smart_site.controller;

import com.zty.smart_site.entity.JsonResult;
import com.zty.smart_site.service.ExaminationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Api(description = "试卷接口",value = "ExaminationController")
@RestController
@RequestMapping("examination")
@CrossOrigin
public class ExaminationController {
    @Autowired
    private ExaminationService examinationService;

    @ApiOperation(value = "增加试卷",notes = "传参")
    @PostMapping("/InsertExamination")
    public JsonResult InsertExamination(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        return jsonResult;
    }
}
