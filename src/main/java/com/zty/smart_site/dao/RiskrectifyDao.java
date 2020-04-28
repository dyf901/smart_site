package com.zty.smart_site.dao;

import com.zty.smart_site.entity.Riskrectify;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface RiskrectifyDao {
    //增加整改通知单
    int InsertRiskrectify(Map map);

    //删除整改通知单
    int DeleteRiskrectify(Map map);

    //修改整改通知单
    int UpdateRiskrectify(Map map);

    //分页模糊查询整改通知单信息
    List<Riskrectify> FindRiskrectify(Map map);

    //统计总数
    long Total(Map map);

    //根据riskshow_id查询整改通知单信息
    Riskrectify FindRiskrectifyByriskshowId(Map map);

    //分页模糊查询整改通知单信息
    List<Riskrectify> FindRiskrectifyPC(Map map);

    //统计总数
    long TotalPC(Map map);
}
