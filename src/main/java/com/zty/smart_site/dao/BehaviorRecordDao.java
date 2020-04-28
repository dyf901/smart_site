package com.zty.smart_site.dao;

import com.zty.smart_site.entity.BehaviorRecord;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface BehaviorRecordDao {
    //增加行为记录
    int InsertBehaviorRecord(Map map);

    //删除行为记录
    int DeleteBehaviorRecord(Map map);

    //修改行为记录
    int UpdateBehaviorRecord(Map map);

    //分页模糊查询行为记录
    List<BehaviorRecord> FindBehaviorRecord(Map map);

    //统计总数
    long Total(Map map);

    //分页查询个人行为记录
    List<BehaviorRecord> FindBehaviorRecordByStaff_id(Map map);

    //统计个人记录总数
    long TotalByStaff_id(Map map);

    //测试
    List<BehaviorRecord> ceshi(Map map);

    //分页查询个人行为记录
    List<BehaviorRecord> FindBehaviorRecordByStaffIdALL(Map map);
}
