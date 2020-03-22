package com.zty.smart_site.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(description = "App端统计图数据接口")
@RestController
@RequestMapping("count_App")
@CrossOrigin
public class AppCountController {
}
