package com.zty.smart_site.service;

import com.zty.smart_site.dao.UserDao;
import com.zty.smart_site.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserService implements UserDao {
    @Autowired
    private UserDao userDao;//用户

    //增加用户信息
    @Override
    public int InsertUser(Map map) {
        return userDao.InsertUser(map);
    }

    //删除用户信息
    @Override
    public int DeleteUser(Map map) {
        return userDao.DeleteUser(map);
    }

    //修改使用期限(到期时间)
    @Override
    public int UpdateUser(Map map) {
        return userDao.UpdateUser(map);
    }

    //根据username查询用户信息
    @Override
    public User FindUserByUsername(Map map) {
        return userDao.FindUserByUsername(map);
    }
}
