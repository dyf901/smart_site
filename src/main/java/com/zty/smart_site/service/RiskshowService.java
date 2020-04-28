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

    //根据id查询安全隐患记录
    @Override
    public Riskshow FindRiskshowById(Map map) {
        return riskshowDao.FindRiskshowById(map);
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

    //分页模糊查询安全隐患记录_检查记录
    @Override
    public List<Riskshow> FindRiskshow_JCJL(Map map) {
        return riskshowDao.FindRiskshow_JCJL(map);
    }

    //统计总数_检查记录
    @Override
    public long Total_JCJL(Map map) {
        return riskshowDao.Total_JCJL(map);
    }

    //分页模糊查询安全隐患记录_无效记录
    @Override
    public List<Riskshow> FindRiskshow_WXJL(Map map) {
        return riskshowDao.FindRiskshow_WXJL(map);
    }

    //统计总数_无效记录
    @Override
    public long Total_WXJL(Map map) {
        return riskshowDao.Total_WXJL(map);
    }

    //分页模糊查询安全隐患记录_待整改
    @Override
    public List<Riskshow> FindRiskshow_DZG(Map map) {
        return riskshowDao.FindRiskshow_DZG(map);
    }

    //统计总数_待整改
    @Override
    public long Total_DZG(Map map) {
        return riskshowDao.Total_DZG(map);
    }

    //分页模糊查询安全隐患记录_整改复查
    @Override
    public List<Riskshow> FindRiskshow_ZGFC(Map map) {
        return riskshowDao.FindRiskshow_ZGFC(map);
    }

    //统计总数_整改复查
    @Override
    public long Total_ZGFC(Map map) {
        return riskshowDao.Total_ZGFC(map);
    }

    //分页模糊查询隐患记录_检查记录_PC
    @Override
    public List<Riskshow> FindRiskshow_JCJL_PC(Map map) {
        return riskshowDao.FindRiskshow_JCJL_PC(map);
    }

    //统计总数
    @Override
    public long Total_JCJL_PC(Map map) {
        return riskshowDao.Total_JCJL_PC(map);
    }

    //分页模糊查询隐患记录_待整改_PC
    @Override
    public List<Riskshow> FindRiskshow_DZG_PC(Map map) {
        return riskshowDao.FindRiskshow_DZG_PC(map);
    }

    //统计总数
    @Override
    public long Total_DGZ_PC(Map map) {
        return riskshowDao.Total_DGZ_PC(map);
    }

    //分页模糊查询隐患记录_已整改_PC
    @Override
    public List<Riskshow> FindRiskshow_YZG_PC(Map map) {
        return riskshowDao.FindRiskshow_YZG_PC(map);
    }

    //统计总数
    @Override
    public long Total_YZG_PC(Map map) {
        return riskshowDao.Total_YZG_PC(map);
    }

    //分页模糊查询隐患记录_整改待验_PC
    @Override
    public List<Riskshow> FindRiskshow_ZGDY_PC(Map map) {
        return riskshowDao.FindRiskshow_ZGDY_PC(map);
    }

    //统计总数
    @Override
    public long Total_ZGDY_PC(Map map) {
        return riskshowDao.Total_ZGDY_PC(map);
    }

    @Override
    public List<Riskshow> FindRiskshowByStaffIdALL(Map map) {
        return riskshowDao.FindRiskshowByStaffIdALL(map);
    }

    //修改安全隐患状态(有效)
    @Override
    public int UpdateActiveY(Map map) {
        return riskshowDao.UpdateActiveY(map);
    }

    //修改安全隐患状态(无效)
    @Override
    public int UpdateActiveW(Map map) {
        return riskshowDao.UpdateActiveW(map);
    }

    //修改安全隐患计划整改时间
    @Override
    public int UpdatePlanTime(Map map) {
        return riskshowDao.UpdatePlanTime(map);
    }

    //整改上报
    @Override
    public int UpdateZgUrl(Map map) {
        return riskshowDao.UpdateZgUrl(map);
    }

    //修改安全隐患状态(已整改)
    @Override
    public int UpdateActiveYZG(Map map) {
        return riskshowDao.UpdateActiveYZG(map);
    }

    //修改安全隐患状态(超期未整改)
    @Override
    public int UpdateActiveCQWZG(Map map) {
        return riskshowDao.CountRiskShowByCQWZG(map);
    }

    //修改安全隐患整改状态(合格)
    @Override
    public int UpdateStatusH(Map map) {
        return riskshowDao.UpdateStatusH(map);
    }

    //修改安全隐患整改状态(不合格)
    @Override
    public int UpdateStatusB(Map map) {
        return riskshowDao.UpdateStatusB(map);
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

    //返回本月份
    @Override
    public int find_month() {
        return riskshowDao.find_month();
    }

    //查询当月上旬数据的条数
    @Override
    public int find_riskshow_top(Map map) {
        return riskshowDao.find_riskshow_top(map);
    }

    //查询当月中旬数据的条数
    @Override
    public int find_riskshow_mid(Map map) {
        return riskshowDao.find_riskshow_mid(map);
    }

    //查询当月下旬数据的条数
    @Override
    public int find_riskshow_end(Map map) {
        return riskshowDao.find_riskshow_end(map);
    }

    //查询当月上旬有效数据的条数
    @Override
    public int find_riskshow_top_y(Map map) {
        return riskshowDao.find_riskshow_top_y(map);
    }

    //查询当月中旬有效数据的条数
    @Override
    public int find_riskshow_mid_y(Map map) {
        return riskshowDao.find_riskshow_mid_y(map);
    }

    //查询当月下旬有效数据的条数
    @Override
    public int find_riskshow_end_y(Map map) {
        return riskshowDao.find_riskshow_end_y(map);
    }

    //根据隐患类型查询数量总数
    @Override
    public List<Riskshow> CountRiskshowByRiskId(Map map) {
        return riskshowDao.CountRiskshowByRiskId(map);
    }

    //根据分包单位查询数量总数
    @Override
    public List<Riskshow> CountRiskshowBySubId(Map map) {
        return riskshowDao.CountRiskshowBySubId(map);
    }

    //积分前三
    @Override
    public List<Riskshow> find_riskshow_awarda(Map map) {
        return riskshowDao.find_riskshow_awarda(map);
    }
}
