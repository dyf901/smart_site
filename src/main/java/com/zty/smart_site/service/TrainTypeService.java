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

    //增加培训类型
    @Override
    public int InsertTrainType(Map map) {
        return trainTypeDao.InsertTrainType(map);
    }

    //删除培训类型
    @Override
    public int DeleteTrainType(Map map) {
        return trainTypeDao.DeleteTrainType(map);
    }

    //修改培训类型
    @Override
    public int UpdateTrainType(Map map) {
        return trainTypeDao.UpdateTrainType(map);
    }

    //分页模糊查询培训类型
    @Override
    public List<TrainType> FindTrainType(Map map) {
        return trainTypeDao.FindTrainType(map);
    }

    //统计总数
    @Override
    public long Total(Map map) {
        return trainTypeDao.Total(map);
    }

    //根据section_id查询培训类型(返回id数组)
    @Override
    public List<Long> FindTrainTypeBySectionId(Map map) {
        return trainTypeDao.FindTrainTypeBySectionId(map);
    }

    //根据id查询信息
    @Override
    public TrainType FindTrainTypeById(Long id) {
        return trainTypeDao.FindTrainTypeById(id);
    }

    //下拉框查询培训类型信息
    @Override
    public List<TrainType> SelectTrainType(Map map) {
        return trainTypeDao.SelectTrainType(map);
    }
}
