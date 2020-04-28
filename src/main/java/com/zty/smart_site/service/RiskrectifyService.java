package com.zty.smart_site.service;

import com.zty.smart_site.dao.RiskrectifyDao;
import com.zty.smart_site.entity.Riskrectify;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class RiskrectifyService implements RiskrectifyDao {
    @Autowired
    private RiskrectifyDao riskrectifyDao;

    //增加整改通知单
    @Override
    public int InsertRiskrectify(Map map) {
        return riskrectifyDao.InsertRiskrectify(map);
    }

    //删除整改通知单
    @Override
    public int DeleteRiskrectify(Map map) {
        return riskrectifyDao.DeleteRiskrectify(map);
    }

    //修改整改通知单
    @Override
    public int UpdateRiskrectify(Map map) {
        return riskrectifyDao.UpdateRiskrectify(map);
    }

    //分页模糊查询整改通知单信息
    @Override
    public List<Riskrectify> FindRiskrectify(Map map) {
        return riskrectifyDao.FindRiskrectify(map);
    }

    //统计总数
    @Override
    public long Total(Map map) {
        return riskrectifyDao.Total(map);
    }

    @Override
    public Riskrectify FindRiskrectifyByriskshowId(Map map) {
        return riskrectifyDao.FindRiskrectifyByriskshowId(map);
    }

    @Override
    public List<Riskrectify> FindRiskrectifyPC(Map map) {
        return riskrectifyDao.FindRiskrectifyPC(map);
    }

    @Override
    public long TotalPC(Map map) {
        return riskrectifyDao.TotalPC(map);
    }
}
