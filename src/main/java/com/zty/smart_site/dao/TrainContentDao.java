package com.zty.smart_site.dao;

import com.zty.smart_site.entity.TrainContent;

import java.util.List;
import java.util.Map;

public interface TrainContentDao {
    //根据id查询培训内容
    TrainContent FindTrainContent(Map map);

    //查询全部展馆体验
    List<TrainContent> FindTrainContentAll();
}
