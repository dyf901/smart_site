package com.zty.smart_site.service;

import com.zty.smart_site.dao.TrainDao;
import com.zty.smart_site.entity.Train;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TrainService implements TrainDao {
    @Autowired
    private TrainDao trainDao;

    @Override
    public int InsertTrain(Map map) {
        return trainDao.InsertTrain(map);
    }

    @Override
    public int DeleteTrain(Map map) {
        return trainDao.DeleteTrain(map);
    }

    @Override
    public int UpdateTrain(Map map) {
        return trainDao.UpdateTrain(map);
    }

    @Override
    public List<Train> FindTrain(Map map) {
        return trainDao.FindTrain(map);
    }

    @Override
    public long Total(Map map) {
        return trainDao.Total(map);
    }

    @Override
    public List<Long> FindTrainByTypeId_S(Train train) {
        return trainDao.FindTrainByTypeId_S(train);
    }

    @Override
    public Train FindTrainById(Long id) {
        return trainDao.FindTrainById(id);
    }

    @Override
    public Train FindTrainByIdX(Map map) {
        return trainDao.FindTrainByIdX(map);
    }

    @Override
    public List<Train> FindTrainAll(Map map) {
        return trainDao.FindTrainAll(map);
    }

    @Override
    public int CountAll(Map map) {
        return trainDao.CountAll(map);
    }
}
