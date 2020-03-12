package com.zty.smart_site.service;

import com.zty.smart_site.dao.SectionDao;
import com.zty.smart_site.entity.Section;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SectionService implements SectionDao {
    @Autowired
    private SectionDao sectionDao;//标段

    //增加标段信息
    @Override
    public int InsertSection(Map map) {
        return sectionDao.InsertSection(map);
    }

    //删除标段信息
    @Override
    public int DeleteSection(Map map) {
        return sectionDao.DeleteSection(map);
    }

    //修改标段信息
    @Override
    public int UpdateSection(Map map) {
        return sectionDao.UpdateSection(map);
    }

    //分页模糊查询标段信息
    @Override
    public List<Section> FindSectioon(Map map) {
        return sectionDao.FindSectioon(map);
    }

    //统计总数
    @Override
    public long Total(Map map) {
        return sectionDao.Total(map);
    }
}
