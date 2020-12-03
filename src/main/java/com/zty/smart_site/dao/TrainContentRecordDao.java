package com.zty.smart_site.dao;

import com.zty.smart_site.entity.TrainContentRecord;

import java.util.List;
import java.util.Map;

public interface TrainContentRecordDao {
    //增加展馆培训记录
    int InsertTrainContentRecord(Map map);

    //删除展馆配训记录
    int DeleteTrainContentRecord(Map map);

    //修改展馆培训记录
    int UpdateTrainContentRecord(Map map);

    //分页查询展馆培训记录
    List<TrainContentRecord> FindTrainContentRecord(Map map);

    //统计总数
    long Total(Map map);
}
