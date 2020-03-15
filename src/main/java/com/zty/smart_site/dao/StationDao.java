package com.zty.smart_site.dao;

import com.zty.smart_site.entity.Station;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface StationDao {
    //增加站点信息
    int InsertStation(Map map);

    //删除站点信息
    int DeleteStation(Map map);

    //修改站点信息
    int UpdateStation(Map map);

    //分页模糊查询站点信息
    List<Station> FindStation(Map map);

    //统计总数
    long Total(Map map);
}
