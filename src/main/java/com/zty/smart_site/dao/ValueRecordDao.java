package com.zty.smart_site.dao;


import com.zty.smart_site.entity.ValueRecord;

import java.util.List;
import java.util.Map;

public interface ValueRecordDao {
    //累计产值
    ValueRecord SumValue(Map map);

    //产值分析
    List<ValueRecord> CountValue(Map map);

    //增加产值
    int InsertValueRecord(Map map);

    //删除产值
    int DeleteValueRecord(Map map);

    //修改产值
    int UpdateValueRecord(Map map);

    //分页查询产值
    List<ValueRecord> FindValueRecord(Map map);

    //统计总数
    long Total(Map map);
}
