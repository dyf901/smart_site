package com.zty.smart_site.service;

import com.zty.smart_site.dao.ProcessDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ProcessService implements ProcessDao {
    @Autowired
    private ProcessDao processDao;

    @Override
    public int InsertProcess(Map map) {
        return processDao.InsertProcess(map);
    }

    @Override
    public int DeleteProcess(Map map) {
        return processDao.DeleteProcess(map);
    }

    @Override
    public int UpdateProcess(Map map) {
        return processDao.UpdateProcess(map);
    }

    @Override
    public List<Process> FindProcess(Map map) {
        return processDao.FindProcess(map);
    }

    @Override
    public long Total(Map map) {
        return processDao.Total(map);
    }

    @Override
    public List<Process> SelectProcess(Map map) {
        return processDao.SelectProcess(map);
    }
}
