package com.zty.smart_site.dao;

import com.zty.smart_site.entity.Commodity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface CommodityDao {
    //增加商品信息
    int InsertCommodity(Map map);

    //删除商品信息
    int DeleteCommodity(Map map);

    //修改商品信息
    int UpdateCommodity(Map map);

    //分页模糊查询商品信息
    List<Commodity> FindCommodity(Map map);

    //统计总数
    long Total(Map map);

    //根据id查询商品信息
    Commodity FindCommodityById(Map map);
}
