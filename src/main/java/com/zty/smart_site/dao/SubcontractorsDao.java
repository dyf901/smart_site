package com.zty.smart_site.dao;

import com.zty.smart_site.entity.Subcontractors;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface SubcontractorsDao {
    //增加分包单位信息
    int InsertSubcontractors(Map map);

    //删除分包单位信息
    int DeleteSubcontractors(Map map);

    //修改分包单位信息
    int UpdateSubcontractors(Map map);

    //分页模糊查询分包单位信息
    List<Subcontractors> FindSubcontractors(Map map);

    //统计总数
    long Total(Map map);

    //下拉框查询分包单位信息
    List<Subcontractors> SelectSubcontractors(Map map);
}
