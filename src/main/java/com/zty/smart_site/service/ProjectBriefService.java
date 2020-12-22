package com.zty.smart_site.service;

import com.zty.smart_site.dao.ProjectBriefDao;
import com.zty.smart_site.entity.ProjectBrief;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ProjectBriefService implements ProjectBriefDao {
    @Autowired
    private ProjectBriefDao projectBriefDao;

    //增加大屏项目简介
    @Override
    public int InsertProjectBrief(Map map) {
        return projectBriefDao.InsertProjectBrief(map);
    }

    //删除大屏项目简介
    @Override
    public int DeleteProjectBrief(Map map) {
        return projectBriefDao.DeleteProjectBrief(map);
    }

    //修改大屏项目简介
    @Override
    public int UpdateProjectBrief(Map map) {
        return projectBriefDao.UpdateProjectBrief(map);
    }

    //分页查询大屏项目简介
    @Override
    public List<ProjectBrief> FindProjectBrief(Map map) {
        return projectBriefDao.FindProjectBrief(map);
    }

    //统计总数
    @Override
    public long Total(Map map) {
        return projectBriefDao.Total(map);
    }

    //大屏-项目简介
    @Override
    public ProjectBrief SelectProjectBrief(Map map) {
        return projectBriefDao.SelectProjectBrief(map);
    }
}
