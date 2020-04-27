package com.zty.smart_site.dao;

import com.zty.smart_site.entity.ProgressStaffing;

import java.util.List;
import java.util.Map;

public interface ProgressStaffingDao {
    //增加编制进度
    int InsertProgressStaffing(Map map);

    //删除编制进度
    int DeleteProgressStaffing(Map map);

    //修改编制进度
    int UpdateProgressStaffing(Map map);

    //根据标段id查询
    List<ProgressStaffing> FindProgressStaffingBySectionId(Map map);
}
