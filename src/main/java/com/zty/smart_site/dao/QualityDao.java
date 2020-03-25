package com.zty.smart_site.dao;

import com.zty.smart_site.entity.Quality;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface QualityDao {
    //增加质量隐患类型
    int InsertQuality(Map map);

    //删除质量隐患类型
    int DeleteQuality(Map map);

    //修改质量隐患类型
    int UpdateQuality(Map map);

    //分页模糊查询质量隐患类型
    List<Quality> FindQuality(Map map);

    //统计总数
    long Total(Map map);

    //下拉框查询质量隐患类型
    List<Quality> SelectQuality(Map map);

}
