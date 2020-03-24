package com.zty.smart_site.service;

import com.zty.smart_site.dao.PositionTitleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PositionTitleService implements PositionTitleDao {
    @Autowired
    private PositionTitleDao positionTitleDao;//菜单图标

    //增加菜单图标
    @Override
    public int InsertPositionTitle(Map map) {
        return positionTitleDao.InsertPositionTitle(map);
    }

    //删除菜单图标
    @Override
    public int DeletePositionTitle(Map map) {
        return positionTitleDao.DeletePositionTitle(map);
    }

    //根据position_id查询菜单图标对应权限
    @Override
    public List<Long> FindByPositionId(Map map) {
        return positionTitleDao.FindByPositionId(map);
    }
}
