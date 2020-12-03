package com.zty.smart_site.service;

import com.zty.smart_site.dao.TrainContentRecordDao;
import com.zty.smart_site.entity.TrainContentRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TrainContentRecordService implements TrainContentRecordDao {
    @Autowired
    private TrainContentRecordDao trainContentRecordDao;

    @Override
    public int InsertTrainContentRecord(Map map) {
        return trainContentRecordDao.InsertTrainContentRecord(map);
    }

    @Override
    public int DeleteTrainContentRecord(Map map) {
        return trainContentRecordDao.DeleteTrainContentRecord(map);
    }

    @Override
    public int UpdateTrainContentRecord(Map map) {
        return trainContentRecordDao.UpdateTrainContentRecord(map);
    }

    @Override
    public List<TrainContentRecord> FindTrainContentRecord(Map map) {
        return trainContentRecordDao.FindTrainContentRecord(map);
    }

    @Override
    public long Total(Map map) {
        return trainContentRecordDao.Total(map);
    }
}
