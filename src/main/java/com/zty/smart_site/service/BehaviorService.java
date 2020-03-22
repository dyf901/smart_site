package com.zty.smart_site.service;

import com.zty.smart_site.dao.BehaviorDao;
import com.zty.smart_site.entity.Behavior;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BehaviorService implements BehaviorDao {
    @Autowired
    private BehaviorDao behaviorDao;//行为类型

    //增加行为类型
    @Override
    public int InsertBehavior(Map map) {
        return behaviorDao.InsertBehavior(map);
    }

    //删除行为类型
    @Override
    public int DeleteBehavior(Map map) {
        return behaviorDao.DeleteBehavior(map);
    }

    //修改行为类型信息
    @Override
    public int UpdateBehavior(Map map) {
        return behaviorDao.UpdateBehavior(map);
    }

    //分页模糊查询
    @Override
    public List<Behavior> FindBehavior(Map map) {
        return behaviorDao.FindBehavior(map);
    }

    //统计总数
    @Override
    public long Total(Map map) {
        return behaviorDao.Total(map);
    }

    //行为类型下拉框
    @Override
    public List<Behavior> SelectBehavior(Map map) {
        return behaviorDao.SelectBehavior(map);
    }
}
