package com.zty.smart_site.dao;

import com.zty.smart_site.entity.PlanPhoto;

import java.util.List;
import java.util.Map;

public interface PlanPhotoDao {
    //增加智筹管度图片
    int InsertPlanPhoto(Map map);

    //删除智筹管度图片
    int DeletePlanPhoto(Map map);

    //修改智筹管度图片
    int UpdatePlanPhoto(Map map);

    //分页模糊查询智筹管度图片
    List<PlanPhoto> FindPlanPhoto(Map map);

    //统计总数
    long Total(Map map);

    //智慧工地_智筹管度
    PlanPhoto SelectPlanPhoto(Map map);
}
