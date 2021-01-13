package com.zty.smart_site.dao;

import com.zty.smart_site.entity.ConstructionPhoto;

import java.util.List;
import java.util.Map;

public interface ConstructionPhotoDao {
    //增加施工相册
    int InsertConstructionPhoto(Map map);

    //删除施工相册
    int DeleteConstructionPhoto(Map map);

    //修改施工相册
    int UpdateConstructionPhoto(Map map);

    //分页查询施工相册信息
    List<ConstructionPhoto> FindConstructionPhoto(Map map);

    //统计总数
    long Total(Map map);

    //大屏_施工相册
    List<ConstructionPhoto> SelectConstructionPhoto(Map map);

    //根据id查询施工相册信息
    ConstructionPhoto FindConstructionPhotoById(Map map);
}
