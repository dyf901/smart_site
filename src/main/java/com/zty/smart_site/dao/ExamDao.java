package com.zty.smart_site.dao;

import com.zty.smart_site.entity.Exam;

import java.util.List;
import java.util.Map;

public interface ExamDao {
    //增加考试
    int InsertExam(Map map);

    //删除考试
    int DeleteExam(Map map);

    //修改考试
    int UpdateExam(Map map);

    //分页模糊查询考试
    List<Exam> FindExam(Map map);

    //统计总数
    long Total(Map map);

    //最新考试App
    Exam FindExamNew(Map map);

    //最新考试_公众号
    Exam FindExamNewG(Map map);
}
