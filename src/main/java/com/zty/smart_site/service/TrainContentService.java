package com.zty.smart_site.service;

import com.zty.smart_site.dao.TrainContentDao;
import com.zty.smart_site.entity.TrainContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TrainContentService implements TrainContentDao {
    @Autowired
    private TrainContentDao trainContentDao;

    //根据id查询培训内容
    @Override
    public TrainContent FindTrainContent(Map map) {
        return trainContentDao.FindTrainContent(map);
    }

    //查询全部展馆体验
    @Override
    public List<TrainContent> FindTrainContentAll(Map map) {
        return trainContentDao.FindTrainContentAll(map);
    }

    //增加我的展馆培训信息
    @Override
    public int InsertTrainContent(Map map) {
        return trainContentDao.InsertTrainContent(map);
    }

    //删除我的展馆培训信息
    @Override
    public int DeleteTrainContent(Map map) {
        return trainContentDao.DeleteTrainContent(map);
    }

    //修改我的展馆培训信息
    @Override
    public int UpdateTrainContent(Map map) {
        return trainContentDao.UpdateTrainContent(map);
    }
}
