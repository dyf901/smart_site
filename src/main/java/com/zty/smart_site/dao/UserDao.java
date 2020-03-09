package com.zty.smart_site.dao;

import com.zty.smart_site.entity.User;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface UserDao {
    //增加用户信息
    int InsertUser(Map map);

    //删除用户信息
    int DeleteUser(Map map);

    //修改使用期限(到期时间)
    int UpdateUser(Map map);

    //根据username查询用户信息
    User FindUserByUsername(Map map);
}
