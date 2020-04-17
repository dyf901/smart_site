package com.zty.smart_site.service;

import com.zty.smart_site.dao.KnowledgeDao;
import com.zty.smart_site.entity.Knowledge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class KnowledgeService implements KnowledgeDao {
    @Autowired
    private KnowledgeDao knowledgeDao;//知识类型

    //增加知识类型
    @Override
    public int InsertKnowledge(Map map) {
        return knowledgeDao.InsertKnowledge(map);
    }

    //删除知识类型
    @Override
    public int DeleteKnowledge(Map map) {
        return knowledgeDao.DeleteKnowledge(map);
    }

    //修改知识类型
    @Override
    public int UpdateKnowledge(Map map) {
        return knowledgeDao.UpdateKnowledge(map);
    }

    //分页查询知识类型
    @Override
    public List<Knowledge> FindKnowledge(Map map) {
        return knowledgeDao.FindKnowledge(map);
    }

    //统计总数
    @Override
    public long Total(Map map) {
        return knowledgeDao.Total(map);
    }

    //下拉框知识类型
    @Override
    public List<Knowledge> SelectKnowledge(Map map) {
        return knowledgeDao.SelectKnowledge(map);
    }
}
