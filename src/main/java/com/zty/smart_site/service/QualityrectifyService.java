package com.zty.smart_site.service;

import com.zty.smart_site.dao.QualityrectifyDao;
import com.zty.smart_site.entity.Qualityrectify;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class QualityrectifyService implements QualityrectifyDao {
    @Autowired
    private QualityrectifyDao qualityrectifyDao;//质量整改单

    //增加整改通知单
    @Override
    public int InsertQualityrectify(Map map) {
        return qualityrectifyDao.InsertQualityrectify(map);
    }

    //删除整改通知单
    @Override
    public int DeleteQualityrectify(Map map) {
        return qualityrectifyDao.DeleteQualityrectify(map);
    }

    //修改整改通知单
    @Override
    public int UpdateQualityrectify(Map map) {
        return qualityrectifyDao.UpdateQualityrectify(map);
    }

    //分页模糊查询整改通知单信息
    @Override
    public List<Qualityrectify> FindQualityrectify(Map map) {
        return qualityrectifyDao.FindQualityrectify(map);
    }

    //统计总数
    @Override
    public long Total(Map map) {
        return qualityrectifyDao.Total(map);
    }

    //根据qualityshow_id查询整改通知单信息
    @Override
    public Qualityrectify FindQualityrectifyByqualityshowId(Map map) {
        return qualityrectifyDao.FindQualityrectifyByqualityshowId(map);
    }

    @Override
    public List<Qualityrectify> FindQualityrectifyPC(Map map) {
        return qualityrectifyDao.FindQualityrectifyPC(map);
    }

    @Override
    public long TotalPC(Map map) {
        return qualityrectifyDao.TotalPC(map);
    }
}
