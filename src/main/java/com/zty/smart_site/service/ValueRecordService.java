package com.zty.smart_site.service;

import com.zty.smart_site.dao.ValueRecordDao;
import com.zty.smart_site.entity.ValueRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class ValueRecordService implements ValueRecordDao {
    @Autowired
    private ValueRecordDao valueRecordDao;

    //累计产值
    @Override
    public ValueRecord SumValue(Map map) {
        return valueRecordDao.SumValue(map);
    }

    //产值分析
    @Override
    public List<ValueRecord> CountValue(Map map) {
        return valueRecordDao.CountValue(map);
    }

    //增加产值
    @Override
    public int InsertValueRecord(Map map) {
        return valueRecordDao.InsertValueRecord(map);
    }

    //删除产值
    @Override
    public int DeleteValueRecord(Map map) {
        return valueRecordDao.DeleteValueRecord(map);
    }

    //修改产值
    @Override
    public int UpdateValueRecord(Map map) {
        return valueRecordDao.UpdateValueRecord(map);
    }

    //分页查询产值
    @Override
    public List<ValueRecord> FindValueRecord(Map map) {
        return valueRecordDao.FindValueRecord(map);
    }

    //统计总数
    @Override
    public long Total(Map map) {
        return valueRecordDao.Total(map);
    }
}
