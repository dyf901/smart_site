package com.zty.smart_site.dao;

import com.zty.smart_site.entity.AdminStaff;
import com.zty.smart_site.entity.Staff;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface AdminStaffDao {
    //增加管理人员
    int InsertAdminStaff(Map map);

    //删除管理人员
    int DeleteAdminStaff(Map map);

    //修改管理人员信息
    int UpdateAdminStaff(Map map);

    //修改App头像
    int UpdateAdminStaffPicture(Map map);

    //修改App登录密码
    int UpdateAdminStaffPassword(Map map);

    //修改员工在职/离职状态
    int UpdateAdminStaffState(Map map);

    //分页模糊查询管理人员信息
    List<AdminStaff> FindAdminStaff(Map map);

    //统计总数
    long Total(Map map);

    //根据手机号查询员工信息
    AdminStaff FindAdminStaffByStaff_phone(Map map);

    //根据身份证号查询员工信息
    AdminStaff FindAdminStaffByStaff_card(Map map);

    //统计总劳务人员数(单独站点)
    List<AdminStaff> CountAllAdmin(Map map);
}
