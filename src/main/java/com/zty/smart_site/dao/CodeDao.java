package com.zty.smart_site.dao;

import com.zty.smart_site.entity.Code;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface CodeDao {
    //添加验证码
    int InsertCode(Map map);

    //修改验证码
    int UpdateCode(Map map);

    //根据手机号查询验证码信息
    Code FindCodeByPhone(Map map);
}
