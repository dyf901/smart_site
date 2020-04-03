package com.zty.smart_site.dao;

import com.zty.smart_site.entity.Integral;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface IntegralDao {
    //上传积分明细
    int InsertIntegral(Map map);

    //查询个人积分明细
    List<Integral> FindIntegral(Map map);
}
