package com.zty.smart_site.dao;

import com.zty.smart_site.entity.Staff;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface StaffDao {
    //增加员工信息
    int InsertStaff(Map map);

    //删除员工信息
    int DeleteStaff(Map map);

    //修改员工信息
    int UpdateStaff(Map map);

    //修改App头像
    int UpdateStaffPicture(Map map);

    //修改App登录密码
    int UpdateStaffPassword(Map map);

    //修改员工在职/离职状态
    int UpdateStaffState(Map map);

    //修改员工培训状态
    int UpdateStaffTrain(Map map);

    //模糊分页查询员工信息
    List<Staff> FindStaff(Map map);

    //统计总数(行查后台)
    long Total(Map map);

    //根据手机号查询员工信息
    Staff FindStaffByStaff_phone(Map map);
}
