package com.zty.smart_site.dao;

import com.zty.smart_site.entity.Qualityshow;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface QualityshowDao {
    //增加质量安全隐患记录
    int InsertQualityShow(Map map);

    //删除质量安全隐患记录
    int DeleteQualityShow(Map map);

    //分页模糊查询质量安全隐患记录
    List<Qualityshow> FindQualityShow(Map map);

    //统计总数
    long Total(Map map);
}
