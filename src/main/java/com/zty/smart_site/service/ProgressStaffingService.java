package com.zty.smart_site.service;

import com.zty.smart_site.dao.ProgressStaffingDao;
import com.zty.smart_site.entity.ProgressStaffing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ProgressStaffingService implements ProgressStaffingDao {
    @Autowired
    private ProgressStaffingDao progressStaffingDao;

    //增加编制进度
    @Override
    public int InsertProgressStaffing(Map map) {
        return progressStaffingDao.InsertProgressStaffing(map);
    }

    @Override
    public int UpdateIsParent(Map map) {
        return progressStaffingDao.UpdateIsParent(map);
    }

    //根据标段id查询
    @Override
    public List<ProgressStaffing> FindProgressStaffingBySectionId(Map map) {
        return progressStaffingDao.FindProgressStaffingBySectionId(map);
    }
}
