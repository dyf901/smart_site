package com.zty.smart_site.dao;

import com.zty.smart_site.entity.Train;

import java.util.List;
import java.util.Map;

public interface TrainDao {

    //增加培训内容
    int InsertTrain(Map map);

    //删除培训内容
    int DeleteTrain(Map map);

    //修改培训内容
    int UpdateTrain(Map map);

    //分页模糊查询培训内容
    List<Train> FindTrain(Map map);

    //统计总数
    long Total(Map map);

    //根据type_id查询培训内容(返回id数组)
    List<Long> FindTrainByTypeId_S(Train train);

    //根据id查询培训内容
    Train FindTrainById(Long id);

    //根据id查询培训内容富文本
    Train FindTrainByIdX(Map map);

    //根据标段id查询所有培训内容
    List<Train> FindTrainAll(Map map);

    int CountAll(Map map);
}
