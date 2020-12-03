package com.zty.smart_site.controller;

import com.zty.smart_site.entity.TrainContentW;
import com.zty.smart_site.service.TrainContentWService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Api(description = "公共展馆体验接口")
@RestController
@RequestMapping("TrainContentW")
@CrossOrigin
public class TrainContentWController {
    @Autowired
    private TrainContentWService trainContentWService;

    @ApiOperation(value = "根据id查询公共展馆体验" , notes = "")
    @PostMapping("/FindTrainContentW")
    public TrainContentW FindTrainContentW(@RequestBody Map map) {
        return trainContentWService.FindTrainContentW(map);
    }

    @ApiOperation(value = "查询全部公共展馆体验" , notes = "")
    @PostMapping("/FindTrainContentWAll")
    public List<TrainContentW> FindTrainContentWAll(@RequestBody Map map) {
        return trainContentWService.FindTrainContentWAll();
    }
}
