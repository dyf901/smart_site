package com.zty.smart_site.service;

import com.zty.smart_site.dao.MilestoneDao;
import com.zty.smart_site.entity.Milestone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class MilestoneService implements MilestoneDao {
    @Autowired
    private MilestoneDao milestoneDao;

    //增加里程碑信息
    @Override
    public int InsertMilestone(Map map) {
        return milestoneDao.InsertMilestone(map);
    }

    //删除里程碑信息
    @Override
    public int DeleteMilestone(Map map) {
        return milestoneDao.DeleteMilestone(map);
    }

    //修改里程碑信息
    @Override
    public int UpdateMilestone(Map map) {
        return milestoneDao.UpdateMilestone(map);
    }

    //分页查询里程碑信息
    @Override
    public List<Milestone> FindMilestone(Map map) {
        return milestoneDao.FindMilestone(map);
    }

    //统计总数
    @Override
    public long Total(Map map) {
        return milestoneDao.Total(map);
    }

    //大屏_里程碑信息
    @Override
    public List<Milestone> SelectMilestone(Map map) {
        return milestoneDao.SelectMilestone(map);
    }
}
