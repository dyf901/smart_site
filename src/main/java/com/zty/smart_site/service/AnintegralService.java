package com.zty.smart_site.service;

import com.zty.smart_site.dao.AnintegralDao;
import com.zty.smart_site.entity.Integral;
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
    public int InsertIntegral(Map map) {
        return anintegralDao.InsertIntegral(map);
    }

    @Override
    public List<Integral> FindIntegral(Map map) {
        return anintegralDao.FindIntegral(map);
    }
}
