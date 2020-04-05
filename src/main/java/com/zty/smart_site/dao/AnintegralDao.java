package com.zty.smart_site.dao;

import com.zty.smart_site.entity.Anintegral;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface AnintegralDao {
    //上传积分明细
    int InsertAnintegral(Map map);

    //查询个人积分明细
    List<Anintegral> FindAnintegral(Map map);

    //统计总数
    long Total(Map map);
}
