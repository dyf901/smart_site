package com.zty.smart_site.dao;

import com.zty.smart_site.entity.Title;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface TitleDao {
    //根据id查询图标信息
    Title FindById(Long id);

    //增加图标信息
    int InsertTitle(Map map);
}
