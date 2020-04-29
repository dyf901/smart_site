package com.zty.smart_site.dao;

import com.zty.smart_site.entity.TrainRecord;

import java.util.List;
import java.util.Map;

public interface TrainRecordDao {
    //增加展馆培训记录
    int InsertTrainRecord(Map map);

    //分页查询展馆培训记录
    List<TrainRecord> FindTrainRecord(Map map);

    //统计总数
    long Total(Map map);

    List<TrainRecord> FindTrainRecordByTrainName(Map map);
}
