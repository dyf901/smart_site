package com.zty.smart_site.controller;

import com.zty.smart_site.entity.TrainContent;
import com.zty.smart_site.service.TrainContentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Api(description = "展馆体验接口")
@RestController
@RequestMapping("traincontent")
@CrossOrigin
public class TrainContentController {
    @Autowired
    private TrainContentService trainContentService;

    @ApiOperation(value = "根据id查询培训内容" , notes = "")
    @PostMapping("/FindTrainContent")
    public TrainContent FindTrainContent(@RequestBody Map map) {
        return trainContentService.FindTrainContent(map);
    }

    @ApiOperation(value = "查询全部展馆体验" , notes = "")
    @PostMapping("/FindTrainContentAll")
    public List<TrainContent> FindTrainContentAll(@RequestBody Map map) {
        return trainContentService.FindTrainContentAll();
    }
}
