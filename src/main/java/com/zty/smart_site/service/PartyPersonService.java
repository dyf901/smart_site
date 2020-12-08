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
}
