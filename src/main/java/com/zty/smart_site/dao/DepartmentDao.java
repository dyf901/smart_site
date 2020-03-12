package com.zty.smart_site.dao;

import com.zty.smart_site.entity.Department;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface DepartmentDao {
    //增加部门信息
    int InsertDepartment(Map map);

    //删除部门信息
    int DeleteDepartment(Map map);

    //修改部门信息
    int UpdateDepartment(Map map);

    //分页模糊查询部门信息
    List<Department> FindDepartment(Map map);

    //统计总数
    long Total(Map map);

    //下拉框查询部门信息
    List<Department> SelectDepartment(Map map);
}
