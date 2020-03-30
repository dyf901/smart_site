package com.zty.smart_site.service;

import com.zty.smart_site.dao.QualityshowDao;
import com.zty.smart_site.entity.Qualityshow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class QualityshowService implements QualityshowDao {
    @Autowired
    private QualityshowDao qualityshowDao;//质量隐患

    //增加质量安全隐患记录
    @Override
    public int InsertQualityShow(Map map) {
        return qualityshowDao.InsertQualityShow(map);
    }

    //删除质量安全隐患记录
    @Override
    public int DeleteQualityShow(Map map) {
        return qualityshowDao.DeleteQualityShow(map);
    }

    //分页模糊查询质量安全隐患记录
    @Override
    public List<Qualityshow> FindQualityShow(Map map) {
        return qualityshowDao.FindQualityShow(map);
    }

    //统计总数
    @Override
    public long Total(Map map) {
        return qualityshowDao.Total(map);
    }
}
