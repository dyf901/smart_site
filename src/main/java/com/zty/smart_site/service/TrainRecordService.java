package com.zty.smart_site.service;

import com.zty.smart_site.dao.TrainRecordDao;
import com.zty.smart_site.entity.TrainRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TrainRecordService implements TrainRecordDao {
    @Autowired
    private TrainRecordDao trainRecordDao;

    @Override
    public int InsertTrainRecord(Map map) {
        return trainRecordDao.InsertTrainRecord(map);
    }

    @Override
    public List<TrainRecord> FindTrainRecord(Map map) {
        return trainRecordDao.FindTrainRecord(map);
    }

    @Override
    public long Total(Map map) {
        return trainRecordDao.Total(map);
    }

    @Override
    public List<TrainRecord> FindTrainRecordByTrainName(Map map) {
        return trainRecordDao.FindTrainRecordByTrainName(map);
    }
}
