package com.zty.smart_site.service;

import com.zty.smart_site.dao.RiskDao;
import com.zty.smart_site.entity.Risk;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class RiskService implements RiskDao {
    @Autowired
    private RiskDao riskDao;//安全隐患类型

    //增加安全隐患类型
    @Override
    public int InsertRisk(Map map) {
        return riskDao.InsertRisk(map);
    }

    //删除安全隐患类型
    @Override
    public int DeleteRisk(Map map) {
        return riskDao.DeleteRisk(map);
    }

    //修改安全隐患类型
    @Override
    public int UpdateRisk(Map map) {
        return riskDao.UpdateRisk(map);
    }

    //分页模糊查询安全隐患类型
    @Override
    public List<Risk> FindRisk(Map map) {
        return riskDao.FindRisk(map);
    }

    //统计总数
    @Override
    public long Total(Map map) {
        return riskDao.Total(map);
    }

    //下拉框查询安全隐患类型
    @Override
    public List<Risk> SelectRisk(Map map) {
        return riskDao.SelectRisk(map);
    }
}
