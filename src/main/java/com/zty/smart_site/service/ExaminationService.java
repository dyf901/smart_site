package com.zty.smart_site.service;

import com.zty.smart_site.dao.ExaminationDao;
import com.zty.smart_site.entity.Examination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ExaminationService implements ExaminationDao {
    @Autowired
    private ExaminationDao examinationDao;

    //增加试卷
    @Override
    public int InsertExamination(Map map) {
        return examinationDao.InsertExamination(map);
    }

    //删除试卷
    @Override
    public int DeleteExamination(Map map) {
        return examinationDao.DeleteExamination(map);
    }

    //分页模糊查询试卷
    @Override
    public List<Examination> FindExamination(Map map) {
        return examinationDao.FindExamination(map);
    }

    //统计总数
    @Override
    public long Total(Map map) {
        return examinationDao.Total(map);
    }

    @Override
    public Examination FindExaminationById(Map map) {
        return examinationDao.FindExaminationById(map);
    }

    @Override
    public List<Examination> SelectExamination(Map map) {
        return examinationDao.SelectExamination(map);
    }

    @Override
    public int CountAll(Map map) {
        return examinationDao.CountAll(map);
    }
}
