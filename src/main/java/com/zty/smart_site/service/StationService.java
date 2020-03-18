package com.zty.smart_site.service;

import com.zty.smart_site.dao.StationDao;
import com.zty.smart_site.entity.Station;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StationService implements StationDao {
    @Autowired
    private StationDao stationDao;//站点

    //增加站点信息
    @Override
    public int InsertStation(Map map) {
        return stationDao.InsertStation(map);
    }

    //删除站点信息
    @Override
    public int DeleteStation(Map map) {
        return stationDao.DeleteStation(map);
    }

    //修改站点信息
    @Override
    public int UpdateStation(Map map) {
        return stationDao.UpdateStation(map);
    }

    //分页模糊查询站点信息
    @Override
    public List<Station> FindStation(Map map) {
        return stationDao.FindStation(map);
    }

    //统计总数
    @Override
    public long Total(Map map) {
        return stationDao.Total(map);
    }

    //下拉框查询站点信息
    @Override
    public List<Station> SelectStation(Map map) {
        return stationDao.SelectStation(map);
    }
}
