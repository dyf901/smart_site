package com.zty.smart_site.dao;

import com.zty.smart_site.entity.Section;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface SectionDao {
    //增加标段信息
    int InsertSection(Map map);

    //删除标段信息
    int DeleteSection(Map map);

    //修改标段信息
    int UpdateSection(Map map);

    //分页模糊查询标段信息
    List<Section> FindSectioon(Map map);

    //统计总谁
    long Total(Map map);
}
