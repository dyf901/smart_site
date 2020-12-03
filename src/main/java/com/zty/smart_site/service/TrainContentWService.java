package com.zty.smart_site.service;

import com.zty.smart_site.dao.TrainContentWDao;
import com.zty.smart_site.entity.TrainContentW;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TrainContentWService implements TrainContentWDao {
    @Autowired
    private TrainContentWDao trainContentWDao;

    //根据id查询培训内容
    @Override
    public TrainContentW FindTrainContentW(Map map) {
        return trainContentWDao.FindTrainContentW(map);
    }

    //查询全部展馆体验
    @Override
    public List<TrainContentW> FindTrainContentWAll() {
        return trainContentWDao.FindTrainContentWAll();
    }
}
