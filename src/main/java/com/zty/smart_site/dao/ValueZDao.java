package com.zty.smart_site.dao;



import com.zty.smart_site.entity.ValueZ;

import java.util.List;
import java.util.Map;

public interface ValueZDao {
    //增加总产值
    int InsertValue(Map map);

    //删除总产值
    int DeleteValue(Map map);

    //修改总产值
    int UpdateValue(Map map);

    //分页查询总产值
    List<ValueZ> FindValue(Map map);

    //查询总产值
    ValueZ FindValue1(Map map);
}
