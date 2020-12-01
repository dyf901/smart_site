package com.zty.smart_site.service;

import com.zty.smart_site.dao.EnvironmentDao;
import com.zty.smart_site.entity.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
@Service
public class EnvironmentService implements EnvironmentDao {
    @Autowired
    private EnvironmentDao environmentDao;

    //增加数据
    @Override
    public int InsertEnvironment(Map map) {
        return environmentDao.InsertEnvironment(map);
    }

    //查询数据
    @Override
    public Environment FindEnvironment(Map map) {
        return environmentDao.FindEnvironment(map);
    }

    //删除所有数据
    @Override
    public int DeleteEnvironment() {
        return environmentDao.DeleteEnvironment();
    }

}
