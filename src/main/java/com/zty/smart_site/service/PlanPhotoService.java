package com.zty.smart_site.service;

import com.zty.smart_site.dao.PlanPhotoDao;
import com.zty.smart_site.entity.PlanPhoto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PlanPhotoService implements PlanPhotoDao {
    @Autowired
    private PlanPhotoDao planPhotoDao;

    //增加智筹管度图片
    @Override
    public int InsertPlanPhoto(Map map) {
        return planPhotoDao.InsertPlanPhoto(map);
    }

    //删除智筹管度图片
    @Override
    public int DeletePlanPhoto(Map map) {
        return planPhotoDao.DeletePlanPhoto(map);
    }

    //修改智筹管度图片
    @Override
    public int UpdatePlanPhoto(Map map) {
        return planPhotoDao.UpdatePlanPhoto(map);
    }

    //分页模糊查询智筹管度图片
    @Override
    public List<PlanPhoto> FindPlanPhoto(Map map) {
        return planPhotoDao.FindPlanPhoto(map);
    }

    //统计总数
    @Override
    public long Total(Map map) {
        return planPhotoDao.Total(map);
    }

    //智慧工地_智筹管度
    @Override
    public PlanPhoto SelectPlanPhoto(Map map) {
        return planPhotoDao.SelectPlanPhoto(map);
    }
}
