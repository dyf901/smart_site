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

    //根据身份证号查询员工信息
    Staff FindStaffByStaff_card(Map map);

    //根据工种分组统计人数(选择站点)
    List<Staff> CountByWorktype(Map map);

    //根据分包单位分组统计人数(选择站点)
    List<Staff> CountBySub(Map map);

    //根据人员类型分组统计人数(选择站点)
    List<Staff> CountByType(Map map);

    //根据地区分组统计人数(选择站点)
    List<Staff> CountByStaffProvince(Map map);

    //根据民族分组统计人数(选择站点)
    List<Staff> CountByStaffNation(Map map);

    //根据性别分组统计人数(选择站点)
    List<Staff> CountByStaffSex(Map map);

    //统计总劳务人员数(单独站点)
    List<Staff> CountAll(Map map);

    //按照年龄端分组查询(单独站点)
    List<Staff> CountByStaffAge(Map map);
}
