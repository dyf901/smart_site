package com.zty.smart_site.service;

import com.zty.smart_site.dao.QualityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QualityService implements QualityDao {
    @Autowired
    private QualityDao qualityDao;//质量隐患类型

}
