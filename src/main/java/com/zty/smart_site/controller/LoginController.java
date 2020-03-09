package com.zty.smart_site.controller;

import com.zty.smart_site.entity.Msg;
import com.zty.smart_site.entity.Staff;
import com.zty.smart_site.entity.User;
import com.zty.smart_site.service.StaffService;
import com.zty.smart_site.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Api(description = "登录接口")
@RestController
@RequestMapping("login")
@CrossOrigin
public class LoginController {
    @Autowired
    private UserService userService;//用户

    @Autowired
    private StaffService staffService;//员工

    @ApiOperation(value = "PC登陆",notes = "测试数据:")
    @PostMapping("/LoginPc")
    public Msg LoginPc(@RequestBody Map map){
        Msg msg = new Msg();
        User user = userService.FindUserByUsername(map);//根据用户名查询用户信息
        if (user!=null){
            if (user.getPassword().equals(map.get("password"))){
                msg.setMessage("登录成功!");
                return msg;
            }else {
                msg.setMessage("密码错误,登录失败!");
                return msg;
            }
        }else {
            msg.setMessage("用户名不存在!");
            return msg;
        }
    }

    @ApiOperation(value = "App登录",notes = "测试数据:")
    @PostMapping("/LoginApp")
    public Msg LoginApp(@RequestBody Map map){
        Msg msg = new Msg();
        Staff staff = staffService.FindStaffByStaff_phone(map);
        if(staff!=null){
            if (staff.getPassword().equals(map.get("password"))){
                msg.setMessage("登录成功!");
                msg.setData(staff);
                return msg;
            }else {
                msg.setMessage("密码错误,登录成功!");
                return msg;
            }
        }else {
            msg.setMessage("用户不存在!");
            return msg;
        }
    }
}
