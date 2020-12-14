package com.zty.smart_site.dao;

import com.zty.smart_site.entity.PartyPhoto;

import java.util.List;
import java.util.Map;

public interface PartyPhotoDao {
    //增加党建相册
    int InsertPartyPhoto(Map map);

    //删除党建相册
    int DeletePartyPhoto(Map map);

    //修改党建相册
    int UpdatePartyPhoto(Map map);

    //分页查询党建相册
    List<PartyPhoto> FindPartyPhoto(Map map);

    //统计总数
    long Total(Map map);

    //大屏_党建相册
    List<PartyPhoto> SelectPartyPhoto(Map map);
}
