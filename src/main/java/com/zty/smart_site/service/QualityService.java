package com.zty.smart_site.service;

import com.zty.smart_site.dao.QualityDao;
import com.zty.smart_site.entity.Quality;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class QualityService implements QualityDao {
    @Autowired
    private QualityDao qualityDao;//质量隐患类型

    //增加质量隐患类型
    @Override
    public int InsertQuality(Map map) {
        return qualityDao.InsertQuality(map);
    }

    //删除质量隐患类型
    @Override
    public int DeleteQuality(Map map) {
        return qualityDao.DeleteQuality(map);
    }

    //修改质量隐患类型
    @Override
    public int UpdateQuality(Map map) {
        return qualityDao.UpdateQuality(map);
    }

    //分页模糊查询质量隐患类型
    @Override
    public List<Quality> FindQuality(Map map) {
        return qualityDao.FindQuality(map);
    }

    //统计总数
    @Override
    public long Total(Map map) {
        return qualityDao.Total(map);
    }

    //下拉框查询质量隐患类型
    @Override
    public List<Quality> SelectQuality(Map map) {
        return qualityDao.SelectQuality(map);
    }
}
