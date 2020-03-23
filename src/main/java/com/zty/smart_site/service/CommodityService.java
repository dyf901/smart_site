package com.zty.smart_site.service;

import com.zty.smart_site.dao.CommodityDao;
import com.zty.smart_site.entity.Commodity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CommodityService implements CommodityDao {
    @Autowired
    private CommodityDao commodityDao;//商品

    //增加商品信息
    @Override
    public int InsertCommodity(Map map) {
        return commodityDao.InsertCommodity(map);
    }

    //删除商品信息
    @Override
    public int DeleteCommodity(Map map) {
        return commodityDao.DeleteCommodity(map);
    }

    //修改商品信息
    @Override
    public int UpdateCommodity(Map map) {
        return commodityDao.UpdateCommodity(map);
    }

    //分页模糊查询商品信息
    @Override
    public List<Commodity> FindCommodity(Map map) {
        return commodityDao.FindCommodity(map);
    }

    //统计总数
    @Override
    public long Total(Map map) {
        return commodityDao.Total(map);
    }

    //根据id查询商品信息
    @Override
    public Commodity FindCommodityById(Map map) {
        return commodityDao.FindCommodityById(map);
    }
}
