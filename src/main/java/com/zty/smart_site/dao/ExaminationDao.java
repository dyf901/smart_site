package com.zty.smart_site.dao;

import com.zty.smart_site.entity.Examination;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ExaminationDao {
    //增加试卷
    int InsertExamination(Map map);

    //删除试卷
    int DeleteExamination(Map map);

    //分页模糊查询试卷
    List<Examination> FindExamination(Map map);

    //统计总数
    long Total(Map map);

    //根据id查询试卷信息
    Examination FindExaminationById(Map map);

    //下拉框查询试卷信息
    List<Examination> SelectExamination(Map map);

    //统计总数
    int CountAll(Map map);
}
