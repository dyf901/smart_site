package com.zty.smart_site.service;

import com.zty.smart_site.dao.RiskshowDao;
import com.zty.smart_site.entity.Riskshow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class RiskshowService implements RiskshowDao {
    @Autowired
    private RiskshowDao riskshowDao;//安全隐患

    //增加安全隐患信息记录
    @Override
    public int InsertRiskshow(Map map) {
        return riskshowDao.InsertRiskshow(map);
    }

    //删除安全隐患记录
    @Override
    public int DeleteRiskshow(Map map) {
        return riskshowDao.DeleteRiskshow(map);
    }

    //分页模糊查询安全隐患记录
    @Override
    public List<Riskshow> FindRiskshow(Map map) {
        return riskshowDao.FindRiskshow(map);
    }

    //统计总数
    @Override
    public long Total(Map map) {
        return riskshowDao.Total(map);
    }

    //统计安全隐患数量
    @Override
    public int CountRiskShow(Map map) {
        return riskshowDao.CountRiskShow(map);
    }

    //统计安全隐患数量_已整改
    @Override
    public int CountRiskShowByYZG(Map map) {
        return riskshowDao.CountRiskShowByYZG(map);
    }

    //统计安全隐患数量_未整改
    @Override
    public int CountRiskShowByWZG(Map map) {
        return riskshowDao.CountRiskShowByWZG(map);
    }

    //统计安全隐患数量_超期未整改
    @Override
    public int CountRiskShowByCQWZG(Map map) {
        return riskshowDao.CountRiskShowByCQWZG(map);
    }
}
