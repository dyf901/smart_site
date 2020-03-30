package com.zty.smart_site.dao;

import com.zty.smart_site.entity.Riskshow;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface RiskshowDao {
    //增加安全隐患信息记录
    int InsertRiskshow(Map map);

    //删除安全隐患记录
    int DeleteRiskshow(Map map);

    //分页模糊查询安全隐患记录
    List<Riskshow> FindRiskshow(Map map);

    //统计总数
    long Total(Map map);

    //统计安全隐患数量
    int CountRiskShow(Map map);

    //统计安全隐患数量_已整改
    int CountRiskShowByYZG(Map map);

    //统计安全隐患数量_未整改
    int CountRiskShowByWZG(Map map);

    //统计安全隐患数量_超期未整改
    int CountRiskShowByCQWZG(Map map);
}
