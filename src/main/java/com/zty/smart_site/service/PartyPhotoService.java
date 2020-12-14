package com.zty.smart_site.service;

import com.zty.smart_site.dao.PartyPhotoDao;
import com.zty.smart_site.entity.PartyPhoto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PartyPhotoService implements PartyPhotoDao {
    @Autowired
    private PartyPhotoDao partyPhotoDao;

    //增加党建相册
    @Override
    public int InsertPartyPhoto(Map map) {
        return partyPhotoDao.InsertPartyPhoto(map);
    }

    //删除党建相册
    @Override
    public int DeletePartyPhoto(Map map) {
        return partyPhotoDao.DeletePartyPhoto(map);
    }

    //修改党建相册
    @Override
    public int UpdatePartyPhoto(Map map) {
        return partyPhotoDao.UpdatePartyPhoto(map);
    }

    //分页查询党建相册
    @Override
    public List<PartyPhoto> FindPartyPhoto(Map map) {
        return partyPhotoDao.FindPartyPhoto(map);
    }

    //统计总数
    @Override
    public long Total(Map map) {
        return partyPhotoDao.Total(map);
    }

    //大屏_党建相册
    @Override
    public List<PartyPhoto> SelectPartyPhoto(Map map) {
        return partyPhotoDao.SelectPartyPhoto(map);
    }
}
