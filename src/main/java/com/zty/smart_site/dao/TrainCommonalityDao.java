package com.zty.smart_site.dao;

import com.zty.smart_site.entity.TrainCommonality;

import java.util.List;
import java.util.Map;

public interface TrainCommonalityDao {
    //增加公共课程
    int InsertTrainCommonality(Map map);

    //删除公共课程
    int DeleteTrainCommonality(Map map);

    //修改公共课程
    int UpdateTrainCommonality(Map map);

    //分页模糊查询公共课程
    List<TrainCommonality> FindTrainCommonality(Map map);

    //统计总数
    long Total(Map map);

    int CountAll();
}
