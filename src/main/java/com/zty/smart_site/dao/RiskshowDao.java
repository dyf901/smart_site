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

    //根据id查询安全隐患记录
    Riskshow FindRiskshowById(Map map);

    //分页模糊查询安全隐患记录
    List<Riskshow> FindRiskshow(Map map);

    //统计总数
    long Total(Map map);

    //分页模糊查询安全隐患记录_检查记录
    List<Riskshow> FindRiskshow_JCJL(Map map);

    //统计总数_检查记录
    long Total_JCJL(Map map);

    //分页模糊查询安全隐患记录_无效记录
    List<Riskshow> FindRiskshow_WXJL(Map map);

    //统计总数_无效记录
    long Total_WXJL(Map map);

    //分页模糊查询安全隐患记录_待整改
    List<Riskshow> FindRiskshow_DZG(Map map);

    //统计总数_待整改
    long Total_DZG(Map map);

    //分页模糊查询安全隐患记录_整改复查
    List<Riskshow> FindRiskshow_ZGFC(Map map);

    //统计总数_整改复查
    long Total_ZGFC(Map map);

    //分页模糊查询隐患记录_检查记录_PC
    List<Riskshow> FindRiskshow_JCJL_PC(Map map);

    //统计总数
    long Total_JCJL_PC(Map map);

    //分页模糊查询隐患记录_待整改_PC
    List<Riskshow> FindRiskshow_DZG_PC(Map map);

    //统计总数
    long Total_DGZ_PC(Map map);

    //分页模糊查询隐患记录_已整改_PC
    List<Riskshow> FindRiskshow_YZG_PC(Map map);

    //统计总数
    long Total_YZG_PC(Map map);

    //分页模糊查询隐患记录_整改待验_PC
    List<Riskshow> FindRiskshow_ZGDY_PC(Map map);

    //统计总数
    long Total_ZGDY_PC(Map map);

    //分页模糊查询隐患记录_整改待验_PC
    List<Riskshow> FindRiskshowByStaffIdALL(Map map);

    //修改安全隐患状态(有效)
    int UpdateActiveY(Map map);

    //修改安全隐患状态(无效)
    int UpdateActiveW(Map map);

    //修改安全隐患计划整改时间
    int UpdatePlanTime(Map map);

    //整改上报
    int UpdateZgUrl(Map map);

    //修改安全隐患状态(已整改)
    int UpdateActiveYZG(Map map);

    //修改安全隐患状态(超期未整改)
    int UpdateActiveCQWZG(Map map);

    //修改安全隐患整改状态(合格)
    int UpdateStatusH(Map map);

    //修改安全隐患整改状态(不合格)
    int UpdateStatusB(Map map);

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

    //积分前三
    List<Riskshow> find_riskshow_awarda(Map map);
}
