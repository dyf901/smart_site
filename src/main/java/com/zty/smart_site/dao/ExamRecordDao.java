package com.zty.smart_site.dao;

import com.zty.smart_site.entity.ExamRecord;

import java.util.List;
import java.util.Map;

public interface ExamRecordDao {
    //增加考试记录
    int InsertExamRecord(Map map);

    //删除考试记录
    int DeleteExamRecord(Map map);

    //分页模糊查询考试记录
    List<ExamRecord> FindExamRecord(Map map);

    //统计总数
    long Total(Map map);

    //查询个人考试记录
    List<ExamRecord> FindExamRecordByStaffId(Map map);

    //查询个人考试记录
    List<ExamRecord> FindExamRecordByStaffIdALL(Map map);

    int CountT(Map map);

    int CountAll(Map map);
}
