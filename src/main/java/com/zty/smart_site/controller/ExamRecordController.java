package com.zty.smart_site.controller;

import com.zty.smart_site.service.ExamRecordService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(description = "考试记录接口")
@RestController
@RequestMapping("examRecord")
@CrossOrigin
public class ExamRecordController {
    @Autowired
    private ExamRecordService examRecordService;


}
