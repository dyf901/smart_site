package com.zty.smart_site.dao;

import com.zty.smart_site.entity.TrainGenre;

import java.util.List;
import java.util.Map;

public interface TrainGenreDao {
    //增加建造类型
    int InsertTrainGenre(Map map);

    //删除建造类型
    int DeleteTrainGenre(Map map);

    //修改建造类型
    int UpdateTrainGenre(Map map);

    //分页模糊查询
    List<TrainGenre> FindTrainGenre(Map map);

    //统计总数
    long Total();

    //下拉框查询建造类型
    List<TrainGenre> SelectTrainGenre(Map map);
}
