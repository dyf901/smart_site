package com.zty.smart_site.service;

import com.zty.smart_site.dao.ExamRecordDao;
import com.zty.smart_site.entity.ExamRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ExamRecordService implements ExamRecordDao {
    @Autowired
    private ExamRecordDao examRecordDao;

    @Override
    public int InsertExamRecord(Map map) {
        return examRecordDao.InsertExamRecord(map);
    }

    @Override
    public int DeleteExamRecord(Map map) {
        return examRecordDao.DeleteExamRecord(map);
    }

    @Override
    public List<ExamRecord> FindExamRecord(Map map) {
        return examRecordDao.FindExamRecord(map);
    }

    @Override
    public long Total(Map map) {
        return examRecordDao.Total(map);
    }

    @Override
    public List<ExamRecord> FindExamRecordByStaffId(Map map) {
        return examRecordDao.FindExamRecordByStaffId(map);
    }

    @Override
    public List<ExamRecord> FindExamRecordByStaffIdALL(Map map) {
        return examRecordDao.FindExamRecordByStaffIdALL(map);
    }

    @Override
    public int CountT(Map map) {
        return examRecordDao.CountT(map);
    }

    @Override
    public int CountAll(Map map) {
        return examRecordDao.CountAll(map);
    }
}
