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

    @ApiOperation(value = "增加用户信息" , notes = "测试数据:{\"username\":\"交捷交通\",\"password\":\"admin\",\"end_time\":\"2020-5-20\",\"section_id\":1}")
    @PostMapping("/InsertUser")
    public boolean InsertUser(@RequestBody Map map) {
        return userService.InsertUser(map) == 1;
    }

    @ApiOperation(value = "删除用户信息" , notes = "测试数据:{{\"id\":1}}")
    @PostMapping("DeleteUser")
    public boolean DeleteUser(@RequestBody Map map) {
        return userService.DeleteUser(map) == 1;
    }

    @ApiOperation(value = "修改使用期限(到期时间)" , notes = "测试数据:{\"end_time\":\"2020-5-20\",\"id\":1}")
    @PostMapping("UpdateUser")
    public boolean UpdateUser(@RequestBody Map map) {
        return userService.UpdateUser(map) == 1;
    }
}
