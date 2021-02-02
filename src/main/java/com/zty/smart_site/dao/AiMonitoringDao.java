package com.zty.smart_site.dao;

import com.zty.smart_site.entity.AiMonitoring;

import java.util.List;
import java.util.Map;

public interface AiMonitoringDao {
    //增加Ai监控信息
    int InsertAiMonitoring(Map map);

    //查询Ai监控信息
    List<AiMonitoring> FindAiMonitoring(Map map);

    //下拉框状态
    List<AiMonitoring> SelectOption();
}
