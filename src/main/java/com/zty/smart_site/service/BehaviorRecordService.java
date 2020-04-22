package com.zty.smart_site.service;

import com.zty.smart_site.dao.BehaviorRecordDao;
import com.zty.smart_site.entity.BehaviorRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BehaviorRecordService implements BehaviorRecordDao {
    @Autowired
    private BehaviorRecordDao behaviorRecordDao;//行为记录

    //增加行为记录
    @Override
    public int InsertBehaviorRecord(Map map) {
        return behaviorRecordDao.InsertBehaviorRecord(map);
    }

    //删除行为记录
    @Override
    public int DeleteBehaviorRecord(Map map) {
        return behaviorRecordDao.DeleteBehaviorRecord(map);
    }

    //修改行为记录
    @Override
    public int UpdateBehaviorRecord(Map map) {
        return behaviorRecordDao.UpdateBehaviorRecord(map);
    }

    //分页模糊查询行为记录
    @Override
    public List<BehaviorRecord> FindBehaviorRecord(Map map) {
        return behaviorRecordDao.FindBehaviorRecord(map);
    }

    //统计总数
    @Override
    public long Total(Map map) {
        return behaviorRecordDao.Total(map);
    }

    //分页查询个人行为记录
    @Override
    public List<BehaviorRecord> FindBehaviorRecordByStaff_id(Map map) {
        return behaviorRecordDao.FindBehaviorRecordByStaff_id(map);
    }

    //统计个人记录总数
    @Override
    public long TotalByStaff_id(Map map) {
        return behaviorRecordDao.TotalByStaff_id(map);
    }

    @Override
    public List<BehaviorRecord> ceshi(Map map) {
        return behaviorRecordDao.ceshi(map);
    }
}
