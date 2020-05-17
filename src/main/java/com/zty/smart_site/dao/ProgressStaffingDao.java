package com.zty.smart_site.dao;

import com.zty.smart_site.entity.ProgressStaffing;

import java.util.List;
import java.util.Map;

public interface ProgressStaffingDao {
    //增加编制进度
    int InsertProgressStaffing(Map map);

    //修改节点状态
    int UpdateIsParent(Map map);

    //修改实际开始时间
    int UpdatePracticalStart(int id);

    //修改实际结束时间
    int UpdatePracticalEnd(int id);

    //根据标段id查询
    List<ProgressStaffing> FindProgressStaffingBySectionId(Map map);

    ProgressStaffing FindById(int id);
}
