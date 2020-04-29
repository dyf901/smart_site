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

    //根据题目类型查询随机查询题目返回id数组
    int[] FindQuestionByQuestionTypeX(Map map);

    int[] FindQuestionByQuestionTypeP(Map map);

    int[] FindQuestionByQuestionTypeT(Map map);

    int[] FindQuestionByQuestionTypeJ(Map map);

    //统计题目总数
    int CountAll(Map map);

    //按照知识分类
    List<Questions> CountByKnowledge(Map map);

    //按照专业分类
    List<Questions> CountBySpecialty(Map map);
}
