package com.zty.smart_site.service;

import com.zty.smart_site.dao.ExamDao;
import com.zty.smart_site.entity.Exam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ExamService implements ExamDao {
    @Autowired
    private ExamDao examDao;

    //增加考试
    @Override
    public int InsertExam(Map map) {
        return examDao.InsertExam(map);
    }

    //删除考试
    @Override
    public int DeleteExam(Map map) {
        return examDao.DeleteExam(map);
    }

    //修改考试
    @Override
    public int UpdateExam(Map map) {
        return examDao.UpdateExam(map);
    }

    //分页模糊查询考试
    @Override
    public List<Exam> FindExam(Map map) {
        return examDao.FindExam(map);
    }

    //统计总数
    @Override
    public long Total(Map map) {
        return examDao.Total(map);
    }

    //最新考试App
    @Override
    public Exam FindExamNew(Map map) {
        return examDao.FindExamNew(map);
    }

    //最新考试_公众号
    @Override
    public Exam FindExamNewG(Map map) {
        return examDao.FindExamNewG(map);
    }
}
