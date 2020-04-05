package com.zty.smart_site.service;

import com.zty.smart_site.dao.AnintegralDao;
import com.zty.smart_site.entity.Anintegral;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AnintegralService implements AnintegralDao {
    @Autowired
    private AnintegralDao anintegralDao;

    //增加积分明细
    @Override
    public int InsertAnintegral(Map map) {
        return anintegralDao.InsertAnintegral(map);
    }

    //分页查询查询积分明细
    @Override
    public List<Anintegral> FindAnintegral(Map map) {
        return anintegralDao.FindAnintegral(map);
    }

    //统计总数
    @Override
    public long Total(Map map) {
        return anintegralDao.Total(map);
    }
}
