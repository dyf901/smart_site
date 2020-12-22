package com.zty.smart_site.dao;

import com.zty.smart_site.entity.ProjectBrief;

import java.util.List;
import java.util.Map;

public interface ProjectBriefDao {
    //增加大屏项目简介
    int InsertProjectBrief(Map map);

    //删除大屏项目简介
    int DeleteProjectBrief(Map map);

    //修改大屏项目简介
    int UpdateProjectBrief(Map map);

    //分页查询大屏项目简介
    List<ProjectBrief> FindProjectBrief(Map map);

    //统计总数
    long Total(Map map);

    //大屏-项目简介
    ProjectBrief SelectProjectBrief(Map map);
}
