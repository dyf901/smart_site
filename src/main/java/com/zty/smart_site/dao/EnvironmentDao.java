package com.zty.smart_site.dao;

import com.zty.smart_site.entity.Environment;

import java.util.Map;

public interface EnvironmentDao {
    //增加数据
    int InsertEnvironment(Map map);

    //查询数据
    Environment FindEnvironment(Map map);
}
