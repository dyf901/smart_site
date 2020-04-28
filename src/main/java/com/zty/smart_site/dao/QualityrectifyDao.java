package com.zty.smart_site.dao;

import com.zty.smart_site.entity.Qualityrectify;

import java.util.List;
import java.util.Map;

public interface QualityrectifyDao {
    //增加整改通知单
    int InsertQualityrectify(Map map);

    //删除整改通知单
    int DeleteQualityrectify(Map map);

    //修改整改通知单
    int UpdateQualityrectify(Map map);

    //分页模糊查询整改通知单信息
    List<Qualityrectify> FindQualityrectify(Map map);

    //统计总数
    long Total(Map map);

    //根据qualityshow_id查询整改通知单信息
    Qualityrectify FindQualityrectifyByqualityshowId(Map map);

    //分页模糊查询整改通知单信息PC
    List<Qualityrectify> FindQualityrectifyPC(Map map);

    //统计总数PC
    long TotalPC(Map map);
}
