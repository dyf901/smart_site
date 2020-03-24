package com.zty.smart_site.dao;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface PositionTitleDao {
    //增加菜单图标
    int InsertPositionTitle(Map map);

    //删除菜单图标
    int DeletePositionTitle(Map map);

    //根据position_id查询菜单图标对应权限
    List<Long> FindByPositionId(Map map);
}
