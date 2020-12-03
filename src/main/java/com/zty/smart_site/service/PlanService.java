package com.zty.smart_site.service;

import com.zty.smart_site.dao.PlanDao;
import com.zty.smart_site.entity.Plan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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

    //进度对比
    @Override
    public List<Plan> Comparison(Map map) {
        return planDao.Comparison(map);
    }

    //进度分析
    @Override
    public List<Plan> Analyse(Map map) {
        return planDao.Analyse(map);
    }

    //修改当前日期大于计划开工日期的项目状态
    @Override
    public int UpdateState(Map map) {
        return planDao.UpdateState(map);
    }

    //修改状态为1的项目实际天数
    @Override
    public int UpdatePracticalDay() {
        return planDao.UpdatePracticalDay();
    }

    //修改项目状态为2
    @Override
    public int UpdateState2(Map map) {
        return planDao.UpdateState2(map);
    }
}
