package com.zty.smart_site.service;

import com.zty.smart_site.dao.QuestionsDao;
import com.zty.smart_site.entity.Questions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class QuestionsService implements QuestionsDao {
    @Autowired
    private QuestionsDao questionsDao;

    //增加题目
    @Override
    public int InsertQuestions(Map map) {
        return questionsDao.InsertQuestions(map);
    }

    //删除题目
    @Override
    public int DeleteQuestions(Map map) {
        return questionsDao.DeleteQuestions(map);
    }

    //修改题目
    @Override
    public int UpdateQuestions(Map map) {
        return questionsDao.UpdateQuestions(map);
    }

    //分页模糊查询题目信息
    @Override
    public List<Questions> FindQuestions(Map map) {
        return questionsDao.FindQuestions(map);
    }

    //统计总数
    @Override
    public long Total(Map map) {
        return questionsDao.Total(map);
    }

    //根据id查询题目信息
    @Override
    public Questions FindQuestionsById(Map map) {
        return questionsDao.FindQuestionsById(map);
    }
}
