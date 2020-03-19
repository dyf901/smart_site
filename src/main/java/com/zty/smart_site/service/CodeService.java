package com.zty.smart_site.service;

import com.zty.smart_site.dao.CodeDao;
import com.zty.smart_site.entity.Code;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CodeService implements CodeDao {
    @Autowired
    private CodeDao codeDao;//验证码

    //添加验证码
    @Override
    public int InsertCode(Map map) {
        return codeDao.InsertCode(map);
    }

    //修改验证码
    @Override
    public int UpdateCode(Map map) {
        return codeDao.UpdateCode(map);
    }

    //根据手机号查询验证码信息
    @Override
    public Code FindCodeByPhone(Map map) {
        return codeDao.FindCodeByPhone(map);
    }
}
