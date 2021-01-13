package com.zty.smart_site.dao;

import com.zty.smart_site.entity.Milestone;

import java.util.List;
import java.util.Map;

public interface MilestoneDao {
    //增加里程碑信息
    int InsertMilestone(Map map);

    //删除里程碑信息
    int DeleteMilestone(Map map);

    //修改里程碑信息
    int UpdateMilestone(Map map);

    //分页查询里程碑信息
    List<Milestone> FindMilestone(Map map);

    //统计总数
    long Total(Map map);

    //大屏_里程碑信息
    List<Milestone> SelectMilestone(Map map);

    //根据id查询里程碑信息
    Milestone FindMilestoneById(Map map);
}
