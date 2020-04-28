package com.zty.smart_site.service;

import com.zty.smart_site.dao.QualityshowDao;
import com.zty.smart_site.entity.Qualityshow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class QualityshowService implements QualityshowDao {
    @Autowired
    private QualityshowDao qualityshowDao;


    @Override
    public int InsertQualityshow(Map map) {
        return qualityshowDao.InsertQualityshow(map);
    }

    @Override
    public int DeleteQualityshow(Map map) {
        return qualityshowDao.DeleteQualityshow(map);
    }

    @Override
    public Qualityshow FindQualityshowById(Map map) {
        return qualityshowDao.FindQualityshowById(map);
    }

    @Override
    public List<Qualityshow> FindQualityshow(Map map) {
        return qualityshowDao.FindQualityshow(map);
    }

    @Override
    public long Total(Map map) {
        return qualityshowDao.Total(map);
    }

    @Override
    public List<Qualityshow> FindQualityshow_JCJL(Map map) {
        return qualityshowDao.FindQualityshow_JCJL(map);
    }

    @Override
    public long Total_JCJL(Map map) {
        return qualityshowDao.Total_JCJL(map);
    }

    @Override
    public List<Qualityshow> FindQualityshow_WXJL(Map map) {
        return qualityshowDao.FindQualityshow_WXJL(map);
    }

    @Override
    public long Total_WXJL(Map map) {
        return qualityshowDao.Total_WXJL(map);
    }

    @Override
    public List<Qualityshow> FindQualityshow_DZG(Map map) {
        return qualityshowDao.FindQualityshow_DZG(map);
    }

    @Override
    public long Total_DZG(Map map) {
        return qualityshowDao.Total_DZG(map);
    }

    @Override
    public List<Qualityshow> FindQualityshow_ZGFC(Map map) {
        return qualityshowDao.FindQualityshow_ZGFC(map);
    }

    @Override
    public long Total_ZGFC(Map map) {
        return qualityshowDao.Total_ZGFC(map);
    }

    @Override
    public List<Qualityshow> FindQualityshow_JCJL_PC(Map map) {
        return qualityshowDao.FindQualityshow_JCJL_PC(map);
    }

    @Override
    public long Total_JCJL_PC(Map map) {
        return qualityshowDao.Total_JCJL_PC(map);
    }

    @Override
    public List<Qualityshow> FindQualityshow_DZG_PC(Map map) {
        return qualityshowDao.FindQualityshow_DZG_PC(map);
    }

    @Override
    public long Total_DGZ_PC(Map map) {
        return qualityshowDao.Total_DGZ_PC(map);
    }

    @Override
    public List<Qualityshow> FindQualityshow_YZG_PC(Map map) {
        return qualityshowDao.FindQualityshow_YZG_PC(map);
    }

    @Override
    public long Total_YZG_PC(Map map) {
        return qualityshowDao.Total_YZG_PC(map);
    }

    @Override
    public List<Qualityshow> FindQualityshow_ZGDY_PC(Map map) {
        return qualityshowDao.FindQualityshow_ZGDY_PC(map);
    }

    @Override
    public long Total_ZGDY_PC(Map map) {
        return qualityshowDao.Total_ZGDY_PC(map);
    }

    @Override
    public List<Qualityshow> FindQualityshowByStaffIdALL(Map map) {
        return qualityshowDao.FindQualityshowByStaffIdALL(map);
    }

    @Override
    public int UpdateActiveY(Map map) {
        return qualityshowDao.UpdateActiveY(map);
    }

    @Override
    public int UpdateActiveW(Map map) {
        return qualityshowDao.UpdateActiveW(map);
    }

    @Override
    public int UpdatePlanTime(Map map) {
        return qualityshowDao.UpdatePlanTime(map);
    }

    @Override
    public int UpdateZgUrl(Map map) {
        return qualityshowDao.UpdateZgUrl(map);
    }

    @Override
    public int UpdateActiveYZG(Map map) {
        return qualityshowDao.UpdateActiveYZG(map);
    }

    @Override
    public int UpdateActiveCQWZG(Map map) {
        return qualityshowDao.UpdateActiveCQWZG(map);
    }

    @Override
    public int UpdateStatusH(Map map) {
        return qualityshowDao.UpdateStatusH(map);
    }

    @Override
    public int UpdateStatusB(Map map) {
        return qualityshowDao.UpdateStatusB(map);
    }

    @Override
    public int CountQualityShow(Map map) {
        return qualityshowDao.CountQualityShow(map);
    }

    @Override
    public int CountQualityShowByYZG(Map map) {
        return qualityshowDao.CountQualityShowByYZG(map);
    }

    @Override
    public int CountQualityShowByWZG(Map map) {
        return qualityshowDao.CountQualityShowByWZG(map);
    }

    @Override
    public int CountQualityShowByCQWZG(Map map) {
        return qualityshowDao.CountQualityShowByCQWZG(map);
    }

    @Override
    public int find_month() {
        return qualityshowDao.find_month();
    }

    @Override
    public int find_qualityshow_top(Map map) {
        return qualityshowDao.find_qualityshow_top(map);
    }

    @Override
    public int find_qualityshow_mid(Map map) {
        return qualityshowDao.find_qualityshow_mid(map);
    }

    @Override
    public int find_qualityshow_end(Map map) {
        return qualityshowDao.find_qualityshow_end(map);
    }

    @Override
    public int find_qualityshow_top_y(Map map) {
        return qualityshowDao.find_qualityshow_top_y(map);
    }

    @Override
    public int find_qualityshow_mid_y(Map map) {
        return qualityshowDao.find_qualityshow_mid_y(map);
    }

    @Override
    public int find_qualityshow_end_y(Map map) {
        return qualityshowDao.find_qualityshow_end_y(map);
    }

    @Override
    public List<Qualityshow> CountQualityshowByQualityId(Map map) {
        return qualityshowDao.CountQualityshowByQualityId(map);
    }

    @Override
    public List<Qualityshow> CountQualityshowBySubId(Map map) {
        return qualityshowDao.CountQualityshowBySubId(map);
    }
}
