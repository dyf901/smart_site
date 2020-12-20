package com.zty.smart_site.service;

import com.zty.smart_site.dao.PartyPersonDao;
import com.zty.smart_site.entity.PartyPerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class PartyPersonService implements PartyPersonDao {
    @Autowired
    private PartyPersonDao partyPersonDao;

    //增加党建人员信息
    @Override
    public int InsertPartyPerson(Map map) {
        return partyPersonDao.InsertPartyPerson(map);
    }

    //删除党建人员信息
    @Override
    public int DeletePartyPerson(Map map) {
        return partyPersonDao.DeletePartyPerson(map);
    }

    //修改党建人员信息
    @Override
    public int UpdatePartyPerson(Map map) {
        return partyPersonDao.UpdatePartyPerson(map);
    }

    //分页查询党建人员信息
    @Override
    public List<PartyPerson> FindPartyPerson(Map map) {
        return partyPersonDao.FindPartyPerson(map);
    }

    //统计总数
    @Override
    public long Total(Map map) {
        return partyPersonDao.Total(map);
    }

    //大屏_党建人员信息
    @Override
    public List<PartyPerson> SelectPartyPerson(Map map) {
        return partyPersonDao.SelectPartyPerson(map);
    }

    //大屏_学习强国排行版
    @Override
    public List<PartyPerson> SelectPartyPersonByIntegral(Map map) {
        return partyPersonDao.SelectPartyPersonByIntegral(map);
    }

    //项目部成员-政治面貌
    @Override
    public List<PartyPerson> CountPartyPersonByState(Map map) {
        return partyPersonDao.CountPartyPersonByState(map);
    }

    //支部党员构成-学历
    @Override
    public List<PartyPerson> CountPartyPersonByEducation(Map map) {
        return partyPersonDao.CountPartyPersonByEducation(map);
    }
}
