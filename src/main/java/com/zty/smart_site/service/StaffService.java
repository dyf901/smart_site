package com.zty.smart_site.service;

import com.zty.smart_site.dao.StaffDao;
import com.zty.smart_site.entity.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StaffService implements StaffDao {
    @Autowired
    private StaffDao staffDao;//员工

    //增加员工信息
    @Override
    public int InsertStaff(Map map) {
        return staffDao.InsertStaff(map);
    }

    //删除员工信息
    @Override
    public int DeleteStaff(Map map) {
        return staffDao.DeleteStaff(map);
    }

    //修改员工信息
    @Override
    public int UpdateStaff(Map map) {
        return staffDao.UpdateStaff(map);
    }

    //修改app信息
    @Override
    public int UpdateStaffApp(Map map) {
        return staffDao.UpdateStaffApp(map);
    }

    //修改App登录密码
    @Override
    public int UpdateStaffPassword(Map map) {
        return staffDao.UpdateStaffPassword(map);
    }

    //修改员工在职/离职状态
    @Override
    public int UpdateStaffState(Map map) {
        return staffDao.UpdateStaffState(map);
    }

    //修改员工培训状态
    @Override
    public int UpdateStaffTrain(Map map) {
        return staffDao.UpdateStaffTrain(map);
    }

    //修改员工剩余积分
    @Override
    public int UpdateStaffEnd_integral(Map map) {
        return staffDao.UpdateStaffEnd_integral(map);
    }

    //修改员工历史积分
    @Override
    public int UpdateStaffHistory_integral(Map map) {
        return staffDao.UpdateStaffHistory_integral(map);
    }

    //修改员工剩余积分加
    @Override
    public int UpdateStaffEnd_integralJ(Map map) {
        return staffDao.UpdateStaffEnd_integralJ(map);
    }

    //模糊分页查询员工信息
    @Override
    public List<Staff> FindStaff(Map map) {
        return staffDao.FindStaff(map);
    }

    //统计总数(行查后台)
    @Override
    public long Total(Map map) {
        return staffDao.Total(map);
    }

    //根据手机号查询员工信息
    @Override
    public Staff FindStaffByStaff_phone(Map map) {
        return staffDao.FindStaffByStaff_phone(map);
    }

    //根据身份证号查询员工信息
    @Override
    public Staff FindStaffByStaff_card(Map map) {
        return staffDao.FindStaffByStaff_card(map);
    }

    //根据id查询员工信息
    @Override
    public Staff FindStaffById(Map map) {
        return staffDao.FindStaffById(map);
    }

    @Override
    public Staff FindStaffByStaffIdAll(Map map) {
        return staffDao.FindStaffByStaffIdAll(map);
    }

    //根绝position_id查询负责人信息
    @Override
    public Staff FindStaffByPositionId(Map map) {
        return staffDao.FindStaffByPositionId(map);
    }

    //根据工种分组统计人数(选择站点)
    @Override
    public List<Staff> CountByWorktype(Map map) {
        return staffDao.CountByWorktype(map);
    }

    //根据分包单位分组统计人数(选择站点)
    @Override
    public List<Staff> CountBySub(Map map) {
        return staffDao.CountBySub(map);
    }

    //根据人员类型分组统计人数(选择站点)
    @Override
    public List<Staff> CountByType(Map map) {
        return staffDao.CountByType(map);
    }

    //根据地区分组统计人数(选择站点)
    @Override
    public List<Staff> CountByStaffProvince(Map map) {
        return staffDao.CountByStaffProvince(map);
    }

    //根据民族分组统计人数(选择站点)
    @Override
    public List<Staff> CountByStaffNation(Map map) {
        return staffDao.CountByStaffNation(map);
    }

    //根据性别分组统计人数(选择站点)
    @Override
    public List<Staff> CountByStaffSex(Map map) {
        return staffDao.CountByStaffSex(map);
    }

    //统计劳务人员总数(单独站点)
    @Override
    public List<Staff> CountByTypeLW(Map map) {
        return staffDao.CountByTypeLW(map);
    }

    //统计管理人员总数(单独站点)
    @Override
    public List<Staff> CountByTypeGL(Map map) {
        return staffDao.CountByTypeGL(map);
    }

    //按照年龄端分组查询(单独站点)
    @Override
    public List<Staff> CountByStaffAge(Map map) {
        return staffDao.CountByStaffAge(map);
    }

    //统计总数
    @Override
    public int CountAll(Map map) {
        return staffDao.CountAll(map);
    }

    //上传员工二维码
    @Override
    public int InsertStaffCode(Map map) {
        return staffDao.InsertStaffCode(map);
    }
}
