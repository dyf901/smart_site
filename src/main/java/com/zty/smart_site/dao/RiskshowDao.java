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

    //返回本月份
    int find_month();

    //查询当月上旬数据的条数
    int find_riskshow_top(Map map);

    //查询当月中旬数据的条数
    int find_riskshow_mid(Map map);

    //查询当月下旬数据的条数
    int find_riskshow_end(Map map);

    //查询当月上旬有效数据的条数
    int find_riskshow_top_y(Map map);

    //查询当月中旬有效数据的条数
    int find_riskshow_mid_y(Map map);

    //查询当月下旬有效数据的条数
    int find_riskshow_end_y(Map map);

    //根据隐患类型查询数量总数
    List<Riskshow> CountRiskshowByRiskId(Map map);

    //根据分包单位查询数量总数
    List<Riskshow> CountRiskshowBySubId(Map map);
}
