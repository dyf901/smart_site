package com.zty.smart_site.dao;

import com.zty.smart_site.entity.Message;

import java.util.List;
import java.util.Map;

public interface MessageDao {
    //增加我的信息
    int InsertMessage(Map map);

    //查询我的信息
    List<Message> FindMessage(Map map);

    //统计总数
    long Total(Map map);
}
