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

    //修改节点状态
    @Override
    public int UpdateIsParent(Map map) {
        return progressStaffingDao.UpdateIsParent(map);
    }

    //修改实际开始时间
    @Override
    public int UpdatePracticalStart(int id) {
        return progressStaffingDao.UpdatePracticalStart(id);
    }

    //修改实际结束时间
    @Override
    public int UpdatePracticalEnd(int id) {
        return progressStaffingDao.UpdatePracticalEnd(id);
    }

    //根据标段id查询
    @Override
    public List<ProgressStaffing> FindProgressStaffingBySectionId(Map map) {
        return progressStaffingDao.FindProgressStaffingBySectionId(map);
    }

    //根据id查询信息
    @Override
    public ProgressStaffing FindById(int id) {
        return progressStaffingDao.FindById(id);
    }
}
