package com.zty.smart_site.controller;

import com.zty.smart_site.service.BehaviorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(description = "行为类型接口")
@RestController
@RequestMapping("behavior")
@CrossOrigin
public class BehaviorController {
    @Autowired
    private BehaviorService behaviorService;//行为类型

    @ApiOperation(value = "增加行为类型",notes = "")
    @PostMapping("/InsertBehavior")

}
