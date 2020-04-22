package com.zty.smart_site.dao;

import com.zty.smart_site.entity.TrainType;

import java.util.List;
import java.util.Map;

public interface TrainTypeDao {

    //增加培训类型
    int InsertTrainType(Map map);

    //删除培训类型
    int DeleteTrainType(Map map);

    //修改培训类型
    int UpdateTrainType(Map map);

    //分页模糊查询培训类型
    List<TrainType> FindTrainType(Map map);

    //统计总数
    long Total(Map map);

    //根据section_id查询培训类型(返回id数组)
    List<Long> FindTrainTypeBySectionId(Map map);

    //根据id查询信息
    TrainType FindTrainTypeById(Long id);

    //下拉框查询培训类型
    List<TrainType> SelectTrainType(Map map);
}
