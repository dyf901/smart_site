package com.zty.smart_site.service;

import com.zty.smart_site.dao.AiMonitoringDao;
import com.zty.smart_site.entity.AiMonitoring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AiMonitoringService implements AiMonitoringDao {
    @Autowired
    private AiMonitoringDao aiMonitoringDao;

    //增加Ai监控信息
    @Override
    public int InsertAiMonitoring(Map map) {
        return aiMonitoringDao.InsertAiMonitoring(map);
    }

    //查询Ai监控信息
    @Override
    public List<AiMonitoring> FindAiMonitoring(Map map) {
        return aiMonitoringDao.FindAiMonitoring(map);
    }

    //下拉框状态
    @Override
    public List<AiMonitoring> SelectOption() {
        return aiMonitoringDao.SelectOption();
    }
}
