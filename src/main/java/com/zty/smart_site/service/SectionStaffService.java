package com.zty.smart_site.service;

import com.zty.smart_site.dao.SectionStaffDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SectionStaffService {
    @Autowired
    private SectionStaffDao sectionStaffDao;//管理人员
}
