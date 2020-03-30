package com.zty.smart_site.dao;

import com.zty.smart_site.entity.Risk;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface RiskDao {
    //增加安全隐患类型
    int InsertRisk(Map map);

    //删除安全隐患类型
    int DeleteRisk(Map map);

    //修改安全隐患类型
    int UpdateRisk(Map map);

    //分页模糊查询安全隐患类型
    List<Risk> FindRisk(Map map);

    //统计总数
    long Total(Map map);

    //下拉框查询安全隐患类型
    List<Risk> SelectRisk(Map map);

}
