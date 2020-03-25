package com.zty.smart_site.service;

import com.zty.smart_site.dao.AdminStaffDao;
import com.zty.smart_site.entity.AdminStaff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AdminStaffService implements AdminStaffDao {
    @Autowired
    private AdminStaffDao adminStaffDao;//管理人员

    //增加管理人员
    @Override
    public int InsertAdminStaff(Map map) {
        return adminStaffDao.InsertAdminStaff(map);
    }

    //删除管理人员
    @Override
    public int DeleteAdminStaff(Map map) {
        return adminStaffDao.DeleteAdminStaff(map);
    }

    //修改管理人员信息
    @Override
    public int UpdateAdminStaff(Map map) {
        return adminStaffDao.UpdateAdminStaff(map);
    }

    //修改App头像
    @Override
    public int UpdateAdminStaffPicture(Map map) {
        return adminStaffDao.UpdateAdminStaffPicture(map);
    }

    //修改App登录密码
    @Override
    public int UpdateAdminStaffPassword(Map map) {
        return adminStaffDao.UpdateAdminStaffPassword(map);
    }

    //修改离职状态
    @Override
    public int UpdateAdminStaffState(Map map) {
        return adminStaffDao.UpdateAdminStaffState(map);
    }

    //分页模糊查询管理人员信息
    @Override
    public List<AdminStaff> FindAdminStaff(Map map) {
        return adminStaffDao.FindAdminStaff(map);
    }

    //统计总数
    @Override
    public long Total(Map map) {
        return adminStaffDao.Total(map);
    }

    //根据手机号查询管理人员信息
    @Override
    public AdminStaff FindAdminStaffByStaff_phone(Map map) {
        return adminStaffDao.FindAdminStaffByStaff_phone(map);
    }

    //根据身份证号查询管理人员信息
    @Override
    public AdminStaff FindAdminStaffByStaff_card(Map map) {
        return adminStaffDao.FindAdminStaffByStaff_card(map);
    }

    //统计管理人员总数(全部站点)
    @Override
    public List<AdminStaff> CountAllAdmin(Map map) {
        return adminStaffDao.CountAllAdmin(map);
    }
}
