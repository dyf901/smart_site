package com.zty.smart_site.dao;

import com.zty.smart_site.entity.TrainPhoto;

import java.util.List;
import java.util.Map;

public interface TrainPhotoDao {
    //增加培训相册
    int InsertTrainPhoto(Map map);

    //删除培训相册
    int DeleteTrainPhoto(Map map);

    //修改培训相册
    int UpdateTrainPhoto(Map map);

    //分页查询培训相册
    List<TrainPhoto> FindTrainPhoto(Map map);

    //统计总数
    long Total(Map map);

    //大屏_培训相册
    List<TrainPhoto> SelectTrainPhoto(Map map);
}
