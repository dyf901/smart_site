package com.zty.smart_site.service;

import com.zty.smart_site.dao.SubcontractorsDao;
import com.zty.smart_site.entity.Subcontractors;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SubcontractorsService implements SubcontractorsDao {
    @Autowired
    private SubcontractorsDao subcontractorsDao;//分包单位

    //增加分包单位信息
    @Override
    public int InsertSubcontractors(Map map) {
        return subcontractorsDao.InsertSubcontractors(map);
    }

    //删除分包单位信息
    @Override
    public int DeleteSubcontractors(Map map) {
        return subcontractorsDao.DeleteSubcontractors(map);
    }

    //修改分包单位信息
    @Override
    public int UpdateSubcontractors(Map map) {
        return subcontractorsDao.UpdateSubcontractors(map);
    }

    //分页模糊查询分包单位信息
    @Override
    public List<Subcontractors> FindSubcontractors(Map map) {
        return subcontractorsDao.FindSubcontractors(map);
    }

    //统计总数
    @Override
    public long Total(Map map) {
        return subcontractorsDao.Total(map);
    }

    //下拉框查询分包单位信息
    @Override
    public List<Subcontractors> SelectSubcontractors(Map map) {
        return subcontractorsDao.SelectSubcontractors(map);
    }
}
