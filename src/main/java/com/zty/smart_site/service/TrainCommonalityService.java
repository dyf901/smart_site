package com.zty.smart_site.service;

import com.zty.smart_site.dao.TrainCommonalityDao;
import com.zty.smart_site.entity.TrainCommonality;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TrainCommonalityService implements TrainCommonalityDao {
    @Autowired
    private TrainCommonalityDao trainCommonalityDao;//公共课程

    //增加公共课程
    @Override
    public int InsertTrainCommonality(Map map) {
        return trainCommonalityDao.InsertTrainCommonality(map);
    }

    //删除公共课程
    @Override
    public int DeleteTrainCommonality(Map map) {
        return trainCommonalityDao.DeleteTrainCommonality(map);
    }

    //修改公共课程
    @Override
    public int UpdateTrainCommonality(Map map) {
        return trainCommonalityDao.UpdateTrainCommonality(map);
    }

    //分页模糊查询公共课程
    @Override
    public List<TrainCommonality> FindTrainCommonality(Map map) {
        return trainCommonalityDao.FindTrainCommonality(map);
    }

    //统计总数
    @Override
    public long Total(Map map) {
        return trainCommonalityDao.Total(map);
    }

    @Override
    public int CountAll() {
        return trainCommonalityDao.CountAll();
    }
}
