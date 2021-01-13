package com.zty.smart_site.service;

import com.zty.smart_site.dao.ConstructionPhotoDao;
import com.zty.smart_site.entity.ConstructionPhoto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ConstructionPhotoService implements ConstructionPhotoDao {
    @Autowired
    private ConstructionPhotoDao constructionPhotoDao;

    //增加施工相册
    @Override
    public int InsertConstructionPhoto(Map map) {
        return constructionPhotoDao.InsertConstructionPhoto(map);
    }

    //删除施工相册
    @Override
    public int DeleteConstructionPhoto(Map map) {
        return constructionPhotoDao.DeleteConstructionPhoto(map);
    }

    //修改施工相册
    @Override
    public int UpdateConstructionPhoto(Map map) {
        return constructionPhotoDao.UpdateConstructionPhoto(map);
    }

    //分页查询施工相册信息
    @Override
    public List<ConstructionPhoto> FindConstructionPhoto(Map map) {
        return constructionPhotoDao.FindConstructionPhoto(map);
    }

    //统计总数
    @Override
    public long Total(Map map) {
        return constructionPhotoDao.Total(map);
    }

    //大屏_施工相册
    @Override
    public List<ConstructionPhoto> SelectConstructionPhoto(Map map) {
        return constructionPhotoDao.SelectConstructionPhoto(map);
    }

    //根据id查询施工相册信息
    @Override
    public ConstructionPhoto FindConstructionPhotoById(Map map) {
        return constructionPhotoDao.FindConstructionPhotoById(map);
    }
}
