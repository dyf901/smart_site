package com.zty.smart_site.dao;

import com.zty.smart_site.entity.Questions;

import java.util.List;
import java.util.Map;

public interface QuestionsDao {
    //增加题目
    int InsertQuestions(Map map);

    //删除题目
    int DeleteQuestions(Map map);

    //修改题目
    int UpdateQuestions(Map map);

    //分页模糊查询题目信息
    List<Questions> FindQuestions(Map map);

    //统计总数
    long Total(Map map);

    //根据id查询题目信息
    Questions FindQuestionsById(Map map);
}
