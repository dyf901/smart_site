package com.zty.smart_site.service;

import com.zty.smart_site.dao.TrainPhotoDao;
import com.zty.smart_site.entity.TrainPhoto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class TrainPhotoService implements TrainPhotoDao {
    @Autowired
    private TrainPhotoDao trainPhotoDao;

    //增加培训相册
    @Override
    public int InsertTrainPhoto(Map map) {
        return trainPhotoDao.InsertTrainPhoto(map);
    }

    //删除培训相册
    @Override
    public int DeleteTrainPhoto(Map map) {
        return trainPhotoDao.DeleteTrainPhoto(map);
    }

    //修改培训相册
    @Override
    public int UpdateTrainPhoto(Map map) {
        return trainPhotoDao.UpdateTrainPhoto(map);
    }

    //分页查询培训相册
    @Override
    public List<TrainPhoto> FindTrainPhoto(Map map) {
        return trainPhotoDao.FindTrainPhoto(map);
    }

    //统计总数
    @Override
    public long Total(Map map) {
        return trainPhotoDao.Total(map);
    }

    //大屏_培训相册
    @Override
    public List<TrainPhoto> SelectTrainPhoto(Map map) {
        return trainPhotoDao.SelectTrainPhoto(map);
    }
}
