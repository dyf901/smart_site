package com.zty.smart_site.dao;

import com.zty.smart_site.entity.Position;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface PositionDao {
    //增加职务信息
    int InsertPosition(Map map);

    //删除职务信息
    int DeletePosition(Map map);

    //修改职务信息
    int UpdatePosition(Map map);

    //分页模糊查询职务信息
    List<Position> FindPosition(Map map);

    //统计总数
    long Total(Map map);

    //下拉框查询职务信息
    List<Position> SelectPosition(Map map);
}
