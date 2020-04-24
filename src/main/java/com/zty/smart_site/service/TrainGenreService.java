package com.zty.smart_site.service;

import com.zty.smart_site.dao.TrainGenreDao;
import com.zty.smart_site.entity.TrainGenre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TrainGenreService implements TrainGenreDao {
    @Autowired
    private TrainGenreDao trainGenreDao;

    //增加建造类型
    @Override
    public int InsertTrainGenre(Map map) {
        return trainGenreDao.InsertTrainGenre(map);
    }

    //删除建造类型
    @Override
    public int DeleteTrainGenre(Map map) {
        return trainGenreDao.DeleteTrainGenre(map);
    }

    //修改建造类型
    @Override
    public int UpdateTrainGenre(Map map) {
        return trainGenreDao.UpdateTrainGenre(map);
    }

    //分页模糊查询
    @Override
    public List<TrainGenre> FindTrainGenre(Map map) {
        return trainGenreDao.FindTrainGenre(map);
    }

    //统计总数
    @Override
    public long Total() {
        return trainGenreDao.Total();
    }

    //下拉框查询建造类型
    @Override
    public List<TrainGenre> SelectTrainGenre(Map map) {
        return trainGenreDao.SelectTrainGenre(map);
    }
}
