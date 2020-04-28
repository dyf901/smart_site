package com.zty.smart_site.service;

import com.zty.smart_site.dao.ConversionsDao;
import com.zty.smart_site.entity.Conversions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ConversionsService implements ConversionsDao {
    @Autowired
    private ConversionsDao conversionsDao;//兑换记录

    //增加兑换记录
    @Override
    public int InsertConversions(Map map) {
        return conversionsDao.InsertConversions(map);
    }

    //删除兑换记录
    @Override
    public int DeleteConversions(Map map) {
        return conversionsDao.DeleteConversions(map);
    }

    //分页模糊查询兑换记录
    @Override
    public List<Conversions> FindConversions(Map map) {
        return conversionsDao.FindConversions(map);
    }

    //统计总数
    @Override
    public long Total(Map map) {
        return conversionsDao.Total(map);
    }

    //分页模糊查询个人兑换记录
    @Override
    public List<Conversions> FindConversionsByStaffId(Map map) {
        return conversionsDao.FindConversionsByStaffId(map);
    }

    //统计个人总数
    @Override
    public long TotalByStaff(Map map) {
        return conversionsDao.TotalByStaff(map);
    }

    @Override
    public List<Conversions> FindConversionsByStaffIdALL(Map map) {
        return conversionsDao.FindConversionsByStaffIdALL(map);
    }
}
