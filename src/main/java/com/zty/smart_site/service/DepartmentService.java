package com.zty.smart_site.service;

import com.zty.smart_site.dao.DepartmentDao;
import com.zty.smart_site.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DepartmentService implements DepartmentDao {
    @Autowired
    private DepartmentDao departmentDao;//部门

    //增肌部门信息
    @Override
    public int InsertDepartment(Map map) {
        return departmentDao.InsertDepartment(map);
    }

    //删除部门信息
    @Override
    public int DeleteDepartment(Map map) {
        return departmentDao.DeleteDepartment(map);
    }

    //修改部门信息
    @Override
    public int UpdateDepartment(Map map) {
        return departmentDao.UpdateDepartment(map);
    }

    //修改部门人数
    @Override
    public int UpdateDepartmentPercount(Map map) {
        return departmentDao.UpdateDepartmentPercount(map);
    }

    //分页模糊查询部门信息
    @Override
    public List<Department> FindDepartment(Map map) {
        return departmentDao.FindDepartment(map);
    }

    //统计总数
    @Override
    public long Total(Map map) {
        return departmentDao.Total(map);
    }

    //下拉框查询部门信息
    @Override
    public List<Department> SelectDepartment(Map map) {
        return departmentDao.SelectDepartment(map);
    }

    //根据department_id查询员工信息
    @Override
    public Department FindDepartmentByDepartmentId(Map map) {
        return departmentDao.FindDepartmentByDepartmentId(map);
    }
}
