package com.zty.smart_site.dao;

import com.zty.smart_site.entity.Environment;

import java.util.List;
import java.util.Map;

public interface EnvironmentDao {
    //增加数据
    int InsertEnvironment(Map map);

    //查询数据
    Environment FindEnvironment(Map map);

    //删除所有数据
    int DeleteEnvironment();

    //分页查询所有数据
    List<Environment> FindEnvironmentList(Map map);

    //统计总数
    long Total();

    //环境因子分析
    List<Environment> HJFX();
}
