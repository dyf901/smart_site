package com.zty.smart_site.service;

import com.zty.smart_site.dao.PlanDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class PlanService implements PlanDao {
    @Autowired
    private PlanDao planDao;

    //增加项目进度信息
    @Override
    public int InsertPlan(Map map) {
        return planDao.InsertPlan(map);
    }

    //删除项目进度计划
    @Override
    public int DeletePlan(Map map) {
        return planDao.DeletePlan(map);
    }

    //修改项目进度信息
    @Override
    public int UpdatePlan(Map map) {
        return planDao.UpdatePlan(map);
    }
}
