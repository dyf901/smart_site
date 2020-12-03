package com.zty.smart_site.service;

import com.zty.smart_site.dao.ValueZDao;
import com.zty.smart_site.entity.ValueZ;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class ValueZService implements ValueZDao {
    @Autowired
    private ValueZDao valueZDao;

    //增加总产值
    @Override
    public int InsertValue(Map map) {
        return valueZDao.InsertValue(map);
    }

    //删除总产值
    @Override
    public int DeleteValue(Map map) {
        return valueZDao.DeleteValue(map);
    }

    //修改总产值
    @Override
    public int UpdateValue(Map map) {
        return valueZDao.UpdateValue(map);
    }

    //分页查询总产值
    @Override
    public List<ValueZ> FindValue(Map map) {
        return valueZDao.FindValue(map);
    }

    //查询总产值
    @Override
    public ValueZ FindValue1(Map map) {
        return valueZDao.FindValue1(map);
    }
}
