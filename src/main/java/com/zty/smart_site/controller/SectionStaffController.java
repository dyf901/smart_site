package com.zty.smart_site.controller;

import com.zty.smart_site.service.SectionStaffService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(description = "标段管理人员接口")
@RestController
@RequestMapping("sectionStaff")
@CrossOrigin
public class SectionStaffController {
    @Autowired
    private SectionStaffService sectionStaffService;//管理人员
}
