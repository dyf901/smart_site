package com.zty.smart_site.service;

import com.zty.smart_site.dao.PositionDao;
import com.zty.smart_site.entity.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PositionService implements PositionDao {
    @Autowired
    private PositionDao positionDao;//职务

    //增加职务信息
    @Override
    public int InsertPosition(Map map) {
        return positionDao.InsertPosition(map);
    }

    //删除职务信息
    @Override
    public int DeletePosition(Map map) {
        return positionDao.DeletePosition(map);
    }

    //修改职务信息
    @Override
    public int UpdatePosition(Map map) {
        return positionDao.UpdatePosition(map);
    }

    //分页模糊查询职务信息
    @Override
    public List<Position> FindPosition(Map map) {
        return positionDao.FindPosition(map);
    }

    //统计总数
    @Override
    public long Total(Map map) {
        return positionDao.Total(map);
    }

    @Override
    public List<Position> SelectPosition(Map map) {
        return positionDao.SelectPosition(map);
    }
}
