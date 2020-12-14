package com.zty.smart_site.dao;

import com.zty.smart_site.entity.PartyNews;

import java.util.List;
import java.util.Map;

public interface PartyNewsDao {
    //增加党建新闻
    int InsertPartyNews(Map map);

    //删除党建新闻
    int DeletePartyNews(Map map);

    //修改党建新闻
    int UpdatePartyNews(Map map);

    //分页查询党建新闻
    List<PartyNews> FindPartyNews(Map map);

    //统计总数
    long Total(Map map);

    //大屏_党建新闻
    PartyNews SelectPartyNews(Map map);
}
