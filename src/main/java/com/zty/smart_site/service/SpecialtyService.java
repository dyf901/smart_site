package com.zty.smart_site.service;

import com.zty.smart_site.dao.SpecialtyDao;
import com.zty.smart_site.entity.Specialty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SpecialtyService implements SpecialtyDao {
    @Autowired
    private SpecialtyDao specialtyDao;//专业类型

    //增加专业类型
    @Override
    public int InsertSpecialty(Map map) {
        return specialtyDao.InsertSpecialty(map);
    }

    //删除专业类型
    @Override
    public int DeleteSpecialty(Map map) {
        return specialtyDao.DeleteSpecialty(map);
    }

    //修改专业类型
    @Override
    public int UpdateSpecialty(Map map) {
        return specialtyDao.UpdateSpecialty(map);
    }

    //分页查询专业类型
    @Override
    public List<Specialty> FindSpecialty(Map map) {
        return specialtyDao.FindSpecialty(map);
    }

    //统计总数
    @Override
    public long Total(Map map) {
        return specialtyDao.Total(map);
    }

    //下拉框查询专业类型
    @Override
    public List<Specialty> SelectSpecialty(Map map) {
        return specialtyDao.SelectSpecialty(map);
    }
}
