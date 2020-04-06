package com.zty.smart_site.service;

import com.zty.smart_site.dao.TrainTypeDao;
import com.zty.smart_site.entity.TrainType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TrainTypeService implements TrainTypeDao {
    @Autowired
    private TrainTypeDao trainTypeDao;

    @Override
    public int InsertTrainType(Map map) {
        return trainTypeDao.InsertTrainType(map);
    }

    @Override
    public int DeleteTrainType(Map map) {
        return trainTypeDao.DeleteTrainType(map);
    }

    @Override
    public int UpdateTrainType(Map map) {
        return trainTypeDao.UpdateTrainType(map);
    }

    @Override
    public List<TrainType> FindTrainType(Map map) {
        return trainTypeDao.FindTrainType(map);
    }

    @Override
    public long Total(Map map) {
        return trainTypeDao.Total(map);
    }

    @Override
    public List<Long> FindTrainTypeBySectionId(Map map) {
        return trainTypeDao.FindTrainTypeBySectionId(map);
    }

    @Override
    public TrainType FindTrainTypeById(Long id) {
        return trainTypeDao.FindTrainTypeById(id);
    }
}
