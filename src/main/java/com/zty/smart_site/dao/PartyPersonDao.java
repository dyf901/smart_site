package com.zty.smart_site.dao;

import com.zty.smart_site.entity.PartyPerson;

import java.util.List;
import java.util.Map;

public interface PartyPersonDao {
    //增加党建人员信息
    int InsertPartyPerson(Map map);

    //删除党建人员信息
    int DeletePartyPerson(Map map);

    //修改党建人员信息
    int UpdatePartyPerson(Map map);

    //分页查询党建人员信息
    List<PartyPerson> FindPartyPerson(Map map);

    //统计总数
    long Total(Map map);

    //大屏_党建人员信息
    List<PartyPerson> SelectPartyPerson(Map map);

    //大屏_学习强国排行版
    List<PartyPerson> SelectPartyPersonByIntegral(Map map);
}
