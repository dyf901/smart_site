package com.zty.smart_site.dao;

import com.zty.smart_site.entity.Conversions;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ConversionsDao {
    //增加兑换记录
    int InsertConversions(Map map);

    //删除兑换记录
    int DeleteConversions(Map map);

    //分页模糊查询兑换记录
    List<Conversions> FindConversions(Map map);

    //统计总数
    long Total(Map map);

    //分页模糊查询个人兑换记录
    List<Conversions> FindConversionsByStaffId(Map map);

    //统计个人总数
    long TotalByStaff(Map map);

    //分页模糊查询个人兑换记录
    List<Conversions> FindConversionsByStaffIdALL(Map map);
}
