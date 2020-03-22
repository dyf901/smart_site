package com.zty.smart_site.dao;

import com.zty.smart_site.entity.Behavior;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface BehaviorDao {
    //增加行为类型
    int InsertBehavior(Map map);

    //删除行为类型
    int DeleteBehavior(Map map);

    //修改行为类型信息
    int UpdateBehavior(Map map);

    //分页模糊查询
    List<Behavior> FindBehavior(Map map);

    //统计总数
    long Total(Map map);

    //行为类型下拉框
    List<Behavior> SelectBehavior(Map map);
}
