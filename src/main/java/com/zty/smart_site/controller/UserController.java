package com.zty.smart_site.controller;

import com.zty.smart_site.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Api(description = "用户接口")
@RestController
@RequestMapping("user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;//用户

    @ApiOperation(value = "增加用户信息",notes = "")
    @PostMapping("/InsertUser")
    public boolean InsertUser(@RequestBody Map map){
        return userService.InsertUser(map)==1;
    }

    @ApiOperation(value = "删除用户信息",notes = "")
    @PostMapping("DeleteUser")
    public boolean DeleteUser(@RequestBody Map map){
        return userService.DeleteUser(map)==1;
    }

    @ApiOperation(value = "修改使用期限(到期时间)",notes = "")
    @PostMapping("UpdateUser")
    public boolean UpdateUser(@RequestBody Map map){
        return userService.UpdateUser(map)==1;
    }
}
