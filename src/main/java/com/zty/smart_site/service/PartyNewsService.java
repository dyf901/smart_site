package com.zty.smart_site.service;

import com.zty.smart_site.dao.PartyNewsDao;
import com.zty.smart_site.entity.PartyNews;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PartyNewsService implements PartyNewsDao {
    @Autowired
    public PartyNewsDao partyNewsDao;

    //增加党建新闻
    @Override
    public int InsertPartyNews(Map map) {
        return partyNewsDao.InsertPartyNews(map);
    }

    //删除党建新闻
    @Override
    public int DeletePartyNews(Map map) {
        return partyNewsDao.DeletePartyNews(map);
    }

    //修改党建新闻
    @Override
    public int UpdatePartyNews(Map map) {
        return partyNewsDao.UpdatePartyNews(map);
    }

    //分页查询党建新闻
    @Override
    public List<PartyNews> FindPartyNews(Map map) {
        return partyNewsDao.FindPartyNews(map);
    }

    //统计总数
    @Override
    public long Total(Map map) {
        return partyNewsDao.Total(map);
    }

    //大屏_党建新闻
    @Override
    public PartyNews SelectPartyNews(Map map) {
        return partyNewsDao.SelectPartyNews(map);
    }
}
