package com.zty.smart_site.dao;

import com.zty.smart_site.entity.Plan;

import java.util.List;
import java.util.Map;

public interface PlanDao {
    //增加项目进度信息
    int InsertPlan(Map map);

    //删除项目进度计划
    int DeletePlan(Map map);

    //修改项目进度信息
    int UpdatePlan(Map map);

    //进度对比
    List<Plan> Comparison(Map map);

    //进度分析
    List<Plan> Analyse(Map map);

    //修改当前日期大于计划开工日期的项目状态
    int UpdateState(Map map);

    //修改状态为1的项目实际天数
    int UpdatePracticalDay();

    //修改项目状态为2
    int UpdateState2(Map map);

    //查询项目进度
    List<Plan> FindPlan(Map map);

    //统计总数
    long Total(Map map);
}
