package com.zty.smart_site.service;

import com.zty.smart_site.dao.TitleDao;
import com.zty.smart_site.entity.Title;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TitleService implements TitleDao {
    @Autowired
    private TitleDao titleDao;

    //根据id查询图标信息
    @Override
    public Title FindById(Long id) {
        return titleDao.FindById(id);
    }

    //增加图标信息
    @Override
    public int InsertTitle(Map map) {
        return 0;
    }
}
