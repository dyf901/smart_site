package com.zty.smart_site.dao;

import java.util.Map;

public interface PlanDao {
    //增加项目进度信息
    int InsertPlan(Map map);

    //删除项目进度计划
    int DeletePlan(Map map);

    //修改项目进度信息
    int UpdatePlan(Map map);
}
