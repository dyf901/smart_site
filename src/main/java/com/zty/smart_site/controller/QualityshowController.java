package com.zty.smart_site.controller;

import com.zty.smart_site.service.QualityshowService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(description = "质量隐患记录接口")
@RestController
@RequestMapping("qualityshow")
@CrossOrigin
public class QualityshowController {
    @Autowired
    private QualityshowService qualityshowService;


}
