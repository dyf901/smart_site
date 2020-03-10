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

    //修改App头像
    @Override
    public int UpdateStaffPicture(Map map) {
        return staffDao.UpdateStaffPicture(map);
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
}
