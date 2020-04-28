package com.zty.smart_site.dao;

import com.zty.smart_site.entity.TrainContent;

import java.util.Map;

public interface TrainContentDao {
    //根据id查询培训内容
    TrainContent FindTrainContent(Map map);
}
